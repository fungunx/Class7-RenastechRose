package Day23_MethodsOverloadWrapperRecap;

import java.util.Scanner;

public class Topic3_CheckPrimeNumberInMethod {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the lowest number:  ");
        int low = scan.nextInt();


        System.out.println("Please enter the highest number:  ");
        int high = scan.nextInt();

        for (int i = low; i <= high; i++) {
            if (CheckPrimeNumber(i) ==true){

                System.out.print(i + " ");
            }

        }

    }

    public static boolean CheckPrimeNumber(int parem1) {

        boolean IsItPrimeNumber = true;

        for (int i = 2; i < parem1; i++) {
            if (parem1 % i == 0) {
                IsItPrimeNumber = false;
                break;
            }

        }
        return IsItPrimeNumber;
    }
}