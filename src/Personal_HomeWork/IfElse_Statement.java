package Personal_HomeWork;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class IfElse_Statement {
    public static void main(String[] args) {
        System.out.println("Lutfen notunuzu giriniz:");

        Scanner s = new Scanner(System.in);
        int Not = s.nextInt();
        int i = 10;
        if (i==10) {
            System.out.println("inin degeri 10 dur");
        } else if (i<10) {
            System.out.println("Inin degeri 10'dan kucuktur");

        } else {
            System.out.println("inin degeri 10'dan farklidir");
        }

        // 90+ AA
        // 80 - 90 BB
        // 70 - 80 CC
        //70 - F

    }
}
