package Day24_ArrayList;

import java.util.ArrayList;

public class Topic4_RemoveElements {
    public static void main(String[] args) {

        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");

        System.out.println("********************************************");

        /*
        To remove an element from array list, we can use remove () method of the Arraylist class
         */

        System.out.println(RandomWords);
        RandomWords.remove(RandomWords.indexOf("youth"));
        System.out.println("Modifed array list: "+RandomWords);
        System.out.println("********************************************");
        System.out.println(RandomWords);
        RandomWords.remove("mud");
        System.out.println("Midified ArrayList:  "+RandomWords);
        System.out.println("********************************************");
        String ReturnOfRemoveIndex = RandomWords.remove(0);
        System.out.println(RandomWords);

        System.out.println("********************************************");
        System.out.println(RandomWords);
        boolean DidIRemoveTheMud = RandomWords.remove("mud");
        System.out.println("Midified ArrayList:  "+DidIRemoveTheMud);







    }
}
