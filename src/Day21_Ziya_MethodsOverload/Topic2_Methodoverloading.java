package Day21_Ziya_MethodsOverload;

public class Topic2_Methodoverloading {

    // MEthod overloading is where we use the method to handle same action with multiple/different inputs.

    public static void  NAME (String fname){
        System.out.println(" The first name is: "+fname );
    }
    public static void NAME(String FName, String LName){
        System.out.println("The first name: "+FName+ " Last Name: "+LName);
    }

    public static void main(String[] args) {
        NAME("Fahrettin");
        NAME("FAHRETTIN","Ungun");
        System.out.println(NAME("Fahrettin", "Ungun", 38));
    }

    public static String NAME(String FName, String LName, int Age){

        return "The first name: "+FName+ " Last Name: "+LName+ " Age is: "+Age;
    }




}
