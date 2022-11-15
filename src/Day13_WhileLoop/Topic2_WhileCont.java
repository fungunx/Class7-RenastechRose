package Day13_WhileLoop;

import java.util.Scanner;

public class Topic2_WhileCont {
    public static void main(String[] args) {
        // write a code where user us being asked to enter 2 numbers and sum all the numbers
        //in between those two numbers which can be divided by 5

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Please enter the second number:  ");
        int num2 = scan.nextInt();
        int i;
        int j;
        if (num1>num1){
            i = num2;
            j=num2;
        }else {
            i=num1;
            j=num2;
        }
        int sum = 0;
        while (i<j){

            if (i%5==0){

            }
            sum+=i; // sum = 0+13 ==> sum = 13+14 == 27+15..
            i++;
        }
        System.out.println("the value of the sum is: "+sum);
    }
}
