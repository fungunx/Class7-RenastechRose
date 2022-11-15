package Methods_HomeWorks;

public class LoopWhileLoop {
    public static void main(String[] args) {
        //If a number of iterations are not fixed we are using a while loop.


        int number1 = 70;
        int number2 = 90;
        int sum = 0;

        while (number1 < number2) {
            System.out.println(number1);
            number1++;
            if (number1 % 2 != 0) {
                System.out.println("The odd numbers between a and b: " + number1);
                sum = sum+number1;




            }
        }System.out.println(" The sum of the odd numbers between the numbers a and b: "+sum);

        }
    }
