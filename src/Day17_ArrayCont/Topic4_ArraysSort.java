package Day17_ArrayCont;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Topic4_ArraysSort {
    public static void main(String[] args) {

        int [] nums = {56,32,34,90,-345,-12,-34};

        System.out.println("The num array is:  "+Arrays.toString(nums));

        Arrays.sort(nums); // Arrays.sort (the name of array) will put the element in increasing order and assing back to
        //the original array

        System.out.println("The nums array now is:  "+Arrays.toString(nums));
        System.out.println("The first element in nums "+nums[0]);
        System.out.println("****************************************************");

        String [] names = {"Zeliha","Eloise","Hrakar","Amer"};

        System.out.println("the Arrays if names is:  " +Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("the Array of name now:  "+ Arrays.toString(names));


        System.out.println("****************************************************");

        int [] num3 = {90,34,-123,-456,123,5673};

        int reverse []=new int[nums.length];


        Arrays.sort(num3);

        int j =0;

        for (int i = num3.length-1; i >=0; i--) {
            reverse[j] = num3[i];
            j++;
        }
        System.out.println("The reverse is:  "+Arrays.toString(reverse));

    }
}
