package Day5_IfElseStatements;

public class Topic1_PrimitiveCasting {
    public static void main(String[] args) {
        // primitive casting is to change the primitive data type but when we do  casting from
        // lower level to upper level we will have issue.
        // we put the type of data in front of it.
        byte by = 40;
        System.out.println("Byte value is:"+by);
        int inNum = (int)by;
        System.out.println("The values of int:"+inNum);
        int a= 5646646;
        short b = (short) a;
        System.out.println("The b value is:"+b);
        int num1=90;
        float num2 = num1;
        System.out.println(num2);
        int num3=89;
        int num4=23;
        float num5= (float) num3/num4;
        System.out.println("the operation is:"+num5);

        // is statement is a conditional statement where it decides if the code block will execute
        if (90>=46){

            System.out.println("this is for murat");
            System.out.println("this is for me");
            int ab =10;
            System.out.println("the value of a"+a);
            System.out.println("this is for Rami");
        }




    }
}
