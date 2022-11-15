package Personal_HomeWork;
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to Ungun Store and We give 10% discount on purchases over 1000 dollars");
        System.out.println("How much is the product?");
        double product = sc.nextDouble();
        System.out.println("How many products did you buy? ");
        double many = sc.nextDouble();
        double total = (product * many);
        double discount = (total - (total * 10 / 100));
        double tax = (discount * 1.13);
        if (total >= 1000)         {
            System.out.println(" Your total price is:" + (total) + "$" + "    +%10 discount" + "  +%13 tax");
            System.out.println("Your discount included price is: " + discount + "$");
            System.out.println("Tax included total price is:   " + tax + "$");
            System.out.println("Thank you for choosing us...");

        }else if (total < 1000) {
            System.out.println("You must shop over $1000 for the discount");
            System.out.println(" Your total price is:"+(total)+"$"+"  +%13 tax");
            System.out.println("Your tax included price is: "+ (total*1.13)+"$");
            System.out.println("Thank you for choosing us...");
    }
}}