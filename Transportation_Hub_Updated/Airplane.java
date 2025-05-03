
 
/**
 * Author: Jhan Gomez
 * Date: 5/3/25
 * Version 1.0.3
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*;
public class Airplane extends Hub implements Transport
{
    private String manufacturer, captain, copilot, route, condition, temp;
    private int capacity, fuel, airRegistration, minimum;
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
    public String selectionSortAirplaneLuggage(ArrayList<String> luggage) {
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
    @Override
    public String toString() {
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nRegistration Number: " + airRegistration + "." + "\nFuel: "  + fuel + " gallons of JetFuel/AVGAS." + "\nRoute: " + route + "." 
        + "\nCaptain: " + captain + "."+ "\nCopilot: " + copilot + "." + "\nSouls on Board: " + capacity + ".";
    }
}
