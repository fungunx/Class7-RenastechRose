package HomeWork_Scannerss;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:   ");
        double number1 = scan.nextInt();

        System.out.println("Enter your second number:   ");
        double number2 = scan.nextDouble();

        System.out.println(" Enter your operation 1 for Summation, 2 for Subtraction, 3 for Multiplication, and 4 for division");
        double number3 = scan.nextDouble();

        if (number3 == 1) {
            System.out.println("Your result is:  " + (number1 + number2));
        } else if (number3 == 2) {
            System.out.println("Your result is:  " + (number1-number2));
        } else if (number3 == 3) {
            System.out.println("Your result is:  " + (number1*number2));

        } else if  (number3 == 4) {
            System.out.println("Your result is:  " + (number1/number2));

        }

    }


    }