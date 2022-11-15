package HomeWork_Scannerss;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" First Name & Lastname:   ");
        String name = scan.nextLine();
        System.out.println("Exam point:  ");
        int point = scan.nextInt();
        if (point>=90 && point<=100){
            System.out.println("Your result is:   A");
        } else if (point<90 && point>=80) {
            System.out.println("Your result is:   B");

        } else if (point<80 && point>=70) {
            System.out.println("Your result is:   C");
        } else if (point<70 && point>=60) {
            System.out.println("Your result is:   D");

        }else {
            System.out.println("Your result is:   F  :( ");
    }
}}
