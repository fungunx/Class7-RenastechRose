package Homework_StringMethod;

import java.util.Scanner;

public class fsdf {
    public static void main(String[] args) {

        /*
        Write a code which asks user to enter a String and removes all the duplicate characters from the String and prints the result
ex. "AAAAAVVVCCDDAA" ==> "AVCD"

         */
        String first = "AAAAAVVVCCDDAA";
        String uni = "";
        for (int i = 0; i <=first.length()-1 ; i++) {
            if (uni.contains(String.valueOf(first.charAt(i)))){
                continue;

            }
            uni +=first.charAt(i);
        }
        System.out.println(uni);

                }
            }


