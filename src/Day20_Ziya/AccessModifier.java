package Day20_Ziya;

import java.util.Scanner;

public class AccessModifier {

    public static void main(String[] args) {

// Write a code using access modifier asking the user what you want to pick from the menu, menu has to have
//3 different beverages, 3 different burgers, 3 different extra (French fries) and count, (included price + %13 tax)

        intro();
line();
        Burgerss();
line();
        Bevarage();


    }


    public static int intro (){

        System.out.println(" Welcome to the Ungun Burger House");
        System.out.println("Can you enter the chosen burger type and count please");




        return 0;
    }
    public static void line(){
        System.out.println("-----------------------------------------------------------");
    }
    public static void Bevarage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Can you enter the chosen Beverage type and count please");
        System.out.println( "1) GingerAle = $3 - 2) Cola = 2$ - 3)Beer = 5$");
        int bev = sc.nextInt();
        System.out.println("How many bevarage dou you want: ");
        int counter = sc.nextInt();

        if (bev == 1){
            System.out.println("We took your "+counter+ " GingerAle "+" order");
        } else if (bev == 2) {
            System.out.println("We took your "+counter+ " Cola "+" order");

        } else if (bev == 3) {
            System.out.println("We took your "+counter+ " Beer "+" order");
        }else {
            System.out.println("Please enter a valid number");
        }
    }

    public static int Burgerss(){
        Scanner sc= new Scanner(System.in);
        System.out.println( "1) Cheese Burger = $20 - 2) Double Burger = $15 - 3)Junior Burger = $9");
        int burger = sc.nextInt();
        System.out.println("How many burger dou you want: ");
        int counter = sc.nextInt();
        if (burger == 1){
            System.out.println("We took your "+counter+ " Cheese Burger "+" order");
        } else if (burger == 2) {
            System.out.println("We took your "+counter+ " Double Burger "+" order");

        } else if (burger == 3) {
            System.out.println("We took your "+counter+ " Junior Burger "+" order");
        }else {
            System.out.println("Please enter a valid number");
        }
        return burger;
    }
public static int sum (){



    return Burgerss();
}

}


