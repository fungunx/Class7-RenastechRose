package Day18_ArraysUtil;

import java.util.Arrays;

public class Topic1_Split {
    public static void main(String[] args) {
        //Split() method un Arrays Unit, It creates a string Array based on the given Char

        String names = "Ziya Hrakar Nilufer Sena";
        System.out.println("The string name is "+names);

        String [] nm =names.split(" ");

        System.out.println("nm contains:  "+ Arrays.toString(nm));
        System.out.println("the length of nm array is  "+nm.length);
        System.out.println("the first element is:  "+nm[0]);
        System.out.println(nm[0]+nm[1]);


        System.out.println("******************************************************");
        String num2 = "123456564175443541545";
        String [] numbers = num2.split("1"); //""
        System.out.println("The num array is  "+Arrays.toString(numbers));


        System.out.println("******************************************************");
        String var = "ThisIsJusaString";
        String []var1 =var.split("");
        System.out.println("The var values  : " +Arrays.toString(var1));

        System.out.println("******************************************************");
        String forbid = "Thisisjust a TEST";
        String [] tst =forbid.split("."); // you can not use * ? on the split
        System.out.println("******************************************************");
        String var2 = "TJISISATESTFORALI";
        String [] test = var2.split("",4);
        System.out.println("The test array is: "+Arrays.toString(test));

        System.out.println("******************************************************");
        String var3 = "This is just a test but I want to try again";
        String[]test1=var3.split(" ",20);
        System.out.println("The test1 values is:   "+Arrays.toString(test1));




    }
}
