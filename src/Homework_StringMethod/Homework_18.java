package Homework_StringMethod;

import java.util.Scanner;

public class Homework_18 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter an integer number:
Using the given number find the factorial of that number and Print the result.
example: 5 ==> 5! = 5*4*3*2*1 = 120
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Can you write any integer number:");
        int number = sc.nextInt();
        int fac = 1;
        for (int i = 2; i <=number  ; i++) {
            fac=fac *i;


        }
        System.out.println("Factorial of "+number+" is: "+fac);
    }
}
