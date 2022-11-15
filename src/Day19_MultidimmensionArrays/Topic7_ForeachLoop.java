package Day19_MultidimmensionArrays;

public class Topic7_ForeachLoop {
    public static void main(String[] args) {

        String[] names = {"Ziya", "Ali", "Nureddin", "Amer"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("the names is:  " + names[i]);

        }
        System.out.println("****************************************************************************");
        for (String name : names) {
            System.out.println("The names is   " + name);
        }

        /*
        for (Datatype variableName:Collection) {
        Code Block
         */

        System.out.println("****************************************************************************");

        int[] numbers = {2, 3, 4, 6, 34, 34, 545453, 234234, 55432};
        for (int a : numbers) {
            if (a % 2 == 0) {
                System.out.println("number " + a + "   is even");

            } else {
                System.out.println("number " + a + "   is even");
            }


        }
    }}