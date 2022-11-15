package Home_Work_Array;

import java.util.Arrays;

public class HomeWork_28 {

    public static void main(String[] args) {
        /*
        Write a code with following requirements:
- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
- Print the minimum number in the given array
         */
        int [] nums = {6,7,2,3,90,-2,-90,-122,96,35};
        System.out.println("The num array is:  "+Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("The nums array now is:  "+Arrays.toString(nums));
        System.out.println("The mun number in array is:  "+nums[0]);



    }
}
