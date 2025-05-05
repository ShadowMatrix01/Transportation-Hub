
/**
 * Author: Jhan Gomez
 * Date: 5/5/25
 * Version 1.0.4
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
public class Ferry extends Hub implements Transport //A public class called ferry that extends hub and implements transport is made.
{ //Start of the class Ferry.
    private String manufacturer, captain, pilot, route, condition; //Several private string objects are made.
    private int capacity, fuel, boatRegistration, minimum; //Several integer objects are made.
    @Override //The transport setStringDescriptors method is overriden.
    public void setStringDescriptors(String manufacturer, String captain, String pilot, String route, String condition) //setStringMethod has its parameters defined.
    { //Start of the setStringDescriptors method.
      this.manufacturer=manufacturer; //Stores the passed in manufacturer as being the object manufacturer.
      this.captain=captain;//Stores the passed in captain as being the object captain.
      this.pilot=pilot;//Stores the passed in pilot as being the object pilot.
      this.route=route;//Stores the passed in route as being the object route.
      this.condition=condition;//Stores the passed in condition as being the object .
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
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nRegistration Number: " + boatRegistration + "." + "\nFuel: "  + fuel + " gallons of gasoline/diesel/mixed fuel." + "\nRoute: " + route + "." 
        + "\nCaptain: " + captain + "."+ "\nCopilot: " + pilot + "." + "\nSouls on Board: " + capacity + ".";
        //The appropriate objects are returned to allow the linkedlist to work.
    } //End of the toString method.
 } //End of the ferry class.
