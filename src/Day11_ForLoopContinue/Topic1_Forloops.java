package Day11_ForLoopContinue;

import java.util.Scanner;

public class Topic1_Forloops {
    public static void main(String[] args) {

        /*
        for(int i = starting; condition (endpoint); iteration(increase or decrease)){
        Code Block
        }
         */

        // write a code where user enters 2 different number and
        //counts the number that can be divided by 3 those ae in between those numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first integer number:");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second integer number:");
        int num2 = sc.nextInt();
        int count=0;
        for (int i = num1;i<=num2;i++){ // i++ = i=i+1;
        //    int count = 0;// this will set the count to be zero everytime code get execute
            if (i%3==0) {
            count++; //count = count + ;
            }
           // System.out.println("The count of all the number that can be diveded by 3 is: "+count);
        }
        System.out.println("The count of all the number that can be diveded by 3 is: "+count);

        //  for (int i = 0;i<=20;i++) {
        //            System.out.println("the i value" +i);






    }
}
