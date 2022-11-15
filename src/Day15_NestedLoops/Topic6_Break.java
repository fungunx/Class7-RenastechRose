package Day15_NestedLoops;

public class Topic6_Break {
    public static void main(String[] args) {
GOD://label
        for (int i = 0; i < 10; i++) {
            System.out.println("From Outer Loop i value  "+i);
            for (int j = 1; j < 10; j++) {

                if (i == 5 || j == 4){
                    break GOD;
                }
                System.out.println("from the Unner Loop i:   "+i+"   j value:  "+j);

            }

        }
    }
}
