package Day7_SwitchStatements;

public class Topic3_SwitchExample {

    public static void main(String[] args) {
        // write a code where it prints the name of the day based on the weeks day

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("the 1st day of the week is Monday");
                break;
            case 2:
                System.out.println("the days 2nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("the 3rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("the 4th of the weeks Thursday");
                break;
            case 5:
                System.out.println("the 5th of the weeks Friday");
                break;
            case 6:
                System.out.println("the 6th of the weeks Saturday");
                break;
            case 7:
                System.out.println("the 7th of the weeks Sunday");
                break;
            default:
                System.out.println("Invalid Day of the week");
        }
    }
}
