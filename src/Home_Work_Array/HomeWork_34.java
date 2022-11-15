package Home_Work_Array;

import java.util.Arrays;

public class HomeWork_34 {
    public static void main(String[] args) {

        /*
        Write code where it shifts all the elements in array by one index and put the first index at the end of the array
example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
         */
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Input Array:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }

        int first = array[0];
        for (int j = 0; j < array.length-1; j++) {
            array[j]=array[j+1];

        }
        array[array.length-1]=first;
        System.out.println();
        System.out.println("Output Array:  ");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+  " ");
        }


    }


    }

