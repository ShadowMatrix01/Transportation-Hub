
/**
 * Author: Jhan Gomez
 * Date: 5/5/25
 * Version 1.0.4
 * Purpose: To show a transportation planning program that utilizes stacks, queues, linkedlists, sorting algorithms, arrays,
 * inheritance, polymorphism, interfaces, abstract methods, recursion, exceptions, hashmaps, switch statements, overriding, overloading,
 * input, output, import, booleans, and collections.
 */
public interface Transport //An interface called transport which all vehicle classes will implement is made.
{ //Start of interface transport.
    void setStringDescriptors(String manufacturer, String operator_one, String operator_two, String route, String condition, String type);
    //setStringDescriptors which has 6 parameters must be overriden.
    void setIntegerDescriptors(int fuel, int capacity, int licenseNumber);
    //setIntegerDescriptors which has 3 parameters must be overriden.
} //End of interface transport.
