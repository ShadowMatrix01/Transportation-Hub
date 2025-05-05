
/**
 * Author: Jhan Gomez
 * Date: 5/3/25
 * Version 1.0.4
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*; //Java util package is imported in.
public class Train extends Hub implements Transport //Class train extends hug and implements transport.
{   //Start of the class train.
    private String manufacturer, engineer, conductor, route, condition; //private string objects are made.
    private int capacity, fuel, journeyNumber, minimum; //private integer object are made.
    @Override //An override is applied to setString descriptors.
    public void setStringDescriptors(String manufacturer, String engineer, String conductor, String route, String condition) //setStringDescriptors has its parameters formally defined.
    { //Start of the setStringDescriptors method.
       //Start of the setStringDescriptors method.
      this.manufacturer=manufacturer; //Stores the passed in manufacturer as being the object manufacturer.
      this.engineer=engineer;//Stores the passed in engineer as being the object engineer.
      this.conductor=conductor;//Stores the passed in conductor as being the object conductor.
      this.route=route;//Stores the passed in route as being the object route.
      this.condition=condition;//Stores the passed in condition as being the object .
    } //End of the setStringDescriptors method.
    @Override //An overide is applied to the setIntegerDescriptors method.
    public void setIntegerDescriptors(int fuel, int capacity, int journeyNumber) //setIntegerDescriptors is assigned its parameters 
    { //Start of the setIntegerDescriptors method.
        this.fuel=fuel; //fuel passed in is assigned to fuel object.
        this.capacity=capacity; //capacity passed in assigned to capacity.
        this.journeyNumber=journeyNumber; //journeyNumber passedin is assinged to journeyNumber object.
    } //End of setIntegerDescriptors method.
    @Override //To string method overriden to allow linkedlist and hashmap to work properly.
    public String toString() //toString method declared.
    {//Start of to string method.
        return "\n\nManufacturer: " + manufacturer + "." + "\nCondition: " + condition + "." 
        + "\nJourney Number: " + journeyNumber + "." + "\nFuel: "  + fuel + " gallons of Diesel fuel." + "\nRoute: " + route + "." 
        + "\nEngineer: " + engineer + "."+ "\nConductor: " + conductor + "." + "\nPassengers: " + capacity + ".";
        //The data that was passed in is returned to be added to the linkedlist and hashmap.
    } //End of toString method.
    public int removePassenger(int passenger, ArrayList<Integer> trainPassengers)  //Allows a passenger to be removed by checking if such a passenger exists.
    { //Start of removePassenger method.
       Integer preventer=passenger; //MUST BE CAST AS NONPRIMITVE OTHERWISE WEIRD ERROR WHERE INDEX RATHER THAN VALUE IS REMOVED!
       Random pickReason=new Random(); //A new random object is created.
       String [] randomReasons={"unruly behavior", "drunkeness", "lack of fare", "refunded ticket", "ban", "incorrect destination", "not knowing about java"};
       //Allows a random reason to be used for why the passenger was booted of the plane.
       boolean checkIfFound=trainPassengers.contains(preventer); //A boolean that checks if the passenger is withing trainPassengers is made.
       if (checkIfFound)  //If such a value is found this will run.
       { //Start of if statement.
           int pick=pickReason.nextInt(randomReasons.length); //.length is what allows the iteration through the array to happen.
           String finalPick=randomReasons[pick]; //String finalPick is assigned to one of the random reasons using the number assgined to pick.
           System.out.println("Passenger #" + preventer + " was removed from the train due to " + finalPick); //Tells the user that the passenger was removed due to some reason.
           trainPassengers.remove(preventer); //the passenger is removed from the arrayList.
           return 1; //1 is returned to indicate a sucess.
       } else //Else if such a passenger is not found this will run.
       { //Start of else statement.
           System.out.println("No such passenger is onboard the train"); //Tells the user no such passenger exist.
           return 0; //0 is returned to indicate a failure.
       } //End of else statement,
  } //End of removePassenger method.
  public String selectionSortTrainLuggage(ArrayList<String> luggage) //selectionSortTrainLuggae method has the ArrayList luggage passed in.
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
    } //End of the for loop.
}//End of the class train.
