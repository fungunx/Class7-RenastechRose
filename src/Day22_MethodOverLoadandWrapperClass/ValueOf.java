package Day22_MethodOverLoadandWrapperClass;

import static Day22_MethodOverLoadandWrapperClass.RecapMethodOverload.line;

public class ValueOf {

    public static void main(String[] args) {

        String str = "20";
        System.out.println(str);

        line();

        int number = Integer.valueOf(20);
        int number2 = Integer.valueOf(-20);
        System.out.println(number+10);
        System.out.println(number+number2);

    }





}