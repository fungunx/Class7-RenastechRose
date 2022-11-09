package Homework_StringMethod;

import java.util.Scanner;

public class Homework_20 {
    public static void main(String[] args) {

        /*
        Write a code where user is asked to enter a number.
Find the sum of all the even numbers between 0 to that number (included)
Find the sum of all the odd numbers between 0 to that number (included)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number please:  ");
        int num1 = sc.nextInt();
        int even=0;
        int odd=0;
                for (int i = 0; i <=num1 ; i++) {
                    if (i%2==0){
                        even+=i;
                    }else {
                        odd+=i;

                    }

            
        }
        System.out.println("Print out all even numbers: "+even);
        System.out.println("Print out odd numbers: "+odd);
    }
}
