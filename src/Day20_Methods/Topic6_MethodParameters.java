package Day20_Methods;

public class Topic6_MethodParameters {
    public static void main(String[] args) {

        MyMethod("Fahrettin",4534,"Gobasdere","Sabun Tutacagi");
        System.out.println("Cont from here");

        System.out.println("***********************************");

        MyMethod("Kozalak",989,"Bitlis","Tuvalet gozetmeni");

        System.out.println("***********************************");
        MyMethod("Sokuk",324, "Domalan","Sirt kasiyici");


    }
public static void MyMethod(String name,int age,String sehir, String Job){

    System.out.println("My name is  "+name);
    System.out.println("I am   "+age+" years old");
    System.out.println("I am from "+sehir);
    System.out.println("I am working as a  "+Job);


}
}
