package Day22_MethodOverLoadandWrapperClass;

import java.util.ArrayList;

import static Day22_MethodOverLoadandWrapperClass.RecapMethodOverload.line;

public class Parsing {

    // parse method: converts string of text to the primitives

    public static void main(String[] args) {
        String str = "1900";

        System.out.println(str+55);

        line();

        int number = Integer.parseInt(str);

        System.out.println(number+55);


        int primitve = 5;

        Integer wrapper = new Integer(5 );
        Integer wrapper2 = 5;

        ArrayList<Integer> myNumber = new ArrayList<Integer>();



    }
}
