package Day8_Scanners;

import java.util.Scanner;

public class Topic3_ScannerExamples {
    public static void main(String[] args) {
        // Write a code where it asks user to enter 3 different  ( first name and last name)
        // add the age, print the person's name and age who is the oldest.

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your first name and last name:  "   );
            String Name1 = sc.nextLine();
            System.out.println("Please enter your age:  "   );
            int Age1 = sc.nextInt();sc.nextLine();
            System.out.println( "Your name and is:  "+Name1+"  Your Age is:" +Age1);

            System.out.println("Please enter your first name and last name:  "   );
            String Name2 = sc.nextLine();
            System.out.println("Please enter your age:  "   );
            int Age2 = sc.nextInt();sc.nextLine();
            System.out.println( "Your name and is:  "+Name2+"  Your Age is:" +Age2);

            System.out.println("Please enter your first name and last name:  "   );
            String Name3 = sc.nextLine();
            System.out.println("Please enter your age:  "   );
            int Age3 = sc.nextInt();sc.nextLine();
            System.out.println( "Your name and is:  "+Name3+"  Your Age is:" +Age3);
            if (Age1>Age2 && Age1>Age3) {
                System.out.println(Age1 + "is oldest person in the group" + Name1);
            } else if(Age2>Age1 && Age2>Age3) {
                System.out.println(Age2 + "is oldest person in the group" + Name2);
            }else{  System.out.println(Age3 + "    is oldest person in the group:    " +Name3);
                }
    }}
