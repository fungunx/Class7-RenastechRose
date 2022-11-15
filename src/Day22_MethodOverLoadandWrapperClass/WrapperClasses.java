package Day22_MethodOverLoadandWrapperClass;

import static Day22_MethodOverLoadandWrapperClass.RecapMethodOverload.line;

public class WrapperClasses {

    public static void main(String[] args) {

        //Primitive Data Type
        // byte
        // Int
        // Short
        // Long
        // Float
        // Double
        // Boolean
        // Char

        //Non-Primitive object and object are getting created by class
        //Primitive Classes
        // byte                //Byte
        // int                 //Integer
        // short               //Short
        // long                //Long
        // float               //Float
        // double              // Double
        // boolean             //Boolean
        // char                // Char

        int number = 5;

        System.out.println(number);

        Integer numbers = 5;

        System.out.println(numbers);

        numbers.toString();

        //Example
        //ArrayList<int> myNumber = new ArrayList<int>(); //invalid, won't work

        //ArrayList<Integer> myNumber = new ArrayList<Integer>();

        Character myChar = 'A';

        line();

        Byte b1 = 11; // wrapper
        byte b2 = 12; // primitive
        Byte b3 = b2 ; //wrapper

        System.out.println("///////////////////////////////////////////////////////////////////////");

        // toString

        Integer myInt = 5;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());

        System.out.println(myString);

    }



}
