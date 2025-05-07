 
/**
 * Author: Jhan Gomez
 * Date: 5/7/25
 * Version 1.0.5
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*; //java.util package is imported.
import java.time.LocalTime; //imports the java time localtime class.
import java.time.format.DateTimeFormatter; //imports the java time format DateTimeFormatter class.
public class Hub //A class called hub is made.
{ //Start of the hub class.
    public static void main(String [] args) //Main method is declared.
    { //Start of the main method.
        LocalTime timeNow=LocalTime.now(); //A timeNow of data type of LocalTime is set to the current time.
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("HH:mm"); //fmt object of type DataTimeFormatter is used to specify the format which is hours, minutes, and seconds.
        String type=""; //An empty string is assigned to an object called type.
        Scanner desc=new Scanner(System.in); //A new scanner object called desc is made.
        String time=timeNow.format(fmt); //Used for method overloading.
        LinkedList<Object> placeHolder=new LinkedList<>(); //A new linkedlist that accepts objects called placeHolder is made.
        HashMap<Integer, Object> lookUp=new HashMap<>(); //A hashmap that accepts an integer key and an object value is made.
        while (true)  //A while loop that runs as long as true is made.
        { //Start of while statement.
        try { //A try statement to handle errors is made.
        System.out.println("\nWelcome to the Transportation Hub. From here, you can choose a form of transportation and file the appropriate data."
        + "\nYou may choose to add as many of these options as you see fit. At the end, you may choose to either continue or quit and print. \nPlease select an option."
        + "\n---->[1] Airplane\n---->[2] Train\n---->[3] Ferry\n---->[4] Bus\n---->[5] Look Up Data by Registration/Journey Number\n---->[6] Print All Data and Quit\n");
        //Tells the user what their options are.
        System.out.println("Input a number listed above, please"); //Tells a user to input an integer.
        int input=desc.nextInt(); //input object stores scanners next integer.
        desc.nextLine(); //To allow an input for the manufacturer to work.
        if (input==1) //An if statement made to run if input is equal to 1.
        { //Start of the if statement.
            ArrayList<String> luggageToAdd=new ArrayList<>(); //ArrayList luggageToAdd is made
            type="AIRPLANE"; //Type is assigned to airplane.
            Airplane plane=new Airplane(); //A new airplane object called plane is made.
            Stack<Integer> toUnloadPlane=new Stack<>(); //A stack of integers called toUnloadPlane is made.
            Queue<String> passengerBoard= new LinkedList<>(); //A queue of strings called passengerBoard is made, it will be a linkedlist.
            System.out.println("Enter the Manufacturer of the Airplane. Example: Boeing"); //Tells the user to input the appropriate data.
            String manufacturer=desc.nextLine(); //Stores the user's manufacturer input.
            System.out.println("Enter the amount of cargo oboard");//Tells the user to input the cargo data.
            Integer cargoToLoadPlane=desc.nextInt();//Stores the user's cargoToLoadPlane input, it has to be an a wrapper class Integer to work properly.
            desc.nextLine(); //To avoid weird issue with input.
            System.out.println("Enter the full name of the captain (last name, first name)");//Tells the user to input the appropriate data.
            String captain=desc.nextLine();//Stores the user's captain input.
            System.out.println("Enter the full name of the copilot (last name, first name)");//Tells the user to input the appropriate data.
            String copilot=desc.nextLine();//Stores the user's copilot input.
            System.out.println("Enter the route (Example: Boston, Massachussets, U.S.A. to Phoenix, Arizona, U.S.A.)");//Tells the user to input the appropriate data.
            String route=desc.nextLine();//Stores the user's route input.
            System.out.println("Enter the condition of the aircraft");//Tells the user to input the appropriate data.
            String condition=desc.nextLine();//Stores the user's condition input.
            System.out.println("Enter the airplane registration number");//Tells the user to input the appropriate data.
            int airRegistration=0; //an int object called airRegistration is made, it is initialized to 0.
            while (true) //A while loop that executes as long as it is true is made. 
            { //Start of the while loop/
            airRegistration=desc.nextInt(); //Stores the user's airRegistration input.
            if (lookUp.containsKey(airRegistration)) { //Prevents the same value from being used as a key and forces the user to choose a valid one.
                System.out.println("Sorry, that number is already being used, please try again"); //Tells the user to input a valid input.
                desc.nextLine(); //Scanner is cleared.
                System.out.println("Enter the airplane registration number"); //Tels the user to input again.
            } else //else statement in case the key is valid. End of if statement.
            { //Start of else statement.
                System.out.println("Great, thats a valid number!\n"); //Tells the user the input was valid.
                break; //While loop broken.
            } //End of else statement,
            } //End of while loop.
            System.out.println("Enter the amount of fuel of the airplane in gallons"); //Tells the user to input fuel in gallons.
            int fuel=desc.nextInt();//Stores the user's fuel input.
            System.out.println("Enter the amount of passengers onboard"); //Tells the user to input passengers.
            int capacity=desc.nextInt();//Stores the user's capacity input.
            desc.nextLine(); //scanner cleared of input.
            System.out.println("Enter the owners of the luggage on the plane (Last Name, First Name). It will be sorted, and returned after the plane lands! (Enter Stop to Quit)"); //Tells the user to input owners of luggage to be sorted.
            while (true) //A while loop that continues as long as its true is made. 
            { //Allows luggage to be added with the owners names. Start of the while loop.
                String luggage=desc.nextLine(); //luggage string object stored with users input.
                if (luggage.equalsIgnoreCase("Stop")) //An if statement that compares if the input is stop is made.
                { //If it is, this will be executed. Start of the if statement.
                   break; //While loop is broken.
                } else  //End of if statement. Else statement is declared.
                { //Start of else statement.
                  luggageToAdd.add(luggage); //Luggage is added to luggageToAdd ArrayList.
                } //End of else statement.
            } //End of while loop.
            System.out.println("Enter the boarding groups in order. (Enter Stop to Quit)"); //Tells the user to input boarding groups.
            while (true) //While loop runs until broken.
            { //Allows groups to be called out rather than passengers which would be tedious. Start of while loop.
                String board=desc.nextLine();//Stores the user's board input.
                if (board.equalsIgnoreCase("Stop")) //If the input is equal to stop this happens.
                { //Start of the if statement.
                    break; //While loop broken.
                } else //Otherwise this is executed. End of if statement.
                { //Start of else statement.
                passengerBoard.add(board); //Users input is added to passengerBoard queue.
                } //End of else statement.
            } //End of while loop.
            System.out.println("Would you like to see the cargo being loaded? (Enter Y or N)\n"); //Asks the user if they want to see the cargo being loaded.
            String process=desc.nextLine(); //Stores the user's input.
            if (process.equalsIgnoreCase("Y")) //If the input is yes, this will execute.
            { //Start of if statement.
               if (cargoToLoadPlane==1) //If cargo to load is 1, this will execute.
               { //Start of if statement.
                   toUnloadPlane.push(1);//1 is pushed to the stack.
               } else if (cargoToLoadPlane <=0) //Prevents invalid cargo inputs from being inputted. End of if statement.
               { //Start of else if statement.
                   System.out.println("We can't put " + cargoToLoadPlane + " cargo on the plane!"); //Tells ther user their input can't be loaded on the plane.
               } else //Else statement declared. End of else if statement.
               { //Start of else statement.
            System.out.println("Cargo is being loaded on..."); //Tells the user their cargo is being loaded on to the plane.
            for (int i=1; i<=cargoToLoadPlane; i++) //A for loop that starts at 1, to prevent #0 cargo, and that runs for the length of cargoToLoadPlane is made.
            { //Start of for loop.
                toUnloadPlane.push(i);//The index value is pushed to the toUnloadPlane stack.
                System.out.print("Cargo #" + i + " was loaded on to the plane! "); //Cargo that was pushed is printed out to the user.
                if (i % 6 ==1)  //For every i that has a remainder of 1 when divided by 6, this is executed.
                { //Start of if statement.
                System.out.print("\n"); //A new line is printed.
                } //End of if statement.
            } //End of for loop.
            
            System.out.println("\n"); //New line is printed after for loop finishes.
            }//End of else statement.
            } //End of if statement.
            while (passengerBoard.peek()!=null)  //As long as passsengerBoard queue has a value, this will execute.
            { //Start of while loop.
                System.out.println("Group " + passengerBoard.remove() + " may now board the plane."); //The group at the front of the queue is repeadtly printed to the console.
            } //End of while loop.
            plane.setStringDescriptors(manufacturer, captain, copilot, route, condition); //manufacturer, captain, copilot, route, and conition passed in to setStringDescriptors method.
            plane.setIntegerDescriptors(fuel, capacity, airRegistration); //fuel, capacity, and airRegistration passed in to setIntegerDescriptors method.
            placeHolder.add(plane);//The plane's to string contents are added to the linkedlist.
            plane.selectionSortAirplaneLuggage(luggageToAdd);//luggageToAdd arraylist passed in to plane's selectionSortAirplaneLuggage method.
            lookUp.put(airRegistration, plane); //airregistraion key and plane value is set to the lookup hashmap.
            System.out.println("Would you like to see how the flight attendants will serve lunch on the plane? (Enter Y or N)!"); //Asks the user if they want to see the lunch process.
            String lunchTime=desc.nextLine();//Input for lunch is read from the user.
            if (lunchTime.equalsIgnoreCase("Y")) //If lunchtime is equal to Y or y, this executes.
             { //Start of if statement.
                System.out.println("Would you like to serve lunch to the passengers on the plane, or to the crew (stewards, pilots, crew etc.)? Type 1 for passengers, type 2 for passengers.");
                int lunchForWho=desc.nextInt();
                if (lunchForWho==1) //if lunch for who is equal to 1, this will run.
                { //Start of the if statement.
                plane.lunchService(capacity); //plane's lunchservice method has capacity passed in.
                } else //End of if statement. Otherwise, this will run.
                { //Start of else statement.
                    String lunch_two=""; //A string called lunch_two is made.
                    ArrayList<String> crew=new ArrayList<>(); //An arrayList called crew which accepts strings is made.
                    while (true) //As long as the input is not stop, this will run.
                    { //Start of the while loop.
                        System.out.println("Enter the names of the crew members to serve lunch to (first names only)."); //Tells the user to input the crew's name.
                        lunch_two=desc.nextLine(); //lunch two accepts input.
                        if (lunch_two.equalsIgnoreCase("Stop")) { //if lunch two is equal to stop this will run. Start of if statement.
                            break; //While loop broken.
                        } //End of if statement.
                        crew.add(lunch_two); //lunch_two is added to the crew arraylist.
                    } //End of while loop.
                    plane.lunchService(crew, time); //Using method overloading the crew arraylist and the time is passed in to lunchService.
                }//End of else statement.
            }//End of if statement.
            System.out.println("Would you like to see how the owners luggage that you entered was sorted for the baggage return conveyor belt? (Enter Y or N)!"); //Asks if the user wants to see baggage returned.
            String lugConfirm=desc.nextLine(); //lugConfirm has input stored.
            if (lugConfirm.equalsIgnoreCase("Y")) //if lugconfirm is equal to y or Y this executes.
            { //Start of if statement.
                for (String owners: luggageToAdd) //A for loop that prints all values of luggageToAdd by assigning it to the string owners is made. 
                { //Start of the for loop.
                    System.out.println("" + owners + " gets their luggage!"); //Tells which owners have gotten their luggage.
                } //End of the for loop.
            } //End of if statement.
            System.out.println("The plane has landed! Would you like to see the cargo being unloaded? (Enter Y or N)\n"); //Asks if the user wants to see the cargo being loaded.
            String process_two=desc.nextLine(); //Stores the user's input.
            
            if (process_two.equalsIgnoreCase("Y")) //If process_two is equal to Y or y this executes.
            { //Start of the if statement.
            System.out.println("\nCargo will be unloaded now, due to how loading cargo works, the cargo that went in first will come out last!");
            //Above tells the user how the cargo will be unloaded.
            if (cargoToLoadPlane==1)  //If cargoToLoadPlane is equal to 1, this will be printed.
            { //Start of if statement.
                  System.out.println("Cargo #1 has been unloaded off of the plane"); //Prints the only piece of cargo to the console.
               } else if (cargoToLoadPlane <=0 || cargoToLoadPlane==null) { //End of if statement. If the user inputs something equal to or less than 0, or if null, this will be printed.
               //to avoid an outOfBounds exception.
                //Start of else if statement.
                System.out.println("We can't unload " + cargoToLoadPlane + " cargo off of the plane!"); //Tells the user that amount of cargo can't be unloaded of the plane.
               } else //End of else if statement. Otherwise, this is executed.
               { //Start of else statement.
               for (int i=1; i<=cargoToLoadPlane; i++) //A for loop that starts at 1, and that will run for the length for the length of the cargoToLoadPlane stack is made.
               { //Start of the for loop.
                System.out.print("Cargo #" + toUnloadPlane.pop() + " was unloaded off of the plane! "); //The cargo that is unloaded is printed to the console.
                if (i % 6 == 1)  //To allow a better way to see all of the cargo neatly, will run if i divided by 6 is in the same remainder class.
                { //Start of if statement.
                System.out.print("\n"); //A new line is printed to the console.
                } //End of if statement.
                if (toUnloadPlane.empty()) //If the stack is empty, this is executed.
                { //Start of if statement.
                System.out.println("\nThe last piece of cargo was unloaded of the plane!"); //Tells the user the last piece of cargo was unloaded of the plane.
                } //End of if statement.
               }//End of while loop.
              }//End of else statement.
            }//End of try statement.
            } else if (input==2) { //End of if statement. If the input is two, this is executed. Start of else if statement.
               type="LOCOMOTIVE/TRAIN"; //Type is set to locomotive/train.
               ArrayList<String> luggageToAddTrain=new ArrayList<>(); //A new arraylist that stores strings called luggageToAddTrain is made.
               Scanner trainScan=new Scanner(System.in);  //A new scanner object called trainScan is made.
               LinkedList<Object> trainTotal=new LinkedList<>(); //A new Linkedlist that stores objects is made.
               Queue<String> passengerBoardTrain= new LinkedList<>(); //A new Queue that stores strings using a linkedlist is made.
               Train locomotive=new Train(); //New train instance is made.
               ArrayList<Integer> trainPassengers=new ArrayList<>(); //A new arraylist that stores Integers  is made.
               System.out.println("Enter the Manufacturer of the Train. Example: Siemens"); //Asks the user for manufacturer.
               try { //Try statement declared. Start of try statement.
               String manufacturer=trainScan.nextLine(); //User input stored.
               System.out.println("Enter the full name of the locomotive engineer (last name, first name)");//Asks the user for name of locomotive engineer.
               String engineer=trainScan.nextLine();//User input stored.
               System.out.println("Enter the full name of the conductor (last name, first name)");//Asks the user for conductors name.
               String conductor=trainScan.nextLine(); //User input stored.
               System.out.println("Enter the route (Example: Boston, Massachussets, U.S.A. to Phoenix, Arizona, U.S.A.)");//Asks the user for route.
               String route=trainScan.nextLine(); //User input stored.
               System.out.println("Enter the condition of the train");//Asks the user for train condition.
               String condition=trainScan.nextLine();//User input stored.
               System.out.println("Enter the train's journey number");//Asks the user for journey number.
               int journeyNumber=0;//journeyNumber is set to 0.
               while (true) //While loop that runs as long as true is made.
               { //Start of while loop.
                journeyNumber=trainScan.nextInt();//User input stored.
                if (lookUp.containsKey(journeyNumber)) { //Prevents the same value from being used as a key and forces the user to choose a valid one. Start of if statement.
                System.out.println("Sorry, that number is already being used, please try again");//Tells the user they can't input that value.
                trainScan.nextLine();//Scanner cleared.
                System.out.println("Enter the train's journey number.");//Asks the user for journeyNumber.
                } else //End of if statement. Else statement declared.
                { //Start of else statement.
                System.out.println("Great, thats a valid number!\n"); //Tells the user it is a valid numbeer..
                break; //While loop broken.
                } //End of else statement.
            } //End of while loop.
            System.out.println("Enter the amount of fuel of the train in gallons");//Asks the user for fuel.
            int fuel=trainScan.nextInt();//User input stored.
            System.out.println("Enter the amount of passengers onboard");//Asks the user for passengers.
            int capacity=trainScan.nextInt();//User input stored.
            trainScan.nextLine();//Scanner cleared of input.
            System.out.println("Enter the owners of the luggage on the plane (Last Name, First Name). It will be sorted. (Enter Stop to Quit)");//Asks the user for the owners.
            while (true) { //Allows luggage to be added with the owners names. Start of while loop.
                String luggage=desc.nextLine();//Stores the users input for luggage.
                if (luggage.equalsIgnoreCase("Stop")) //If the input is stop, this will run. 
                { //Start of if statement.
                    break; //While loop broken.
                } else //End of if statement
                { //Start of else statement.
                  luggageToAddTrain.add(luggage); //luggage added to luggageToAdd arrayList.
                } //End of else statement.
            } //End of while loop.
            System.out.println("Enter the boarding groups in order. (Enter Stop to Quit)"); //Asks the user for boarding groups.
            while (true) { //Allows groups to be called out rather than passengers which would be tedious. Start of while loop.
                String board=trainScan.nextLine();////Input for board stored.
                if (board.equalsIgnoreCase("Stop")) //If the user inputs stop this will run.
                { //Start of if statement.
                    break; //While loop broken.
                } else //End of if statement. Else statement declared.
                { //Start of else statement.
                passengerBoardTrain.add(board); //board is added to passengerBoard queue.
                } //End of else statement.
            } //End of while loop.
            locomotive.setStringDescriptors(manufacturer, engineer, conductor, route, condition); //theStringDescriptors has its parameters passed in.
            locomotive.setIntegerDescriptors(fuel, capacity, journeyNumber);//theIntegerDescriptors has its parameters passed in.
            locomotive.selectionSortTrainLuggage(luggageToAddTrain);//theSelectionSortTrainLuggage has its parameter passed in.
            placeHolder.add(locomotive); //locomotive added to the placeholder linkedlist.
            lookUp.put(journeyNumber, locomotive); //joruneyNumber key is added with locomotive value to the lookup hashmap.
             while (passengerBoardTrain.peek()!=null)  //As long as passsengerBoard queue has a value, this will execute.
            { //Start of while loop.
                System.out.println("Group " + passengerBoardTrain.remove() + " may now board the plane."); //The group at the front of the queue is repeadtly printed to the console.
            } //End of while loop.
            for (int i=1; i<=capacity; i++)  //A for loop that runs for the capacity inputed is made.
            { //Start of the for loop.
                trainPassengers.add(i); //i is added to the trainPassengers arrayList.
            } //End of for loop.
               while (true) //While loop declared.
               {// Start of while loop.
               System.out.println("Would you like to remove a passenger? (Enter Y or N)"); //Asks the user if they would like to remove a passenger.
               String removeChoice=trainScan.nextLine(); //Stores the user's input.
               if (removeChoice.equalsIgnoreCase("Y")) //If the input is equal to y, this is executed. 
               { //Start of if statement.
                   for (int i=0; i<trainPassengers.size(); i++)  //A for loop that runs for the size of the arraylist is made.
                   { //Start of the for loop.
                       System.out.println("Passenger # " + trainPassengers.get(i)); //All passengers are printed out.
                   } //End of for loop.
                   System.out.println("Who would you like to remove? Enter an integer, please."); //Asls the user who they would like to remove.
                   int remover=trainScan.nextInt(); //Stores the user's input.
                   locomotive.removePassenger(remover, trainPassengers); //passes in the value to remove aswell as the arraylist.
                   trainScan.nextLine(); //Scanner input rejected,
                } else //End of if statement. Else statement declared.
               { //Start of else statement.
                   break; //While loop broken.
               } //End of for loop.
             } //End of while loop.
                System.out.println("Would you like to see how the owners luggage that you entered was sorted? (Enter Y or N)!"); //Asks the user if they would like to see the luggage sorted.
                String lugConfirm=desc.nextLine(); //Stores the user's input.
                if (lugConfirm.equalsIgnoreCase("Y")) //if the input is equal to Y or y, this will be executed.
                { //Start of the if statement.
                for (String owners: luggageToAddTrain)  //For every value in luggageToAdd it will be assigned to owners.
                { //Start of for loop.
                    System.out.println("" + owners + " gets their luggage!"); //The owners of the luggage are printed out sorted in alphabetical order.
                } //End of for loop.
                System.out.println("The train has arrived at the depot! Returning to the menu..."); //Tells the user they are returning to the menu.
            } //End of the if statement.
            } catch (InputMismatchException e) {
                trainScan.nextLine();
            }
            } //End of else if statement. 
            else if (input==3)  //If the input is 3, this will execute.
            { //Start of the else if statement.
              type="FERRY"; //Type is assigned to ferry.
              Ferry ship=new Ferry(); //A new ferry instance called ship is made.
              Queue<String> passengerBoardBoat= new LinkedList<>(); //A queue of strings called passengerBoardBoat is made, it will be a linkedlist.
              Scanner ferryDetails=new Scanner(System.in);
              ArrayList<Integer> boatPassengers=new ArrayList<>(); //A new arraylist that stores Integers  is made.
              try { //A try statement is made, start of try statement,
                System.out.println("Enter the manufacturer of the boat. Example: Boston Whaler"); //Tells the user to input the appropriate data.
                String manufacturer=ferryDetails.nextLine(); //Stores the user's manufacturer input.
                System.out.println("Enter the full name of the captain (last name, first name)");//Tells the user to input the appropriate data.
                String captain=ferryDetails.nextLine();//Stores the user's captain input.
                System.out.println("Enter the full name of the pilot (last name, first name)");//Tells the user to input the appropriate data.
                String pilot=ferryDetails.nextLine();//Stores the user's pilot input.
                System.out.println("Where will the boat dock at?");
                String dock=ferryDetails.nextLine();
                System.out.println("Enter the route (Example: Greenwich, Connecticut, U.S.A. to Warwick, Rhode Island, U.S.A.)");//Tells the user to input the appropriate data.
                String route=ferryDetails.nextLine();//Stores the user's route input.
                System.out.println("Enter the condition of the boat");//Tells the user to input the appropriate data.
                String condition=ferryDetails.nextLine();//Stores the user's condition input.
                System.out.println("Enter the boats' registration number");//Tells the user to input the appropriate data.
                int boatRegistration=0; //an int object called boatRegistration is made, it is initialized to 0.
                while (true) //A while loop that executes as long as it is true is made. 
                { //Start of the while loop
                boatRegistration=ferryDetails.nextInt(); //Stores the user's airRegistration input.
               if (lookUp.containsKey(boatRegistration)) { //Prevents the same value from being used as a key and forces the user to choose a valid one.
                System.out.println("Sorry, that number is already being used, please try again"); //Tells the user to input a valid input.
                ferryDetails.nextLine(); //Scanner is cleared.
                System.out.println("Enter the boats' registration number"); //Tels the user to input again.
            } else //else statement in case the key is valid. End of if statement.
            { //Start of else statement.
                System.out.println("Great, thats a valid number!\n"); //Tells the user the input was valid.
                break; //While loop broken.
            } //End of else statement,
            } //End of while loop.
            System.out.println("Enter the amount of fuel of the boat in gallons"); //Tells the user to input fuel in gallons.
            int fuel=ferryDetails.nextInt();//Stores the user's fuel input.
            System.out.println("Enter the amount of passengers onboard"); //Tells the user to input passengers.
            int capacity=ferryDetails.nextInt();//Stores the user's capacity input.
            ferryDetails.nextLine(); //scanner cleared of input.
            System.out.println("Enter the boarding groups in order. (Enter Stop to Quit)"); //Tells the user to input boarding groups.
            while (true) //While loop runs until broken.
            { //Allows groups to be called out rather than passengers which would be tedious. Start of while loop.
                String board=ferryDetails.nextLine();//Stores the user's board input.
                if (board.equalsIgnoreCase("Stop")) //If the input is equal to stop this happens.
                { //Start of the if statement.
                    break; //While loop broken.
                } else //Otherwise this is executed. End of if statement.
                { //Start of else statement.
                passengerBoardBoat.add(board); //Users input is added to passengerBoardBoat queue.
                } //End of else statement.
            } //End of while loop.
            ship.setStringDescriptors(manufacturer, captain, pilot, route, condition); //manufacturer, captain, pilot, route, and conition passed in to setStringDescriptors method.
            ship.setIntegerDescriptors(fuel, capacity, boatRegistration); //fuel, capacity, and boatRegistration passed in to setIntegerDescriptors method.
            placeHolder.add(ship);//The ship's to string contents are added to the linkedlist.
            lookUp.put(boatRegistration, ship); //boatRegistraion key and plane value is set to the lookup hashmap.
            while (passengerBoardBoat.peek()!=null)  //As long as passsengerBoard queue has a value, this will execute.
            { //Start of while loop.
                System.out.println("Group " + passengerBoardBoat.remove() + " may now board the boat."); //The group at the front of the queue is repeadtly printed to the console.
            } //End of while loop.
             for (int i=1; i<=capacity; i++)  //A for loop that runs for the capacity inputed is made.
            { //Start of the for loop.
                boatPassengers.add(i); //i is added to the trainPassengers arrayList.
            } //End of for loop.
            while (true) //While loop declared.
               {// Start of while loop.
               System.out.println("Would you like to remove a passenger from the boat? (Enter Y or N)"); //Asks the user if they would like to remove a passenger.
               String removeChoice=ferryDetails.nextLine(); //Stores the user's input.
               if (removeChoice.equalsIgnoreCase("Y")) //If the input is equal to y, this is executed. 
               { //Start of if statement.
                   for (int i=0; i<boatPassengers.size(); i++)  //A for loop that runs for the size of the boatPassenger arraylist is made.
                   { //Start of the for loop.
                       System.out.println("Passenger # " + boatPassengers.get(i)); //All passengers are printed out.
                   } //End of for loop.
                   System.out.println("Who would you like to remove? Enter an integer, please."); //Asls the user who they would like to remove.
                   int remover=ferryDetails.nextInt(); //Stores the user's input.
                   ship.removePassenger(remover, boatPassengers); //passes in the value to remove aswell as the arraylist.
                   ferryDetails.nextLine();//To clear the scanner.
               } else //End of if statement. Else statement declared.
               { //Start of else statement.
                   break; //While loop broken.
               } //End of for loop.
            }
            } catch (InputMismatchException e) //End of try statement. 
            { //Start of catch statement.
                  ferryDetails.nextLine(); //Scanner input rejected.
            } //End of catch statement.
            } //End of else if statement.
            else if (input==4) //If the input is 4, this will be executed.
            { //Start of the else if statement.
               type="AUTOBUS"; //Type is assigned to autobus.
               Bus autobus=new Bus(); //A new Bus instance called autobus is made.
               Scanner busDetails=new Scanner(System.in); //A new scanner called busDetails is made.
               ArrayList<Integer> busToPass=new ArrayList<>(); //A new arraylist is made to handle input.
               Queue<String> passengerBoardBus= new LinkedList<>(); //A new queue for bus passengers is made.
               try { //A try statement is declared. Start of the try statement.
               System.out.println("Enter the manufacturer of the bus. Example: New Flyer"); //Tells the user to input the appropriate data.
               String manufacturer=busDetails.nextLine(); //Stores the user's manufacturer input.
               System.out.println("Enter the full name of the driver (last name, first name)");//Tells the user to input the appropriate data.
               String driver=busDetails.nextLine();//Stores the user's driver input.
               System.out.println("Enter the full name of the fare inspector (last name, first name)");//Tells the user to input the appropriate data.
               String fareInspector=busDetails.nextLine();//Stores the user's pilot input.
               System.out.println("Which terminal will the bus unload at?");//Aks the user which terminal the bus will unload at.
               String terminal=busDetails.nextLine();
               System.out.println("Enter the route (Example: El Paso, Texas, U.S.A. to Sacramento, California, U.S.A.)");//Tells the user to input the appropriate data.
               String route=busDetails.nextLine();//Stores the user's route input.
               System.out.println("Enter the condition of the bus");//Tells the user to input the appropriate data.
               String condition=busDetails.nextLine();//Stores the user's condition input.
               System.out.println("Enter the bus' registration number");//Tells the user to input the appropriate data.
               int busRegistration=0; //an int object called boatRegistration is made, it is initialized to 0.
               while (true) //A while loop that executes as long as it is true is made. 
               { //Start of the while loop
               busRegistration=busDetails.nextInt(); //Stores the user's airRegistration input.
               if (lookUp.containsKey(busRegistration)) { //Prevents the same value from being used as a key and forces the user to choose a valid one.
                System.out.println("Sorry, that number is already being used, please try again"); //Tells the user to input a valid input.
                busDetails.nextLine(); //Scanner is cleared.
                System.out.println("Enter the boats' registration number"); //Tels the user to input again.
               } else //else statement in case the key is valid. End of if statement.
               { //Start of else statement.
                System.out.println("Great, thats a valid number!\n"); //Tells the user the input was valid.
                break; //While loop broken.
               } //End of else statement,
               } //End of while loop.
               System.out.println("Enter the amount of fuel of the bus in gallons"); //Tells the user to input fuel in gallons.
               int fuel=busDetails.nextInt();//Stores the user's fuel input.
               System.out.println("Enter the amount of passengers onboard"); //Tells the user to input passengers.
               int capacity=busDetails.nextInt();//Stores the user's capacity input.
               busDetails.nextLine(); //scanner cleared of input.
               autobus.setStringDescriptors(manufacturer, driver, fareInspector, route, condition); //manufacturer, driver, fareInspector, route, and conition passed in to setStringDescriptors method.
               autobus.setIntegerDescriptors(fuel, capacity, busRegistration); //fuel, capacity, and busRegistration passed in to setIntegerDescriptors method.
               placeHolder.add(autobus);//The bus to string contents are added to the linkedlist.
               lookUp.put(busRegistration, autobus); //busRegistraion key and plane value is set to the lookup hashmap.
               for (int i=1; i<=capacity; i++)  //A for loop that runs for the capacity inputed is made.
               { //Start of the for loop.
                busToPass.add(i); //i is added to the busToPass arrayList.
               } //End of for loop.
               System.out.println("Enter the boarding groups in order. (Enter Stop to Quit)"); //Asks the user for boarding groups.
               while (true) { //Allows groups to be called out rather than passengers which would be tedious. Start of while loop.
                String board=busDetails.nextLine();////Input for board stored.
                if (board.equalsIgnoreCase("Stop")) //If the user inputs stop this will run.
                { //Start of if statement.
                    break; //While loop broken.
                } else //End of if statement. Else statement declared.
                { //Start of else statement.
                passengerBoardBus.add(board); //board is added to passengerBoard queue.
                } //End of else statement.
               } //End of while loop.
               System.out.println("The bus is about to leave, would you like to remove a passenger Type: 1, change the terminal of arrival Type: 2, or not make any changes? Type: 3"); //Asks the user for input.
               int forSwitch=busDetails.nextInt(); //An object that holds the user's input for the switch statement is made.
                while (forSwitch != 3) { // As long as forSwitch does not equal 3, this will run. Start of the while loop.
                switch (forSwitch) {  // switch statement that uses the input is made. Start of the switch statement
                case 1: // If 1 is inputted.
                for (int i = 0; i < busToPass.size(); i++) // A for loop that runs for the size of the busToPass arraylist is made.
                { // Start of the for loop.
                System.out.println("Passenger # " + busToPass.get(i)); // All passengers are printed out.
                } // End of for loop.
                System.out.println("Who would you like to remove? Enter an integer, please."); // Asks the user who they would like to remove.
                int remover = busDetails.nextInt(); // Stores the user's input.
                autobus.removePassenger(remover, busToPass); // passes in the value to remove as well as the arraylist.
                busDetails.nextLine();// To clear the scanner.
                break; // Switch statement broken.
                case 2: // Case 2 if 2 is inputted,
                busDetails.nextLine(); //To clear the scanner.
                System.out.println(terminal + " is the current terminal."); // Tells the user the current terminal.
                System.out.println("Which terminal will the bus unload at now?"); // Asks the user what the terminal is.
                terminal = busDetails.nextLine(); // Terminal input is stored. 
                break; // Switch statement broken.
                default: // In the case something other than 1 or 2 is inputted this happens.
                System.out.println("Invalid input. Please enter 1, 2, or 3."); //default message
                break;//Switch statement broken.
                } // End of switch statement.
                System.out.println("The bus is about to leave, would you like to remove a passenger? Type: 1, change the terminal of arrival? Type: 2, or not make any changes? Type: 3"); //Continues with the loop.
                forSwitch = busDetails.nextInt();//Input is stored.
                } // End of while loop.
                while (passengerBoardBus.peek()!=null)  //As long as passsengerBoardBus queue has a value, this will execute.
               { //Start of while loop.
                System.out.println("Group " + passengerBoardBus.remove() + " may now board the boat."); //The group at the front of the queue is repeadtly printed to the console.
               } //End of while loop.
               System.out.println("The bus has arrived at: " + terminal + "!"); //Tells the user the bus has arrived.
               } catch (InputMismatchException e) { //End of the try statement. A catch statement to handle exceptions is made, start of the catch statement.
                  busDetails.nextLine(); //Scanner input is rejected.
               }//End of catch statement.
            } else if (input==5) //End of else if statement. If the input is 5, this will run.
            { //Start of else if statement.
                Scanner dataSetLookup=new Scanner(System.in);
                System.out.println("Enter the registration or license number of the route you wish to lookup"); //Asks the user what route they would like to lookup.
                try { //Try statement is declared. Start of try statement,
                int check=dataSetLookup.nextInt(); //User input stored to check object.
                if (lookUp.containsKey(check)) //If the hashmap lookup contains the number, this will execute.
                { //Start of the if statement.
                    System.out.println("Route number #" + check + " at a glance"); //Tells the user the route number will be printed.
                    System.out.println(lookUp.get(check)); //Gets the value associated with the key.
                } else //End of if statement. If they key value is not found, this will run.
                { //Start of else statement.
                    System.out.println("Such a route does not exist, please try again"); //Tells the user such a route does not exist.
                } //End of else statement.
            } catch (InputMismatchException e) //End of try statement. If an exception happens this will run.
            { //Start of the catch statement.
                dataSetLookup.nextLine(); //Scanner is cleared of input.
            } //End of the catch statement.
        } else //End of else if statement. Otherwise, this will be runned.
        { //Start of else statement.
            System.out.println("Gathering today's data..."); //The user is told all of the data will be printed.
            Iterator<Object> iterator = placeHolder.iterator(); //An iterator that is assined to placeholder is made.
            if (!iterator.hasNext()) //If iterator has nothing to print.
            { //Start of if statement.
                System.out.println("There is nothing to print, shutting down..."); //User is told there is nothing to print and that the program is shutting down.
                break; //While loop broken.
            } //End of if statement.
            while (iterator.hasNext()) //Otherwise, while the iterator has a value, this will be printed.
            { //Start of while loop.
                System.out.println(iterator.next()); //The next iterator object is printed.
            } //End of while loop.
            break; //While loop broken.
        } //End of else statement.
      } catch (InputMismatchException e) { //End of try statement, catch declared and will run if exception occurs. Start of catch statement.
          desc.nextLine(); //Scanner input rejected.
      } //End of catch statement.
     } //End of while loop.
  } //End of main method.
} //Start of Hub class.
