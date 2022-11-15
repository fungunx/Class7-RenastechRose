package HomeWork_Scannerss;

import java.util.Scanner;

public class Scanners1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number:  ");
        int number1 = scan.nextInt();
        System.out.println("Enter 2st number:  ");
        int number2 = scan.nextInt();
        System.out.println("Enter 3st number:  ");
        int number3 = scan.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println(" Maximum number is:  " + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Maximum number is:   " + number2);

        } else if(number3>number1 && number3>number2){
            System.out.println("Maximum number is:  " + number3);


        }
    }}
;