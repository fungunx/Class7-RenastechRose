package Day3_OperationsandStrings;

public class Topic2_Strings {
    public static void main(String[] args) {

        //Strings are not primitive data type, they are non-primitive data type.
        //Datatype = a value;

        String name = "Fahrettin";
        System.out.println(name);
        String prag = "This is a paragraph";
        System.out.println(prag);
        String POK = "432434324 ^$#@#@!# 433fsdfdsf dsfdsfdFDFDSFDSFSD$%%$#%";
        System.out.println(POK);
        String numbers = "5678"; //this is not a number anymore, it is text
        System.out.println(numbers);
// combine 2 text
        String txt1 = "this is text 1";
        String txt2 = "this is text 2";
        String txt3 = "this is text 3";
        System.out.println(txt1+txt2);
String number2 = "98";
String number3 = "80";
    System.out.println(txt3);
        String number4 = number2+number3;
        System.out.println(number4);
        System.out.println("This is hello world\t" + "This is second hello world");
int num = 89;
        System.out.println("This is the number from int:" +num);
    // (+) Addition
        int num1 = 90;
        int num2 = 80;
        int num3 = num1+num2;
        System.out.println(num3);
        System.out.println("The result is:" +num3);
        System.out.println("This is the result in different way:" +num1+num2);
        System.out.println("This is the result in different way:" +(num1+num2));
        int num4 = 300;
        float num5 = 98.56f;
        float num6 = num4+num5;
        System.out.println("this is result is:"+num6);
        double num7 = 98.56852;
        int num8 = 900;
        double num9 = num7+num8;
        System.out.println("the result for double-int is=" +num9);

        //(-) subtraction

        int num10 = 67;
        int num11 = 9000;
        int result = num10-num11;
        System.out.println("the result is:"+(-1*result));

        //(*) multiplication
        int num12 = 95;
        int num13 = 98;
        int result1 = num13 * num12;
        System.out.println("the result is:"+result1);
        double num14 = 89.543;
        double num15 = 87;
        double result10 = num14*num15;
        System.out.println(result10);
        //(/) division
        int num16 = 89;
        int num17 = 40;
        float nresult = (float)num16/num17; //(int/int)
        System.out.println(nresult);
        System.out.println((float)num16/num17);
        double num19 = 89.548233;
        double num20= 3.876;

        double result6= num19/20;
        System.out.println(result6);
        // (%) modulus (mod) // gets the remainder of the division
        int num21=98;
        int num22=3;
        int num23=num21%num22;
        System.out.println("the result of mod:"+num23);

        double num24 = 90.45;
        double num25 = 8.56;
        double modresult=num24%num25;
        System.out.println(modresult);

    }
}
