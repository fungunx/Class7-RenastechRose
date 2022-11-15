package Personal_HomeWork;

import java.util.Scanner;

public class forloop_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Type any text please");
        String name = sc.nextLine();
        String reverse ="";
        for (int i = name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);
           // System.out.println(reverse);
        }
       System.out.println(reverse);
    }
}
