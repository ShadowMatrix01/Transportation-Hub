
/**
 * Author: Jhan Gomez
 * Date: 5/7/25
 * Version 1.0.5
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*; //java util package imported.
public class Bus extends Hub implements Transport //Bus class with hub extended and transport implemented is made.
{ //Start of the bus class.
    private String manufacturer, driver, fareInspector, route, condition, temp;  //private string objects are made.
    private int capacity, fuel, busLicense, minimum; //private integer object are made.
    @Override //setStringDescriptors is overriden.
    public void setStringDescriptors(String manufacturer, String driver, String fareInspector, String route, String condition) //parameters for setStringDescriptors is defined.
    { //Start of the setStringDescriptors method.
       this.manufacturer=manufacturer; //manufacturer passed in set to manufacturer object.
       this.driver=driver;  //driver passed in set to driver object.
       this.fareInspector=fareInspector;  //fareInspector passed in set to fareInspector object.
       this.route=route;  //route passed in set to route object.
       this.condition=condition;  //condition passed in set to condition object.
    } //End of the setStringDesciptors method.
    @Override //setIntegerDescriptors method is overriden.
    public void setIntegerDescriptors(int fuel, int capacity, int busLicense)  //setIntegerDescriptors method has its parameters defined.
    { //start of the setIntegerDescriptors method.
       this.fuel=fuel;  //fuel passed in set to fuel object.
       this.capacity=capacity;  //capacity passed in set to capacity object.
       this.busLicense=busLicense;  //busLicense passed in set to busLicense object.
    } //end of the setIntegerDescriptors method.
    @Override //To string method overriden to allow linkedlist and hashmap to work properly.
    public String toString() //toString method declared.
    {//Start of to string method.
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nBus License: " + busLicense + "." + "\nFuel: "  + fuel + " gallons of Diesel fuel." + "\nRoute: " + route + "." 
        + "\nDriver: " + driver + "."+ "\nFare Inspector: " + fareInspector + "." + "\nPassengers: " + capacity + ".";
        //The data that was passed in is returned to be added to the linkedlist and hashmap.
    } //End of toString method.
    public int removePassenger(int passenger, ArrayList<Integer> busPassengers)  //Allows a passenger to be removed by checking if such a passenger exists.
    { //Start of removePassenger method.
       Integer preventer=passenger; //MUST BE CAST AS NONPRIMITVE OTHERWISE WEIRD ERROR WHERE INDEX RATHER THAN VALUE IS REMOVED!
       Random pickReason=new Random(); //A new random object is created.
       String [] randomReasons={"unruly behavior", "drunkeness", "lack of fare", "refunded ticket", "ban", "incorrect destination", "not knowing about java"};
       //Allows a random reason to be used for why the passenger was booted of the bus.
       boolean checkIfFound=busPassengers.contains(preventer); //A boolean that checks if the passenger is withing busPassengers is made.
       if (checkIfFound)  //If such a value is found this will run.
       { //Start of if statement.
           int pick=pickReason.nextInt(randomReasons.length); //.length is what allows the iteration through the array to happen.
           String finalPick=randomReasons[pick]; //String finalPick is assigned to one of the random reasons using the number assgined to pick.
           System.out.println("Passenger #" + preventer + " was removed from the train due to " + finalPick); //Tells the user that the passenger was removed due to some reason.
           busPassengers.remove(preventer); //the passenger is removed from the arrayList.
           return 1; //1 is returned to indicate a sucess.
       } else //Else if such a passenger is not found this will run.
       { //Start of else statement.
           System.out.println("No such passenger is onboard the bus"); //Tells the user no such passenger exist.
           return 0; //0 is returned to indicate a failure.
       } //End of else statement,
  } //End of removePassenger method.
} //End of class Bus
