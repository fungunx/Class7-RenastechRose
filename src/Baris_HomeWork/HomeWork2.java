package Baris_HomeWork;

import java.util.Arrays;

public class HomeWork2 {

    /*
    Write a method where it takes array of integers and returns the sorted version of that array
     */

    public static void main(String[] args) {

        int[] arr = { 454, 14, 3, 35327, 4527, 642, 51109 };
        System.out.println("The first version of array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nThe last version of array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}