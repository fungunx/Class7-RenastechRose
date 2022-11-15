package Home_Work_Array;

import java.util.Scanner;

public class HomeWork_35 {

    /*
  Write a code where user is being asked to enter a word,
  find home many 3 character palindrome substrings are in the given Word and print each one of them
  ( example : Word :  "BIBOBOBPIPDUD" : BIB , BOB, OBO, BOB, PIP, DUD" there are 6 Palindrome three Char substring)
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any word please: ");
        String sentece = scan.nextLine();
        String[] words = sentece.split("");
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            String word = words[i];
            if (word.length() < 3) {
                continue;
            }
            System.out.println("Word"+word);
            for (int j = 0; j < word.length() - 2; j++) {
                String sub = word.substring(j, j + 3);
                String reverse = "";
                for (int k = sub.length() - 1; k >= 0; k--) {
                    char c = sub.charAt(k);
                }
                if (sub.equals(reverse)) {
                    count++;
                }

            }
            System.out.println("The word:" + word + " has " + count + " Polindrome 4 char substring");
        }
    }}
