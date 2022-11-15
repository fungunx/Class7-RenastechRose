package Day23_MethodsOverloadWrapperRecap;

public class Method {

    public static void main(String[] args) {

        /*
    Define 2 numbers and print sum of them

    define a string variable and print lowercase of it.

    define 2 numbers and print numbers from 1 to sum of them.

    define another string and print lowercase of it
 */
        int a=5;
        int b=4;
        //int sum = a+b;
        int sum =Add(a,b);
        System.out.println(sum);

       // String s1="RenasTech";
        //System.out.println(s1.toUpperCase());
        PrintLowerCase("FahrEttin");

        int c = 7;
        int d = 3;
       // int sum2 = c+d;
        int sum2 = Add(c,d);

        for (int i = 0; i <=sum2 ; i++) {
            System.out.println(i);


        }
       // String s2="WhatEver";
        //System.out.println(s2.toLowerCase());
        PrintLowerCase("RensTech");

    }
    public static int Add(int param1, int param2){

        return param1*param2;

    }

    public static void PrintLowerCase(String param1){
        System.out.println(param1.toUpperCase());
    }




}
