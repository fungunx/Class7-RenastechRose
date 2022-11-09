package Homework_StringMethod;

import java.util.Scanner;

public class Homework_23 {
    public static void main(String[] args) {
        //Write a program where the user is being asked to enter a String and that   will   count   how   many   times   "a" or 'A'   is   found   in that entered String
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sting  please: ");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='a' || s.charAt(i)=='A'){
                System.out.println();
                count++;

            }


        }System.out.println(count +"times A or a included in your text");


    }
}
