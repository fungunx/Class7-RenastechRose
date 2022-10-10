package Day7_SwitchStatements;

import java.util.Scanner;

public class Topic5_Scanners {
    public static void main(String[] args) {
        //Scanner is a class in Java Lab
        //Scanner has multiple methods that can be used
        // In order to have scanner you need to create an object from that class
        // In order to use Scanner we need to import the Class to out Class.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user enter a number");
        int number = scan.nextInt(); //int number = 12;
        System.out.println("The value of the variable is:"+number);

        System.out.println("hey user enter a double type number:");
        double dnumber = scan.nextDouble();
        System.out.println("the double number is:"+dnumber);
        System.out.println("Hey user enter a byte data type number: ");
        byte bnumber = scan.nextByte();
        System.out.println("the byte number is:"+bnumber);
        float fnumber  = scan.nextFloat();
        System.out.println("Hey user enter a float number:"+fnumber);
        System.out.println("Your Float Number is:"+fnumber);

    }
}
