
/**
 * Author: Jhan Gomez
 * Date: 5/5/25
 * Version 1.0.4
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
import java.util.*; //java util package imported.
public class Bus extends Hub implements Transport //Bus class with hub extended and transport implemented is made.
{ //Start of the bus class.
    private String manufacturer, driver, fare_inspector, route, condition, temp;  //private string objects are made.
    private int capacity, fuel, busLicenese, minimum; //private integer object are made.
    @Override //setStringDescriptors is overriden.
    public void setStringDescriptors(String manufacturer, String driver, String fare_inspector, String route, String condition) //parameters for setStringDescriptors is defined.
    { //Start of the setStringDescriptors method.
      
    } //End of the setStringDesciptors method.
    @Override //setIntegerDescriptors method is overriden.
    public void setIntegerDescriptors(int fuel, int capacity, int busLicense)  //setIntegerDescriptors method has its parameters defined.
    { //start of the setIntegerDescriptors method.
       
    } //end of the setIntegerDescriptors method.
} //End of class Bus
