package Day25_Classes;

import java.util.Scanner;

public class Topic2_IntroToClassesCont {
    public static void main(String[] args) {

        StudentRegistrationForm MyForm = new StudentRegistrationForm();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Your Name:  ");
        MyForm.NAme=scan.nextLine();
        System.out.println("Please enter Your Surname: ");
        MyForm.Surname=scan.nextLine();
        System.out.println("Please enter Your Age: ");
        MyForm.Age=scan.nextInt();
        System.out.println("Please enter Your Gender:");
        MyForm.Gender=scan.next();

        MyForm.PrintRegistrationForm();

    }
}

class StudentRegistrationForm {

    String NAme;
    String Surname;
    int Age;
    String Gender;



    //Method
 void PrintRegistrationForm(){

     System.out.println("Name: "+NAme);
     System.out.println("Surname: "+Surname);
     System.out.println("Age: "+Age);
     System.out.println("Gender: "+Gender);



    }

}