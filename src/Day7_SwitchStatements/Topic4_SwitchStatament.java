package Day7_SwitchStatements;

public class Topic4_SwitchStatament {

    public static void main(String[] args) {

        int day = 2;
        switch (day) {
            case 1:
                System.out.println("the 1st day of the week is Monday");
            case 2:
                System.out.println("the days 2nd day of the week is Tuesday");
            case 3:
                System.out.println("the 3rd day of the week is Wednesday");
                break; //break is where the code stop executing the code inside the switch statements
            case 4:
                System.out.println("the 4th of the weeks Thursday");
            case 5:
                System.out.println("the 5th of the weeks Friday");
            case 6:
                System.out.println("the 6th of the weeks Saturday");
            case 7:
                System.out.println("the 7th of the weeks Sunday");
            default:
                System.out.println("Invalid Day of the week");
        }


    }
}
