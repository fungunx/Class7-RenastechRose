package Day20_Ziya;

import java.util.Arrays;

public class Topic4_Combine2Arrays {

    // Write a method where it takes 2 int arrays as input parameters and combine those 2 arrays and returns to 1 enteger array

    public static int [] MethodgorArrays(int [] arr1, int [] arr2){
        int size = arr1.length+arr2.length;
        int [] Array3 = new int[size];
        for ( int i=0; i<arr1.length; i++){
            Array3[i] = arr1[i];
            
        }
        int j =0;
        for (int i = arr1.length; i <size ; i++) {
            Array3 [i] = arr2 [j]; // if don't assign new int inside arr2 array, It will be start from [4]
            j++;



        }
        return Array3;

    }

    public static void main(String[] args) {

        int [] array1 = {2,3,1,90,34,2432,5435,23423,234235,3};
        int [] array2 = {30,7,13,18,37,45,21,1905};
        int [] result =MethodgorArrays(array1,array2);

        System.out.println("The return Array is:  "+ Arrays.toString(result));

        System.out.println("The return Array is:  "+Arrays.toString(MethodgorArrays(array1,array2)));

    }

}
