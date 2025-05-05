
 
/**
 * Author: Jhan Gomez
 * Date: 5/5/25
 * Version 1.0.4
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
//To-Do add thread sleep to allow a better experience.
import java.util.*; //java util package is imported in.
public class Airplane extends Hub implements Transport //a public class called airplane which extends ahub and implements transport is made.
{ //Start of the airplane class.
    private String manufacturer, captain, copilot, route, condition, temp; //private objects are made.
    private int capacity, fuel, airRegistration, minimum; //private integer objects are made.
    @Override //setStringDescriptors is overriden.
    public void setStringDescriptors(String manufacturer, String captain, String copilot, String route, String condition)  //setStringDescriptors has its parameters defined.
    { //Start of the setStringDescriptors method.
       this.manufacturer=manufacturer; //manufacturer passed in is set to the manufacturer object.
       this.copilot=copilot;//copilot passed in is set to the copilot object.
       this.captain=captain;//captain passed in is set to the captain object.
       this.route=route;//route passed in is set to the route object.
       this.condition=condition;//condition passed in is set to the condtion object.
    } //End of the setStringDescriptors method.
    @Override //setIntegerDescriptors method is overriden.
    public void setIntegerDescriptors(int fuel, int capacity, int airRegistration) //setIntegerDescriptors has its parameters defined.
    { //Start of the setIntegerDescriptors method.
        this.fuel=fuel; //fuel passed in is set to fuel object.
        this.capacity=capacity;//capacity passed in is set to the capacity object.
        this.airRegistration=airRegistration;//airRegistration passed in is set to the airRegistration object.
    } //End of the setIntegerDescriptors method.
    public int lunchService(int capacity_two) //a lunch service method which accepts an integer called capacity two is made. It is recursive.
    { //Start of the lunchService method.
        System.out.print("Passenger #" + capacity_two + " was served their meal! "); //The message that a passenger was served their meal is printed.
        if (capacity_two < 1) //If a value less than 1 is inputted, this will run.
        { //Start of the if statement.
            System.out.println("There are no passengers on the plane to serve food to"); //Tells the user there is no one to serve lunch to.
            return 1; //1 is returned to indicate the process is done.
        } //End of the if statement.
        if (capacity_two==1) //If capacity two is equal to 1, this will run.
        { //Start of the if statement.
            System.out.println("\nThe person in the front of the aircraft was served lunch and drinks!"); //Tells the user that the person in the front of the airplane was served their meal.
            return 1; //1 is returned to indicate the process is done.
        } if (capacity_two % 4==1) //An if statment checks if the current passenger number has modulous remainder of 1.
        { //Start of the if statement.
            System.out.print("\n"); //new line is printed.
        } //End of the if statement.
        return lunchService(capacity_two - 1);//lunchService has capacity two -1 recursively called and returned.
    } //End of the lunchServive method.
    public void lunchService(ArrayList<String> crew, String time) //another lunchService method to demonstrate method overloading, it accepts an arrayList and String called time. 
    { //Start of the lunchService method.
        for (int i=1; i<crew.size(); i++) //A for loop that runs for the size of the crew arrayList is made.
        { //Start of the for loop.
        System.out.println("Crew member " + crew.get(i) + " was served their meal at " + time + "!"); //The message that crewMember was served their meal is printed.
        if (crew.size() < 1) //If a value less than 1 is inputted, this will run.
        { //Start of the if statement.
            System.out.println("There are no passengers on the plane to serve food to"); //Tells the user there is no one to serve lunch to.
        } //End of the if statement.
        if (crew.size()==1) //If capacity two is equal to 1, this will run.
        { //Start of the if statement.
            System.out.println("\nThe person in the front of the aircraft was served lunch and drinks at " + time); //Tells the user that the person in the front of the airplane was served their meal.
            System.out.print("\n"); //new line is printed.
        } //End of the if statement.
    } //End of the for loop.
    } //End of the lunchServive method.
     public String selectionSortAirplaneLuggage(ArrayList<String> luggage) //selectionSortAirplaneLuggage method has the ArrayList luggage passed in.
     { //Start of the selectionSortTrainLuggage method.
        for (int i=0; i<luggage.size() - 1; i++) //A for loop that runs for the size of the luggage arrayList is made.
        { //Start of the for loop.
            minimum=i; //minimum is set to i.
            for (int j=i + 1; j<luggage.size() -1; j++)  //A for loop that runs for the size of luggage and is one higher then i is made.
            { //Start of the for loop.
                if (luggage.get(j).compareTo(luggage.get(minimum)) < 0) //If the value of j is smaller than the luggage for minimum a swap can be done.
                { //Start of if statement.
                    minimum=j;  //Minimum is set to J.
                } //End of if statement.
            } //End of for loop.
            if (minimum!= i) //Important: This checks if minimum is not equal to i, 
            //if its not, it means a new minimum was found and a swap is ready to be done.
            { //Start of the if statement.
            Collections.swap(luggage, i, minimum); //Collections .swap method is called where i and the new minimum are swapped.
        } //End of the the if statement.
        } //End of the for loop.
        return "Luggage owners has been sorted alphabetically!"; //A message that tells the user the list was sorted alphabeticaly.
    } //End of the selectionSortAirplaneLuggage method.
    @Override //toString method is overriden.
    public String toString() //toString method is declared.
    { //Start of the toString method.
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nRegistration Number: " + airRegistration + "." + "\nFuel: "  + fuel + " gallons of JetFuel/AVGAS." + "\nRoute: " + route + "." 
        + "\nCaptain: " + captain + "."+ "\nCopilot: " + copilot + "." + "\nSouls on Board: " + capacity + ".";
        //The appropriate objects are returned to allow the linkedlist to work.
    } //End of the toString method.
}//End of the class Airplane.
