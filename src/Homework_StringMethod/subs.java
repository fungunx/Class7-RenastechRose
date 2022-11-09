package Homework_StringMethod;

public class subs {
    public static void main(String[] args) {
        String name4 = "Diana";
        String subname4 = name4.substring(2);
        System.out.println("The substring value is"  +subname4);
        String name5 = "Ali Ekinci";
        String subname5 = name5.substring(2,6); // index=>2 And index<6
        System.out.println("The value of the subname5:" +subname5);
        System.out.println("**************************************************");

        String name = "Fahrettin";
        String subname = name.substring(1,4);
        System.out.println(subname);
    }
}
