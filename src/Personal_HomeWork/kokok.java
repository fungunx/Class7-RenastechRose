package Personal_HomeWork;

import java.util.Scanner;

public class kokok {
    public static void main(String[] args) {



OddNumber();

    }


    public static int Any (){

        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number");
        int numbers = sc.nextInt();




        return numbers;
    }
    public static void Aa(){
        System.out.println("Your number is"+Any());

    }
    public static double Bew(){

        double b = (double) (Any()*1.13);
        System.out.println("Your tax included price is:  "+b);

        return b;
    }

    public static void OddNumber (){

        double b = Bew();
        for (double i = 0; i < b; i++) {
            if (i % 2 != 0){
                System.out.println("The number of " +i+" is an odd number");

            }

        }
    }



}
