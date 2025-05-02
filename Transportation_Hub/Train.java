
/**
 * Author: Jhan Gomez
 * Date: 5/2/25
 * Version 1.0.2
 * Purpose: To show a program that utilizes stacks, queues, linkedlists, sorting algorithms,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, and collections.
 */
import java.util.*;
public class Train extends Hub implements Transport 
{   
    private String manufacturer, engineer, conductor, route, condition;
    private int capacity, fuel, journeyNumber;
    @Override
    public void setStringDescriptors(String manufacturer, String engineer, String conductor, String route, String condition) {
      this.manufacturer=manufacturer;
       this.engineer=engineer;
       this.conductor=conductor;
       this.route=route;
       this.condition=condition;
    }
    @Override
    public void setIntegerDescriptors(int fuel, int capacity, int journeyNumber) {
        this.fuel=fuel;
        this.capacity=capacity;
        this.journeyNumber=journeyNumber;
    }
    @Override
    public String toString() {
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nJourney Number: " + journeyNumber + "." + "\nFuel: "  + fuel + " gallons of Diesel fuel." + "\nRoute: " + route + "." 
        + "\nEngineer: " + engineer + "."+ "\nConductor: " + conductor + "." + "\nPassengers: " + capacity + ".";
    }
    public int removePassenger(int passenger, ArrayList<Integer> trainPassengers)  //Allows a passenger to be removed by checking if such a passenger exists.
    { //Start of removePassenger method.
       Random pickReason=new Random();
       String [] randomReasons={"unruly behavior", "drunkeness", "lack of fare", "refunded ticket", "ban", "incorrect destination", "not knowing about java"};
       boolean checkIfFound=trainPassengers.contains(passenger);
       if (checkIfFound) {
           int pick=pickReason.nextInt(randomReasons.length); //.length is what allows the iteration through the array to happen.
           String finalPick=randomReasons[pick];
           trainPassengers.remove(passenger);
           System.out.println("Passenger #" + passenger + " was removed from the train due to " + finalPick);
           return 1;
       } else {
           System.out.println("No such passenger is onboard the train");
           return 0;
       }
  }
}
