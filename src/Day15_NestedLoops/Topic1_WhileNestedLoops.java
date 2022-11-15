package Day15_NestedLoops;

public class Topic1_WhileNestedLoops {
    public static void main(String[] args) {
        /*
        while (codition){
            //Code block
            while (condition2){
                // second Code Block
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
            }
        }

             */


        int i = 0;
        int j = 1;
        while (i < 10) {
            System.out.println("the value of i is:  " + i+"   ");

            while (j < 10) {
                System.out.println("For each i:  " + i + "    value  " + "  the j value:  " + j);
                j++;

            }
            i++;


        }


    }


}
