package Personal_HomeWork;

import java.util.Scanner;

public class forloop {

    public static void main(String[] args) {

//        for (int i = 0;i< 10; i++){
//            System.out.println(" I love dogs!");
/*

public class Topic4_ReverseString {
    public static void main(String[] args) {
        //Write a code where user is being asked to enter a string, and reverse that string and print it
        //Ugur ==> rugu

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter something on the console that you want to reverse");
        String input = scan.nextLine();
        // ziya ==>ayiz
        //String name = "Ziya";
        char ch = input.charAt(0);
        System.out.println("the first character:   " +ch);
        char ch1 =input.charAt(1);
        System.out.println("the second character:  "+ch1);
        System.out.println("the length of String is:  " +input.length());
        System.out.println("the last character: " +input.charAt(input.length()-1));

        String reverse = "";

        for (int i = input.length()-1; i>=0;i--){
            reverse = reverse + input.charAt(i); // revers = ""+l==>L
                                                 //reverse = l+e=le
                                                 //reverse = le+y = ley
        }
        System.out.println("the reverse of the input is:    "+reverse);
//  //charAt()	          Returns the character at the specified index (position)	        char
//        String str1 = "Tanya"; // T ==> 0,  a==> 1, n==>2, y==> 3, a==>4
//        char ch = str1.charAt(0);
//        System.out.println("the char at the position 0 (or Index 0)"+ch);
//        System.out.println("the char at the position 2 (or Index 2)"+ str1.charAt(2));
//        System.out.println("the char at the position 3 (or Index 3)"+ str1.charAt(4));

    }

}

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name:  ");
        String Name1 = sc.nextLine();
        char ch = Name1.charAt(0);
        System.out.println(ch);
        System.out.println(Name1.length());
        System.out.println(Name1.charAt(Name1.length()-1));
        String reverse = "";
        for (int i = Name1.length()-1; i>=0;i--){
            reverse = reverse + Name1.charAt(i);

        }
        System.out.println(reverse);

        }
    }
