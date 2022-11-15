package Personal_HomeWork;

import java.util.Scanner;

public class forloop_example1 {
    public static void main(String[] args) {

        /*
        Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number pls?");
        int number =sc.nextInt();
        int a= 0;
        int b=0;
        for (int i = 1; i <number ; i++) {
            if(i % 2==0){
                a+=i;

                System.out.println("The even number is:  " +i+"   ");

            }if (i % 2 ==1){
                b+=i;
                System.out.print("\nThe odd number is:" +i+"   ");
            }


        }System.out.println("\neven sum = "+a+"   "+"odd sum = "+b);

                 }
                 }

//                for(int i=0; i<=num; i++)
//                if (i%3==0){
//                    sum += i;
//                    System.out.println(i);
//                }
//
//                System.out.println("Sum: " + sum);


            /*
            Scanner sc= new Scanner(System.in);
        System.out.println("Can you write any integer number:");
        int number = sc.nextInt();
        int fac = 1;
        for (int i = 2; i <=number  ; i++) {
            fac=fac *i;

        }
        System.out.println("Factorial of "+number+" is: "+fac);
    }
             */



