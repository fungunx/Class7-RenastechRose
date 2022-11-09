package Homework_StringMethod;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework_19 {
    public static void main(String[] args) {
        /*
        Write a code where user is asked to enter a number and check for every number between
        0 to that number to see how many numbers between 0 to that number can be divided to 3 and 5 and sum all those numbers, Print the result
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number please:  ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 0;  i<number; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Divided 3 and 5: "+ i);
                count=count+i;

            }


        } System.out.println(count);



        }

    }

    /*
     //write a code where it counts all the even numbers in between 2 numbers those have been entered by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you enter first number");
        int number1 = sc.nextInt();
        System.out.println("Can you enter second number");
        int number2 = sc.nextInt();
        int count = 0;
        int count1 = 0;
        for (int i =number1;i<number2;i++){
        if (i%2==0) {
            count++;
        }else {
            count1++;
        }
            //System.out.println("The total count of even numbers between" +number1+"and"+number2+count);

        }
        System.out.println("The total count of even numbers between" +number1+"and"+number2+"  "+count);
        System.out.println("The total count of even numbers between" +number1+"and"+number2+"  "+count1);
     */


