package Day14_NestedLoops;

public class Topic5_NestedLoopExCont {

    public static void main(String[] args) {
        for (int i = 0; i <3 ; i++) {
            System.out.println("this is the first outer loop");
            for (int j = 0; j < 3; j++) {
                System.out.println("\t This is second Outer / first inner");
                for (int k = 0; k <3 ; k++) {
                    System.out.println("\t \tThis is second Outer / second inner");

                }
            }

        }
    }
}
