package HomeWork_Scannerss;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:   ");
        int num1 = scan.nextInt();
        if (num1>1){
            System.out.println("Your number is positive");
        } else if (num1 ==0) {
            System.out.println("Your number is 0");

        }else{
            System.out.println("Your number is negative");
        }
    }
}
