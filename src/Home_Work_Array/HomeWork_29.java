package Home_Work_Array;

public class HomeWork_29 {
    public static void main(String[] args) {

        /*
        write a code with following requirements
- define an array with following values {90,34,23,87,45,36,98}
- Print the values that can be divided by 2 or 3
         */

        int [] num = {90,34,23,87,45,36,98};

        for (int i = 0; i <num.length ; i++) {
            if (num[i]%2==0) {
                System.out.println(num[i]+ "  divided by 2.");
            } else if (num[i]%3==0) {
                System.out.println(num[i]+ "  divided by 3.");

            }

        }
    }}
