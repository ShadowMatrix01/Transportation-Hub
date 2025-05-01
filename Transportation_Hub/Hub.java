 
/**
 * Author: Jhan Gomez
 * Date: 5/1/25
 * Version 1.0.1
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, and collections.
 */
import java.util.*;
public class Hub
{ //To-Do: Add Hashmap somewhere! Sorting aswell!
    public static void main(String [] args) {
        Scanner desc=new Scanner(System.in);
        LinkedList<Object> placeHolder=new LinkedList<>();
        while (true) {
        try {
        System.out.println("\nWelcome to the Transportation Hub. From here, you can choose a form of transportation and file the appropriate data."
        + "\nYou may choose to add as many of these options as you see fit. At the end, you may choose to either continue or quit and print. \nPlease select an option."
        + "\n---->[1] Airplane\n---->[2] Train\n---->[3] Ferry\n---->[4] Bus\n---->[5] Print Data and Quit\n");
        System.out.println("Input a number listed above, please");
        int input=desc.nextInt();
        desc.nextLine(); //To allow an input for the manufacturer to work.
        if (input==1) {
            Airplane plane=new Airplane();
            Stack<Integer> toUnloadPlane=new Stack<>();
            System.out.println("Enter the Manufacturer of the Airplane. Example: Boeing");
            String manufacturer=desc.nextLine();
            System.out.println("Enter the amount of cargo oboard");
            int cargoToLoadPlane=desc.nextInt();
            desc.nextLine();
            System.out.println("Enter the full name of the captain (last name, first name)");
            String captain=desc.nextLine();
            System.out.println("Enter the full name of the copilot (last name, first name)");
            String copilot=desc.nextLine();
            System.out.println("Enter the route (Example: Boston, Massachussets, U.S.A. to Phoenix, Arizona, U.S.A,)");
            String route=desc.nextLine();
            System.out.println("Enter the condition of the aircraft");
            String condition=desc.nextLine();
            System.out.println("Enter the airplane registration number");
            int airRegistration=desc.nextInt();
            System.out.println("Enter the amount of fuel of the airplane in gallons");
            int fuel=desc.nextInt();
            System.out.println("Enter the amount of passengers onboard");
            int capacity=desc.nextInt();
            desc.nextLine();
            System.out.println("Would you like to see the cargo being loaded? Type Y or y if you would like to see this process.\n");
            String process=desc.nextLine();
            if (process.equalsIgnoreCase("Y")) {
            System.out.println("Cargo is being loaded on...");
            for (int i=1; i<=cargoToLoadPlane; i++) {
                toUnloadPlane.push(i);
                System.out.print("Cargo #" + i + " was loaded on to the plane! ");
                if (i % 4 ==1)  {
                System.out.print("\n");
                }
            }
            System.out.println("\n");
            }
            plane.setStringDescriptors(manufacturer, captain, copilot, route, condition);
            plane.setIntegerDescriptors(fuel, capacity, airRegistration);
            placeHolder.add(plane);
            System.out.println("Would you like to see how the flight attendants will serve lunch on the plane? Type Y or y if so, please!");
            String lunchTime=desc.nextLine();
            if (lunchTime.equalsIgnoreCase("Y")) {
                plane.lunchService(capacity);
            }
            System.out.println("The plane has landed! Would you like to see the cargo being unloaded? Type Y or y if you would like to see the process!\n");
            String process_two=desc.nextLine();
            if (process_two.equalsIgnoreCase("Y")) {
            System.out.println("\nCargo will be unloaded now, due to how loading cargo works, the cargo that went in first will come out last!");
            for (int i=1; i<=cargoToLoadPlane; i++) {
                System.out.print("Cargo #" + toUnloadPlane.pop() + " was unloaded off of the plane! ");
                if (i % 4 == 1) {
                System.out.print("\n");
                }
                if (toUnloadPlane.empty()) {
                System.out.println("\nThe last piece of cargo was unloaded of the plane!");
                }
            }
            }
            } else if (input==2) {
               Train locomotive=new Train();
            } else if (input==3) {
               Ferry ship=new Ferry();
            } else if (input==4) {
               Bus autobus=new Bus();
            } else {
            System.out.println("Gathering today's data...");
            Iterator<Object> iterator = placeHolder.iterator();
            if (!iterator.hasNext()) {
                System.out.println("There is nothing to print, shutting down...");
                break;
            }
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            break;
        }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Taking you back to the start of the program!");
            desc.nextLine();
        }
        }
    }
}
