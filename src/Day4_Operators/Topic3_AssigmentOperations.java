package Day4_Operators;

public class Topic3_AssigmentOperations {
    public static void main(String[] args) {
        int a = 80;
        System.out.println(a);
        a=90; // a value is a 90 now.
        System.out.println(a);
        a = a+40; // get a values add 50 and assing back to a; // at this point a value is    130
        System.out.println(a);
        a=a+40;
        System.out.println(a);
        int b = 100;

        b = b-30;
        System.out.println(b);
        b-=10;
        System.out.println(b);

        int theanswer = b-a;
        System.out.println(theanswer);


    }
}
