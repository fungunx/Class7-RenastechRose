package Day8_Scanners;

import java.util.Scanner;

public class Topic2_nextVsnextLine {
    public static void main(String[] args) {
        // Next () ==> It will read a word from the console
        // Java Class (just "Java" will be scanned
        // Nextline () ==> It reads the whole line on the console. It will stop at the next Line.
        // Java Class (whole line "Java Class" will be scanned

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your first name and last name:  "   );

        String name = sc.nextLine();
        System.out.println("Your first and last name is:  "+name);

        System.out.println("Please enter your phone number:  ");
        String phone = sc.nextLine();
        System.out.println("Your name is : "+name + "   Your phone number is:  "+phone);

    }
}
