package Day19_MultidimmensionArrays;

import java.util.Arrays;

public class Topic4_ToStringMulti {
    public static void main(String[] args) {

        int [] nums={5,5,6,6,9,6,8,4,7,2,3,2,1,4};
        System.out.println("The nums arrays is:  "+ Arrays.toString(nums));

        int [][] multiD = {{3,4,5,2,1,5,6,7,8,9},{87,90,322},{34,2,3,4,4,4,4,4,4}};
        for (int i = 0; i < multiD.length; i++) {
            System.out.println("The values:  "+Arrays.toString(multiD[i]));
            System.out.println("**************************************************************************");
        }
        int [][] multi = {{300,45,56,21,13,45,6,67,8,9},{87,90,322},{34,2,3,47,4,54,64,4,4}};

        System.out.println("The multi array values:  "+Arrays.deepToString(multi));

        // Arrays.deepToString (multidimensional Arrays) is used to convert the multi array to string

    }
}
