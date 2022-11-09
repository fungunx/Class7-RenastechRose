package Homework_StringMethod;

import java.util.Scanner;

public class Homework_21 {
    public static void main(String[] args) {

        /*
        Write a code where user is asked to enter a number:
Calculate the square of all the numbers from 0 to given number and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number please:");
        int num1 = sc.nextInt();
        int num2=0;
        for (int i = 0; i <num1 ; i++) {
            System.out.println("square of a number is :"+i+"*"+i+" = "+i*i);

        }

    }
}
