package Personal_HomeWork;

import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name :");
        String name = sc.next();
        System.out.println("What is your year of birth (you must be +18):");
        int date = sc.nextInt();
        System.out.println("What is your lucky number (1 to 10:)");
        int luckynumber = sc.nextInt();
        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        int winner = (answer);
        if (luckynumber>11){
            System.out.println("Your have to pick a number must be in 1 to 10.");
         }
        else if (2022-date<18 ) {
            System.out.println("You can not join lottery because of your age , Sorry");

         } else if (2022-date>=18 && luckynumber == winner ) {
            System.out.println("Congrats You won $1 million");
        }else System.out.println("Please try again" +" Winner Number is:"  +answer);



    }
}
