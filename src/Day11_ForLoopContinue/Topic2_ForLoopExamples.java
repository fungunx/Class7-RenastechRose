package Day11_ForLoopContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Topic2_ForLoopExamples {
    public static void main(String[] args) {
        //write a code where it counts all the even numbers in between 2 numbers those have been entered by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you enter first number");
        int number1 = sc.nextInt();
        System.out.println("Can you enter second number");
        int number2 = sc.nextInt();
        int count = 0;
        int count1 = 0;
        for (int i =number1;i<number2;i++){
        if (i%2==0) {
            count++;
        }else {
            count1++;
        }
            //System.out.println("The total count of even numbers between" +number1+"and"+number2+count);

        }
        System.out.println("The total count of even numbers between" +number1+"and"+number2+"  "+count);
        System.out.println("The total count of even numbers between" +number1+"and"+number2+"  "+count1);





    }
}
