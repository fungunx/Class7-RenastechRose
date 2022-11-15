package Day16_Arrays;

public class Toppic_ArrayExamples {

    public static void main(String[] args) {
        // write a code where you find the maximum number in the given array below:
        // arr = { 56, 23 , 1,90,31,45,67,81,100,24}

        int [] arr = {56,23,1,90,31,45,67,81,100,24};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println("the Max value is:  " +max);
    }
}
