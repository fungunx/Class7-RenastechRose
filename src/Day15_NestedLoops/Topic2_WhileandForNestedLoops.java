package Day15_NestedLoops;

public class Topic2_WhileandForNestedLoops {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
        System.out.println("The i value:  " + i);
        for (int j = 1; j < 10; j++) {
            System.out.println("\t for each i value: " + i + " j value    " + j);


        }i++;
    }
}}