package Day12_BreakandContSt;

public class Topic5_ContinueStatement {
    public static void main(String[] args) {
        // We use continue key word to disregard that iteration when certain conditions are met

        for (int i = 0; i <10 ; i++) {

            System.out.println("The i value iteration:  "+i);
            if (i==5){
                continue;

            }
             System.out.println("The i value iteration:  "+i);
        }
    }
}
