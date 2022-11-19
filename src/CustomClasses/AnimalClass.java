package CustomClasses;

public class AnimalClass {

    public String AnimalName;
    public String AnimalType;

    public String AnimalColor;


    //This is a Constructor, This will be calls when
    // param1 us String variable, and we will use AnimalNAme
    // param1 us String variable, and we will use AnimalType
    //@param3 is String variable, and we will use it as AnimalColor
    public AnimalClass (String param1, String param2,String param3){
        AnimalName=param1;
        AnimalType=param2;
        AnimalColor=param3;

    }

    public AnimalClass (String param1, String param2){
        AnimalName=param1;
        AnimalType=param2;

    }

    // How to define contractor ClasName(ParameterType ParameterName)


}
