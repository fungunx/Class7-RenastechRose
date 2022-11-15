package Baris_HomeWork;

public class HomeWork1 {


     /*
    Write a method where it takes 2 strings as a parameter and returns true when 2 strings are equal and returns false when they are not equal.

     */

    public static void main(String[] args) {

        System.out.println(Parameter1("elma", "elma"));

    }

    public static boolean Parameter1(String a, String b) {
        if (a == b) {
            System.out.println("This two Strings are equal: ");
            return true;
        } else {
            System.out.println("This is two Strings are not equal: ");
            return false;

        }



    }
}