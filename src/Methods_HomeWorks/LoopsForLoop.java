package Methods_HomeWorks;

public class Loops {
    public static void main(String[] args) {
        /*
        Loop is used for programming language a specific block of code a number of times until the condition is met.
There are different types of loops in Java;
         */
        //For Loop; If you know exactly how many times you want to loop through a block of code, use the for loop
        // Find the odd numbers between a and b
        int a = 70;
        int b = 90;
        int sum = 0;
        int resultEven = 0;
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                System.out.println("\tThe odd numbers between a and b: " + i);
                sum = sum+i;



        }            }System.out.println(" The sum of the odd numbers between the numbers a and b: "+sum);


    }}