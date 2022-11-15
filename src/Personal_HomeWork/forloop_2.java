package Personal_HomeWork;

import java.util.Scanner;

public class forloop_2 {
    public static void main(String[] args) {

        //Write a code where user is being asked to enter a string, and reverse that string and print it
        //Ugur ==> rugu

        Scanner sc = new Scanner(System.in);
        System.out.println("Can you write any text please: ");
        String text = sc.nextLine();
        char a = text.charAt(0);
        String reverse = "";
        for (int i = text.length()-1; i>=0;i--){
            reverse=reverse+text.charAt(i);

        }
        System.out.println(reverse);
    }
}
