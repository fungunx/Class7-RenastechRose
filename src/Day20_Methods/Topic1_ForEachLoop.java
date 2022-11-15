package Day20_Methods;

public class Topic1_ForEachLoop {
    public static void main(String[] args) {

        //Write a code where user is given array of String that contains given animal's names
        // find which one of those animals has 'O' in the name.


        String [] Animals = {"Cat","Dog","Monkey","Rabbit"};

        for (String animal:Animals){ // animal = "Cat" // first iteration
                                     // animal = "Dog" // second iteration
                                     // animal = "Monkey" // third iteration
                                     // animal = "Rabbit" // fourth iteration
           if( animal.contains("o") || animal.contains("O")){
               System.out.println("The animal " +animal+ "  has o or O in the name");


           }


        }
    }
}
