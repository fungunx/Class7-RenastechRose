package Homework_StringMethod;

import java.util.Scanner;

public class Homework_26 {
    public static void main(String[] args) {
        /*
        Write a code where it ask user to enter an integer number
- Reverse the given number and print the result
- Example input ( 5678 )
- Example output ( 8765 )
         */
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any integer number please:  ");
        int number = sc.nextInt();
        int reverse=0;
        int temp = number;
        int remainder = 0;
        while(temp>0)
        {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("reverse of " + number + " is " + reverse);

    }
}

