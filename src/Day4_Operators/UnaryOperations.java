package Day4_Operators;

import javax.swing.plaf.basic.BasicOptionPaneUI;

public class UnaryOperations {
    public static void main(String[] args) {
        // (+) does not have any effect on the value // 100, +100, =70, +-70

        int anum = 900;
        anum=+anum;
        System.out.println(anum);

        int anum2= 9000;
        anum2=+anum2;
        System.out.println(anum2);

        // (-) coverts to opposite sign
        int anum3=-788;
        anum3=-anum3;
        System.out.println(anum3);

        int anum4 = 345;
        anum4=-anum4;
        System.out.println(anum4);

        // (++) increase by one
        int anum6=94;
        anum6++;
        System.out.println(anum6);
        anum6++;
        System.out.println(anum6);

        ++anum6;
        System.out.println(anum6);

        //(--) decrease by one

        int num7 = 36;
        num7--; //num-1 (--)
        System.out.println(num7);
        --num7;
        System.out.println(num7);





    }

}
