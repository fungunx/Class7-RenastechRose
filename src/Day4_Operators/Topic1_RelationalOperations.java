package Day4_Operators;

public class Topic1_RelationalOperations {

    public static void main(String[] args) {
        //*==* Check if 2 things are equal
        boolean check = 2 == 8;
        System.out.println(check);
        int a =90;
        int b = 110;
        boolean check1 = a==b;
        System.out.println(check1);
        //"<" check if one thing is less than the other
        boolean check3= 60<118;
        System.out.println(check3);

        //<== check is one thing is less than another thing or equal to it.

        boolean check5 = 100<=500;
        System.out.println(check5);
        boolean check6 = 600<=600;
        System.out.println(check6);

        //"!=" check if 2 thins are not equal

        boolean check8 = 90 != 90;
        System.out.println(check8);

        // "!"  convert to the opposite value

        boolean check9 = !(234 != 789);
        System.out.println( check9);
        boolean check10 = !(!(90==23)==!(98>98));



    }
}
