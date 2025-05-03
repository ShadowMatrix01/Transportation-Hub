
/**
 * Author: Jhan Gomez
 * Date: 5/3/25
 * Version 1.0.3
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*;
public class Train extends Hub implements Transport
{   
    private String manufacturer, engineer, conductor, route, condition;
    private int capacity, fuel, journeyNumber, minimum;
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
       Integer preventer=passenger; //MUST BE CAST AS NONPRIMITVE OTHERWISE WEIRD ERROR WHERE INDEX RATHER THAN VALUE IS REMOVED!
       Random pickReason=new Random();
       String [] randomReasons={"unruly behavior", "drunkeness", "lack of fare", "refunded ticket", "ban", "incorrect destination", "not knowing about java"};
       boolean checkIfFound=trainPassengers.contains(preventer);
       if (checkIfFound) {
           int pick=pickReason.nextInt(randomReasons.length); //.length is what allows the iteration through the array to happen.
           String finalPick=randomReasons[pick];
           System.out.println("Passenger #" + preventer + " was removed from the train due to " + finalPick);
           trainPassengers.remove(preventer);
           return 1;
       } else {
           System.out.println("No such passenger is onboard the train");
           return 0;
       }
  }
  public String selectionSortTrainLuggage(ArrayList<String> luggage) {
        for (int i=0; i<luggage.size() - 1; i++) {
            minimum=i;
            for (int j=i + 1; j<luggage.size() -1; j++) {
                if (luggage.get(j).compareTo(luggage.get(minimum)) < 0) {
                    minimum=j;  
                }
            }
            if (minimum!= i) //Important: This checks if minimum is not equal to i, 
            //if its not, it means a new minimum was found and a swap is ready to be done.
            { //Start of the if statement.
            Collections.swap(luggage, i, minimum); //Collections .swap method is called where i and the new minimum are swapped.
        }
        }
        return "Luggage owners has been sorted alphabetically!";
    }
}
