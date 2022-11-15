package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic2_CharArray {
    public static void main(String[] args) {

        String name = "This is + * Ziya Yilmaz";
        char [] ch =name.toCharArray(); // It returns to a char array with every single char in the String.

        System.out.println("This is char arrays:  "+ Arrays.toString(ch));

        // "R",'R'

        String test = "This is a test";
        String[] StArray = test.split(""); // {"T", "h","i","s"," ",....}
        char [] ChArray = test.toCharArray();// {'t','h',i'.....}
        char a = ChArray[0];


    }
}
