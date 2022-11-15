package Home_Work_Array;

import java.util.Scanner;

public class HomeWork_31 {
    public static void main(String[] args) {

        /*
        Write   a   program   that   creates   an   array   of   10   elements   size.
 Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
array   elements. ( we already did this in the class but try to do it again)
         */
        Scanner sc = new Scanner(System.in);
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the   " + (i + 1) + ". number: ");
            double num = sc.nextDouble();
            array[i] = num;


        }
        double sum = 0;       // do this step to find the sum
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];


        }
        System.out.println("The sum is:" +sum);

    }}



