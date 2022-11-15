package Home_Work_Array;

import java.util.Arrays;

public class new_34
{
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Input of Array:"+Arrays.toString(a) );
        int size = a.length;
        int last = a[size-1];
        for (int i = size-1; i >0 ; i--) {
            a[i] = a[i-1];
        }
        a[0]=last;
        System.out.println("Output of Array" +Arrays.toString(a));

    }
}
