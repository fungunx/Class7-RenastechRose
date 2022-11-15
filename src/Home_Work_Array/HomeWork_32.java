package Home_Work_Array;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_32 {
    public static void main(String[] args) {
        /*
        //Write   a     program   to   with following requirements
1) user should be prompted about how many numbers is going to be entered
2) User should be prompted for the values of the numbers
3) Reverse the all the given numbers and print it
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter:");
        int number = sc.nextInt();
        int array[] = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the   " + (i + 1) + ". number: ");
            int num = sc.nextInt();
            array[i] = num;


        } System.out.println(   Arrays.toString(array));
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reverse array : "+Arrays.toString(array));

        }

    }
