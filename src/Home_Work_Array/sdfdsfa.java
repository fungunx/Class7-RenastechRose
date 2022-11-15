package Home_Work_Array;

import java.util.Arrays;
import java.util.Scanner;

public class sdfdsfa {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word please:");
        String word = sc.nextLine();
        char[] array = new char[3];
            for (int i = 0; i < word.length() - 2; i++) {
            array[0] = word.charAt(i);
            array[1] = word.charAt(i + 1);
            array[2] = word.charAt(i + 2);
            if (array[0] == array[2]) {
                String str = new String(array);
                System.out.println(str+ " is a palindrome.");
            }

        }

    }}

//         */ //
//    Scanner scan = new Scanner(System.in);
//            System.out.print("Please enter a word: ");
//            String word = scan.nextLine();
//            char [] array = new char[3];
//            for (int i = 0; i < word.length()-2; i++) {
//                array[0] = word.charAt(i);
//                array[1] = word.charAt(i + 1);
//                array[2] = word.charAt(i + 2);
//                if (array[0] == array[2]) {
//                    String str = new String(array);
//                    System.out.println(str+ " is a palindrome.");
      /*
  Write a code where user is being asked to enter a word,
  find home many 3 character palindrome substrings are in the given Word and print each one of them
  ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD" there are 6 Palindrome three Char substring)
   */

