package Homework_StringMethod;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Homework_15 {
    public static void main(String[] args) {

        //Write a Code where user is being asked to enter a sentence
        //if Sentence starts with "B" or "b" and ends with "E" or "e" also contains "A" or "a" replace second and fourth characters with "G"

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String usentence=sentence.toUpperCase();
        boolean start = usentence.startsWith ("B");
        boolean end = usentence.endsWith ("E");
        boolean con = usentence.contains("A");
        if (start==true && end == true && con == true){
            String newName = sentence.substring(0,1)+'G'+sentence.substring(2,3)+'G'+sentence.substring(4);
            System.out.println("Your senctence is: "+newName);
        }else {
            System.out.println("Your sentence is:   "+sentence);

        }

      }
}
