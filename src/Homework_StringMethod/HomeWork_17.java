package Homework_StringMethod;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWork_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraf = "hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.   I have been in IT industry for about 6 years. I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing. I have experience in EducatION, energy,finance and some manY Other AREAs. i HAve scrum master and Oracle java Programmer certificates.   i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.";
        System.out.println("What is your Name:");
        String Name = sc.next();
        System.out.println("What is your age:");
        String Age = sc.next();
        System.out.println("Which city do you live:");
        String City = sc.next();
        Pattern p = Pattern.compile("([\\.\\?\\!])");
        String[] result =p.split(paragraf);

        for (int i = 0; i < result.length; i++) {
            result[i]=result[i].trim();
            result[i]=result[i].substring(0,1).toUpperCase()+result[i].substring(1).toLowerCase();
            result[i]=result[i].replaceFirst("<yourname>",Name);
            result[i]=result[i].replaceFirst("<yourcity>",City);
            result[i]=result[i].replaceFirst("<yourage>",Age);
            System.out.println(result[i]);

        }
        for (int i = 0; i < result.length ; i++) {
            System.out.println("Sentence"+(i+1)+"  First character is: "+result[i].charAt(0)+"  Forth character is:"+result[i].charAt(4)+"  Fifth character is:"+result[i].charAt(5));

        }
        String New ="";
        for (int i = 0; i < result.length; i++) {
            New=New.concat(result[i]+".\n ");

        }
        System.out.println(New);

    }
}


