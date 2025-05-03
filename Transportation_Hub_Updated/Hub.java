 
/**
 * Author: Jhan Gomez
 * Date: 5/3/25
 * Version 1.0.3
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*;
public class Hub
{ //To-Do: Add sorting and array somewhere.
    public static void main(String [] args) {
        String type="";
        Scanner desc=new Scanner(System.in);
        LinkedList<Object> placeHolder=new LinkedList<>();
        HashMap<Integer, Object> lookUp=new HashMap<>();
        while (true) {
        try {
        System.out.println("\nWelcome to the Transportation Hub. From here, you can choose a form of transportation and file the appropriate data."
        + "\nYou may choose to add as many of these options as you see fit. At the end, you may choose to either continue or quit and print. \nPlease select an option."
        + "\n---->[1] Airplane\n---->[2] Train\n---->[3] Ferry\n---->[4] Bus\n---->[5] Look Up Data by Registration/Journey Number\n---->[6] Print All Data and Quit\n");
        System.out.println("Input a number listed above, please");
        int input=desc.nextInt();
        desc.nextLine(); //To allow an input for the manufacturer to work.
        if (input==1) {
            ArrayList<String> luggageToAdd=new ArrayList<>();
            type="AIRPLANE";
            Airplane plane=new Airplane();
            Stack<Integer> toUnloadPlane=new Stack<>();
            Queue<String> passengerBoard= new LinkedList<>();
            System.out.println("Enter the Manufacturer of the Airplane. Example: Boeing");
            String manufacturer=desc.nextLine();
            System.out.println("Enter the amount of cargo oboard");
            Integer cargoToLoadPlane=desc.nextInt();
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
            int airRegistration=0;
            while (true) {
            airRegistration=desc.nextInt();
            if (lookUp.containsKey(airRegistration)) { //Prevents the same value from being used as a key and forces the user to choose a valid one.
                System.out.println("Sorry, that number is already being used, please try again");
                desc.nextLine();
                System.out.println("Enter the airplane registration number");
            } else {
                System.out.println("Great, thats a valid number!\n");
                break;
            }
            }
            System.out.println("Enter the amount of fuel of the airplane in gallons");
            int fuel=desc.nextInt();
            System.out.println("Enter the amount of passengers onboard");
            int capacity=desc.nextInt();
            desc.nextLine();
            System.out.println("Enter the owners of the luggage on the plane (Last Name, First Name). It will be sorted. (Enter Stop to Quit)");
            while (true) { //Allows luggage to be added with the owners names.
                String luggage=desc.nextLine();
                if (luggage.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                  luggageToAdd.add(luggage);
                }
            }
            System.out.println("Enter the boarding groups in order. (Enter Stop to Quit)");
            while (true) { //Allows groups to be called out rather than passengers which would be tedious.
                String board=desc.nextLine();
                if (board.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                passengerBoard.add(board);
                }
            }
            desc.nextLine();
            System.out.println("Would you like to see the cargo being loaded? (Enter Y or N)\n");
            String process=desc.nextLine();
            if (process.equalsIgnoreCase("Y")) {
               if (cargoToLoadPlane==1) {
                   toUnloadPlane.push(1);
               } else if (cargoToLoadPlane <=0) { //Prevents invalid cargo inputs from being inputted.
                   System.out.println("We can't put " + cargoToLoadPlane + " cargo on the plane!");
               } else {
            System.out.println("Cargo is being loaded on...");
            for (int i=1; i<=cargoToLoadPlane; i++) {
                toUnloadPlane.push(i);
                System.out.print("Cargo #" + i + " was loaded on to the plane! ");
                if (i % 6 ==1)  {
                System.out.print("\n");
                }
            }
            System.out.println("\n");
            }
            }
            while (passengerBoard.peek()!=null) {
                System.out.println("Group #" + passengerBoard.remove() + " may now board the plane."); 
            }
            plane.setStringDescriptors(manufacturer, captain, copilot, route, condition);
            plane.setIntegerDescriptors(fuel, capacity, airRegistration);
            placeHolder.add(plane);
            plane.selectionSortAirplaneLuggage(luggageToAdd);
            lookUp.put(airRegistration, plane);
            System.out.println("Would you like to see how the flight attendants will serve lunch on the plane? (Enter Y or N)!");
            String lunchTime=desc.nextLine();
            if (lunchTime.equalsIgnoreCase("Y")) {
                plane.lunchService(capacity);
            }
            System.out.println("Would you like to see how the owners luggage that you entered was sorted? (Enter Y or N)!");
            String lugConfirm=desc.nextLine();
            if (lugConfirm.equalsIgnoreCase("Y")) {
                for (String owners: luggageToAdd) {
                    System.out.println("" + owners + " gets their luggage!");
                }
            }
            System.out.println("The plane has landed! Would you like to see the cargo being unloaded? (Enter Y or N)\n");
            String process_two=desc.nextLine();
            
            if (process_two.equalsIgnoreCase("Y")) {
            System.out.println("\nCargo will be unloaded now, due to how loading cargo works, the cargo that went in first will come out last!");
            if (cargoToLoadPlane==1) {
                  System.out.println("Cargo #1 has been unloaded off of the plane");
               } else if (cargoToLoadPlane <=0 || cargoToLoadPlane==null) {
                   System.out.println("We can't unload " + cargoToLoadPlane + " cargo off of the plane!");
               } else {
               for (int i=1; i<=cargoToLoadPlane; i++) {
                System.out.print("Cargo #" + toUnloadPlane.pop() + " was unloaded off of the plane! ");
                if (i % 6 == 1) { //To allow a better way to see all of the cargo.
                System.out.print("\n");
                }
                if (toUnloadPlane.empty()) {
                System.out.println("\nThe last piece of cargo was unloaded of the plane!");
                }
               }
              }
            }
            
            } else if (input==2) { //Cargo not needed since passenger train!
               type="LOCOMOTIVE/TRAIN";
               ArrayList<String> luggageToAddTrain=new ArrayList<>();
               Scanner trainScan=new Scanner(System.in);
               LinkedList<Object> trainTotal=new LinkedList<>();
               Queue<String> passengerBoard= new LinkedList<>();
               Train locomotive=new Train();
               ArrayList<Integer> trainPassengers=new ArrayList<>();
               System.out.println("Enter the Manufacturer of the Train. Example: Siemens");
               String manufacturer=trainScan.nextLine();
               System.out.println("Enter the full name of the locomotive engineer (last name, first name)");
               String engineer=trainScan.nextLine();
               System.out.println("Enter the full name of the conductor (last name, first name)");
               String conductor=trainScan.nextLine();
               System.out.println("Enter the route (Example: Boston, Massachussets, U.S.A. to Phoenix, Arizona, U.S.A,)");
               String route=trainScan.nextLine();
               System.out.println("Enter the condition of the train");
               String condition=trainScan.nextLine();
               System.out.println("Enter the train's journey number");
               int journeyNumber=0;
               while (true) {
            journeyNumber=trainScan.nextInt();
            if (lookUp.containsKey(journeyNumber)) { //Prevents the same value from being used as a key and forces the user to choose a valid one.
                System.out.println("Sorry, that number is already being used, please try again");
                trainScan.nextLine();
                System.out.println("Enter the train's journey number.");
            } else {
                System.out.println("Great, thats a valid number!\n");
                break;
            }
            }
            System.out.println("Enter the amount of fuel of the train in gallons");
            int fuel=trainScan.nextInt();
            System.out.println("Enter the amount of passengers onboard");
            int capacity=trainScan.nextInt();
            trainScan.nextLine();
            System.out.println("Enter the owners of the luggage on the plane (Last Name, First Name). It will be sorted. (Enter Stop to Quit)");
            while (true) { //Allows luggage to be added with the owners names.
                String luggage=desc.nextLine();
                if (luggage.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                  luggageToAddTrain.add(luggage);
                }
            }
            System.out.println("Enter the boarding groups in order. (Enter Stop to Quit)");
            while (true) { //Allows groups to be called out rather than passengers which would be tedious.
                String board=trainScan.nextLine();
                if (board.equalsIgnoreCase("Stop")) {
                    break;
                } else {
                passengerBoard.add(board);
                }
            }
            locomotive.setStringDescriptors(manufacturer, engineer, conductor, route, condition);
            locomotive.setIntegerDescriptors(fuel, capacity, journeyNumber);
            locomotive.selectionSortTrainLuggage(luggageToAddTrain);
            placeHolder.add(locomotive);
            lookUp.put(journeyNumber, locomotive);
            for (int i=1; i<=capacity; i++) {
                trainPassengers.add(i);
            }
               while (true) {
               trainScan.nextLine();
               System.out.println("Would you like to remove a passenger? (Enter Y or N)");
               String removeChoice=trainScan.nextLine();
               if (removeChoice.equalsIgnoreCase("Y")) {
                   for (int i=0; i<trainPassengers.size(); i++) {
                       System.out.println("Passenger # " + trainPassengers.get(i));
                   }
                   System.out.println("Who would you like to remove? Enter an integer, please.");
                   int remover=trainScan.nextInt();
                   locomotive.removePassenger(remover, trainPassengers);
               } else {
                   break;
               }
             }
                System.out.println("Would you like to see how the owners luggage that you entered was sorted? (Enter Y or N)!");
                String lugConfirm=desc.nextLine();
                if (lugConfirm.equalsIgnoreCase("Y")) {
                for (String owners: luggageToAddTrain) {
                    System.out.println("" + owners + " gets their luggage!");
                }
                System.out.println("The train has arrived at the depot! Returning to the menu...");
            }
            } else if (input==3) {
              type="FERRY";
              Ferry ship=new Ferry();
            } else if (input==4) {
               type="AUTOBUS";
               Bus autobus=new Bus();
            } else if (input==5) {
                System.out.println("Enter the registration or license number of the route you wish to lookup");
                int check=desc.nextInt();
                if (lookUp.containsKey(check)) {
                    System.out.println("Route number #" + check + " at a glance");
                    System.out.println(lookUp.get(check));
                } else {
                    System.out.println("Such a route does not exist, please try again");
                }
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
