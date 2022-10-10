package Day7_SwitchStatements;

public class IfElseElseExample {
    public static void main(String[] args) {

        //write a code here students are placed in the classes based on individual preference and knowledge.
        // Our School allows student to have only one preference
        String FirstName = "Eloise";
        String Pre = "SE";
        int Level = 3;

        if (Pre == "QA") {
            if (Level == 1) {
                System.out.println(FirstName + "is placed in beginner Level Class for QA");
            } else if (Level == 2) {
                System.out.println(FirstName + "is placed in mid Level Class for QA");
            } else {
                System.out.println(FirstName + "is placed in advance Level Class for QA");
            }
        } else if (Pre == "SE") {
            if (Level == 1) {
                System.out.println(FirstName + "is placed in beginner Level Class for SE");
            } else if (Level == 2) {
                System.out.println(FirstName + "is placed in Mid Level Class for SE");
            } else {
                System.out.println(FirstName + "is placed in advance Level Class for SE");
            }

        } else if (Pre == "DA") {
            if (Level == 1) {
                System.out.println(FirstName + "is placed in Begginer Level Class for QA");
            } else if (Level == 2) {
                System.out.println(FirstName + "is placed in Mid Level Class for QA");
            } else {
                System.out.println(FirstName + "is placed in Advance Level Class for QA");
            }

        }
    }
}
