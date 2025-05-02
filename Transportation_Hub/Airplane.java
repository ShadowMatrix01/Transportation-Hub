
 
/**
 * Author: Jhan Gomez
 * Date: 5/2/25
 * Version 1.0.2
 * Purpose: To show a program that utilizes stacks, queues, linkedlists, sorting algorithms,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, and collections.
 */
import java.util.*;
public class Airplane extends Hub implements Transport
{
    private String manufacturer, captain, copilot, route, condition;
    private int capacity, fuel, airRegistration;
    @Override
    public void setStringDescriptors(String manufacturer, String captain, String copilot, String route, String condition) {
       this.manufacturer=manufacturer;
       this.copilot=copilot;
       this.captain=captain;
       this.route=route;
       this.condition=condition;
    }
    @Override
    public void setIntegerDescriptors(int fuel, int capacity, int airRegistration) {
        this.fuel=fuel;
        this.capacity=capacity;
        this.airRegistration=airRegistration;
        //lunchService(capacity);
    }
    public int lunchService(int capacity_two) {
        System.out.print("Passenger #" + capacity_two + " was served their meal! ");
        if (capacity_two < 1) {
            System.out.println("There are no passengers on the plane to serve food to");
            return 1;
        }
        if (capacity_two==1) {
            System.out.println("\nThe person in the front of the aircraft was served lunch and drinks!");
            return 1;
        } if (capacity_two % 4==1) {
            System.out.print("\n");
        }
        return lunchService(capacity_two - 1);
    }
    @Override
    public String toString() {
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nRegistration Number: " + airRegistration + "." + "\nFuel: "  + fuel + " gallons of JetFuel/AVGAS." + "\nRoute: " + route + "." 
        + "\nCaptain: " + captain + "."+ "\nCopilot: " + copilot + "." + "\nSouls on Board: " + capacity + ".";
    }
}
