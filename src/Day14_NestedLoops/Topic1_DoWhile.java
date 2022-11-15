package Day14_NestedLoops;

import java.util.Scanner;

public class Topic1_DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 char String");
        String st = scan.next();
        int j = 0;
        do {
            System.out.println("The first char of the String is: " + st.charAt(j));
            j++;
        } while (j < 0);
    }
}