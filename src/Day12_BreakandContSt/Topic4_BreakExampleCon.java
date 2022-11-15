package Day12_BreakandContSt;

import java.util.Scanner;

public class Topic4_BreakExampleCon {
    public static void main(String[] args) {

        // user is being asked to enter a name restructure the name but as soon as it sees the "l" you
        //should stop restructure
        // Kyle == >Ky
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name =sc.next();
        String name1 = name.toLowerCase();
        
        String rename ="";
        for (int i = 0; i <name1.length() ; i++) { // length -1

            if (name.charAt(i)=='l'){
                break;
            }
            rename=rename+name1.charAt(i);
        }
        System.out.println("The rename value is:"  +rename);

    }
}
