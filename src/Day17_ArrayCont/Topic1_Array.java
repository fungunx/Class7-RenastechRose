package Day17_ArrayCont;

import java.util.Scanner;

public class Topic1_Array {
    public static void main(String[] args) {
        // Write a code with following requirements
        // user should be asked about how many numbers that is going to add to array
        //user should be asked for each element for array
        // find the sum of all elements in array


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you'd like to add to Array: ");
        int size = sc.nextInt();

        double [] numbers = new double[size];    // {0.0 , 0.0 , 0.0 , 0.0}

        for (int i = 0; i < size; i++) {    // or could put i<numbers.length

            System.out.println("Enter the "+(i+1)+". number: ");
            double num = sc.nextDouble();
            numbers[i] = num;

        }
        for (int i = 0; i < numbers.length; i++) {               // if want to print all
            System.out.println("the "+(i+1)+" is: "+numbers[i]);

        }

        double sum = 0;       // do this step to find the sum
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

        }

        System.out.println("the sum of all the numbers in the array is: "+sum);
    }
}