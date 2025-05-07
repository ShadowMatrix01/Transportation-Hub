
/**
 * Author: Jhan Gomez
 * Date: 5/7/25
 * Version 1.0.5
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*; //java util package imported.
public class Ferry extends Hub implements Transport //A public class called ferry that extends hub and implements transport is made.
{ //Start of the class Ferry.
    private String manufacturer, captain, pilot, route, condition, type; //Several private string objects are made.
    private int capacity, fuel, boatRegistration, minimum; //Several integer objects are made.
    @Override //The transport setStringDescriptors method is overriden.
    public void setStringDescriptors(String manufacturer, String captain, String pilot, String route, String condition, String type) //setStringMethod has its parameters defined.
    { //Start of the setStringDescriptors method.
      this.manufacturer=manufacturer; //Stores the passed in manufacturer as being the object manufacturer.
      this.captain=captain;//Stores the passed in captain as being the object captain.
      this.pilot=pilot;//Stores the passed in pilot as being the object pilot.
      this.route=route;//Stores the passed in route as being the object route.
      this.condition=condition;//Stores the passed in condition as being the object .
      this.type=type;//Stores the passed in condition as being the object .
    } //End of the setStringDescriptors method.
    @Override //setIntegerDescriptors method is overriden.
    public void setIntegerDescriptors(int fuel, int capacity, int boatRegistration)  //setIntegerDescriptors has its parameters formaly defined.
    { //Start of the setIntegerDescriptors method.
      this.fuel=fuel; //Stores the passed in fuel as being the object fuel.
      this.capacity=capacity;//Stores the passed in capacity as being the object capacity.
      this.boatRegistration=boatRegistration;//Stores the passed in registration as being the object registration.
    } //End of the setIntegerDescriptors method.
     @Override //toString method is overriden.
    public String toString() //toString method is declared.
    { //Start of the toString method.
        return "\n\nType: " + type +"\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nRegistration Number: " + boatRegistration + "." + "\nFuel: "  + fuel + " gallons of gasoline/diesel/mixed fuel." + "\nRoute: " + route + "." 
        + "\nCaptain: " + captain + "."+ "\nCopilot: " + pilot + "." + "\nSouls on Board: " + capacity + ".";
        //The appropriate objects are returned to allow the linkedlist to work.
    } //End of the toString method.
    public int removePassenger(int passenger, ArrayList<Integer> boatPassengers)  //Allows a passenger to be removed by checking if such a passenger exists.
    { //Start of removePassenger method.
       Integer preventer=passenger; //MUST BE CAST AS NONPRIMITVE OTHERWISE WEIRD ERROR WHERE INDEX RATHER THAN VALUE IS REMOVED!
       Random pickReason=new Random(); //A new random object is created.
       String [] randomReasons={"unruly behavior.", "drunkeness.", "a lack of fare.", "a refunded ticket.", "being bannned.", "having the incorrect destination.", "not knowing about java."};
       //Allows a random reason to be used for why the passenger was booted of the plane.
       boolean checkIfFound=boatPassengers.contains(preventer); //A boolean that checks if the passenger is withing boatPassengers is made.
       if (checkIfFound)  //If such a value is found this will run.
       { //Start of if statement.
           int pick=pickReason.nextInt(randomReasons.length); //.length is what allows the iteration through the array to happen.
           String finalPick=randomReasons[pick]; //String finalPick is assigned to one of the random reasons using the number assgined to pick.
           System.out.println("Passenger #" + preventer + " was removed from the boat due to " + finalPick); //Tells the user that the passenger was removed due to some reason.
           boatPassengers.remove(preventer); //the passenger is removed from the arrayList.
           return 1; //1 is returned to indicate a sucess.
       } else //Else if such a passenger is not found this will run.
       { //Start of else statement.
           System.out.println("No such passenger is onboard the boat"); //Tells the user no such passenger exist.
           return 0; //0 is returned to indicate a failure.
       } //End of else statement,
  } //End of removePassenger method. 
 } //End of the ferry class.
