package Home_Work_Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_33 {
    public static void main(String[] args) {

        /*
        Write a code where user is asked to enter for 5 employee salaries and store those salaries
Then find the average salary of those 5 employees
         */
        Scanner sc = new Scanner(System.in);
        int array[] = new int[5];
        int total = 0;
        int sal = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter the salary for " + (i + 1) + "th employee please: ");
            sal = sc.nextInt();
           array [i]=sal;

            total=total+array[i];
        }
        double average = total/array.length;
        System.out.println("Total salaries is:  "+total+"  $");
        System.out.println("Avarage salary is:  "+average+" $");




    }
}

