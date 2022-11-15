package Day19_MultidimmensionArrays;

import java.util.Arrays;

public class Topic6_DefinemultiArray {
    public static void main(String[] args) {


        int  [] numbers = new int[4]; //{0,0,0,0}

        int [][] nums = new int[2][3]; // {{0,0,0},{0,0,0}}

        System.out.println("The nums array:  "+ Arrays.deepToString(nums));

        nums[1][2]=79;
        System.out.println("The nums array:  "+ Arrays.deepToString(nums));
        System.out.println("*********************************************************************************");

        // define a 2D array with size of 2,4 respectively  //
        // assign all the odd numbers starting from 1 as elements to the arrays

        int [][] odds = new int[2][4]; // {{"0","0","0","0"},  {"0","0","0","0"}}

        int start=1;

        for (int i = 0; i <odds.length ; i++) {

            for (int j = 0; j <odds[i].length ; j++) {

                odds[i][j]=start; // {{1,1,1,1},{1,1,1,1}}
                start=start+2;     // 1,3,5,7,9

            }

        }
        System.out.println("The odds array is:"+Arrays.deepToString(odds));
    }
}
