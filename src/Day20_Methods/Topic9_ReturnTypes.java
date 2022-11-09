import java.io.FilterOutputStream;

public class Topic9_ReturnTypes {

    public static void main(String[] args) {

        //  Kitchen("Tomato","Seasalt","Oliveoil");
        System.out.println("The food is: " + Kitchen("Tomato", "Seasalt", "Oliveoil"));


        int result = Sum2nums(45, 23);
        System.out.println("the result is: " + result);
    }


    public static String Kitchen(String Veggies, String Salt, String Oil) {

        String food = Veggies + Salt + Oil;
        return "Menemen";

        /*
        Access Modifiers Specifiers Return Type(String, Int, Object, Array, List) MethodName(Params){
        code block

        return a value or a variable whichis the same data type with your return type
       }
         */

    }


    public static int Sum2nums(int a, int b) {
        int sum = a + b;
        return sum;

    }
}