package Homework_StringMethod;

import java.util.Scanner;

public class Homework_16 {

    public static void main(String[] args) {

        /*
        Write a code where it meets the below requirements
- a couple just got married and goes to city hall to get their last name changed
- the officer who works there asks the couple about their first name and last name for each
- also asks if they want to use the same last name or keep their original last names ( for the same last name you can use either one of them)
- based on the answer print the couples first names and last names

         */

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your Name Sir: ");
        String nameM = sc.nextLine();
        System.out.println("What is your Lastname Sir: ");
        String lnameM = sc.nextLine();
        System.out.println("What is your Name Madam: ");
        String nameW = sc.nextLine();
        System.out.println("What is your Lastname Madam: ");
        String lnamew = sc.next();
        System.out.println("If you want to use same lastname please enter 1 or if you want to keep your last name please enter 2");
        int same = sc.nextInt();
        if (same == 1) {
            System.out.println("Your new Full Name is Madam:  " + nameW.concat("  " + lnamew));
            System.out.println("You new Full Name is Sir:     " + nameM.concat("  " + lnameM));
        } else if (same == 2) {
            System.out.println("Your new Full Name is Madam:  " + nameW.concat("  " + lnameM));
            System.out.println("You new Full Name is Sir:     " + nameM.concat("  " + lnameM));
        }else {
            System.out.println("Please enter valid number");

        }

    }



        //  // concat()	          Appends a string to the end of another string	                    String
        //        String FirstName = "Ziya";
        //        String LastName = "Yilmaz";
        //        String FullName = FirstName.concat(" "+LastName);
        //        System.out.println("The Full name is:  "+FullName);

    }

