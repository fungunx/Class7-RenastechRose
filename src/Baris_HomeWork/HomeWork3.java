package Baris_HomeWork;

public class HomeWork3 {

        /*
        write a method where it takes 2 double values and 1 integer value. .
        When the integer value is 1 it returns to sum of the 2 double numbers,
        when integer is 2 it returns the subtraction of those 2 double number,
        when integer value is 3 it returns to the multiplication of those 2 double numbers,
        and when the integer value is 4 it returns the division of those 2 double numbers
         */

        public static void main(String[] args) {

            System.out.println("<For sum enter (1), for subtraction enter (2), for multiplication enter (3), for division enter (4)>");

            System.out.println(calculation(3,43,3));

        }

        public static int calculation(int number, double d1, double d2){
            if (number==1){
                double v = d1 + d2;
                System.out.println("The result of d1+d2 is: " +v);
            }else if (number==2){
                double z = d1-d1;
                System.out.println("The result of d1-d2 is: " +z);
            }else if (number==3){
                double x = d1*d2;
                System.out.println("The result of d1xd2 is: " +x);
            } else if (number==4) {
                double t = d1/d2;
                System.out.println("The result of d1/d2 is: " +t);

            }else {
                System.out.println("Enter a valid number please");
            }

            System.out.print("Your selected number is: ");return number;
        }
    }
