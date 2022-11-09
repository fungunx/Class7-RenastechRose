package Homework_StringMethod;

import Day5_IfElseStatements.Topic1_PrimitiveCasting;
import HomeWorkIfElse.IfElse;

import java.util.Scanner;
import java.util.SplittableRandom;

public class Homework_14 {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a name:
        //if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = sc.next();
        boolean start = name.startsWith ("A");
        boolean end = name.endsWith ("l");
        if (start == true && end == true){
            String Rename = name.replace("A", "B");
            System.out.println("Your name is:" + Rename);
        } else  {
            System.out.println("Your name is :"+name);
        }



    }
}
