package Day25_Classes;

public class Topic1_IntroToClasses {

    public static void main(String[] args) {
        String Car2Make = "BMW";
        String Car2Model ="M3";
        String Car2Color = "Black";

       PrintCar(Car2Make,Car2Model,Car2Color);
        System.out.println("********************************************************");
        String Car1Make="Ford";
        String Car1Model="Mustang";
        String Car1Color = "Red";
        PrintCar(Car1Make,Car1Model,Car1Color);

       // String MyString = new String("Something");
        Car MySportsCar = new Car ();
        MySportsCar.Make ="Subaru";
        MySportsCar. Model="BRZ";
        MySportsCar.Colour="Blue";
        MySportsCar.ModelYear=2021;

PrintCarClass(MySportsCar);

    }

    //This method will print Car spesification
    //@Param1 is a car class that will we use as our parameter
    public static void PrintCarClass(Car param1){
        System.out.println("********************************************");
        System.out.println("MAke:" +param1.Make);
        System.out.println("MAke:" +param1.Model);
        System.out.println("MAke:" +param1.Colour);
        System.out.println("Model Year:" +param1.ModelYear);


    }

    // This method will print Car specifications.
    // @param1 is a String parametre that will use a Make name
    // @param2 is a String parameter that we will use a Model name

    public static void PrintCar (String param1, String param2, String param3){

        System.out.println("Make: "+param1);
        System.out.println("Model: "+param2);
        System.out.println("Colour: "+param3);


    }
}
class Car{
    //Fields
    String Make;
    String Model;
    String Colour;
    int ModelYear;
}

