package Day21_Ziya_MethodsOverload;

import java.util.Scanner;

public class Topic3_MethodOverloadexa {

    //write a code where it sums numbers entered by user.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a first number please:  ");
        int number1 = sc.nextInt();
        System.out.println("Write a second number please: ");
        int number2 = sc.nextInt();
        System.out.println("The sum of 2 number is: "+sum(number1,number2));
    }
    public static int sum(int number1, int number2){
          int sum = number1+number2;

        return sum;
    }
}
