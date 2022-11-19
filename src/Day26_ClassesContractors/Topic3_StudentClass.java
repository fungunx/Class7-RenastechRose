package Day26_ClassesContractors;

import CustomClasses.AnimalClass;
import CustomClasses.StudentClass;

public class Topic3_StudentClass {
    public static void main(String[] args) {

        StudentClass MystudentClass= new StudentClass();


        AnimalClass MyAnimal =new AnimalClass("Lion","Cat","Yellow");
//        MyAnimal.AnimalNAme = "Lion";
//        MyAnimal.AnimalType="Cat";
        System.out.println(MyAnimal.AnimalType);
        System.out.println(MyAnimal.AnimalName);
        System.out.println(MyAnimal.AnimalColor);

        AnimalClass MyPenguin = new AnimalClass("Penguin","Bird","White");

        System.out.println(MyPenguin.AnimalColor+" "+MyPenguin.AnimalName+" "+MyPenguin.AnimalType);

    }



}
