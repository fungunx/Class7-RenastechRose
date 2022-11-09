package Homework_StringMethod;

import java.util.Scanner;


public class fdsfsd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string vale please:  ");
        String input = sc.nextLine();

        String output = "";
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index % input.length()) != input
                    .charAt((index + 1) % input.length())) {

                output += input.charAt(index);

            }
        }
        System.out.println(output);


    }
}
