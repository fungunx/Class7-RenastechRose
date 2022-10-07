package Day4_Operators;

public class Topic2_LogicalOperations {
    public static void main(String[] args) {
        //AND ===> "&&" in order for the operation to result true all the operations should be true

        boolean checklogic = true&&true;
        System.out.println(checklogic);

        boolean logic1 = (78==90)&&(876 !=8907)&&(98>23); // false && true && true - result is false
        System.out.println(logic1);

        // OR ==> "||" in order have a true logical operation It is enough to have only one ture.

        boolean logic3 = false || false || false || true;
        System.out.println(logic3);
        boolean logic4 = !((90 == 90) || (90!=80) || (76>90));
        System.out.println(logic4);
        boolean logic5 = ((89==89)&&(45>=23)||((67<=90)&&(true))); // true && true || ture && ture
        System.out.println(logic5);

    }
}
