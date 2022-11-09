package Homework_StringMethod;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class Homework_24 {
    public static void main(String[] args) {
        /*
        Write  code where user is being asked to enter a String and that checks if the String is Palindrome
PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)
         */ //
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you write any news related any topic please?:  ");
        String topic = sc.nextLine();
        String low = topic.toLowerCase();
        String reverse ="";
        for (int i = low.length()-1; i >=0 ; i--) {
            reverse=reverse+low.charAt(i);}
            if (low.equals(reverse)){
                System.out.println(low+"   is a Palindrome");
            } else if (!low.equals(reverse)) {
               System.out.println("This is not a Palindrome");
                
            }


        }


    }


