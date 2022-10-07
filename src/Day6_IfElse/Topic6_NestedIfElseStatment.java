package Day6_IfElse;

public class Topic6_NestedIfElseStatment {
    public static void main(String[] args) {
        // Last NAmes = Doe, Yilmaz, Ekinci
        // If last name is yilmaz and the age is over 20 print tle lastname and the age if not just print tha name
        //if lastname us Doe and tha age is over 10 print just the lastname if not print the just age
        // if it is Ekinci print lastname and age

        String lastname = "Doe";
        int age = 21;

        if (lastname == "Yilmaz"){
            if(age>10) {
                System.out.println("The Lastname is: " + lastname + "the age is:" + age);
            }else{
                System.out.println("Just Lastname:" +lastname);
            }

        } else if (lastname == "Doe") {
            if(age>10){
                System.out.println("Just the Lastname" +lastname);

            }else{
                System.out.println("Just the Age");
            }
        }else{
            System.out.println("Lastname:"+lastname+"Age:"+age);
        }
    }
}
