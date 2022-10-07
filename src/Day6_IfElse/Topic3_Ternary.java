package Day6_IfElse;

public class Topic3_Ternary {
    public static void main(String[] args) {

        /*
        if (a>0) { print ("A is positive)
        }
        else{ print ("A is not positive")
        }
        String result;
        int a= 10;
        result = (condition)? "The number is positive":"The number is not positive";

         */

        int num1 = 90;
        int num2 = 100;
        int big;
        big = (num1>num2)?num1:num2;
        System.out.println("the max number is "+big);


        if (num1>num2) {
            big = num1;
        }else {
            big = num2;
            System.out.println("the max number is: "+big);
        }
    }
}
