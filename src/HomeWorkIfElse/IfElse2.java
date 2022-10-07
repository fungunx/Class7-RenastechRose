package HomeWorkIfElse;

public class IfElse2 {
    public static void main(String[] args) {
        String firstname = "Fahrettin";
        String lastname = "Ungun";
        Integer creditscore = 52;
        if (creditscore<500){
            System.out.println(firstname + lastname +"has bad credit score");
        }else if (creditscore>=500 && creditscore<700){
            System.out.println(firstname + lastname +"has average credit score");
        }else if ( creditscore>=720 && creditscore<740){
            System.out.println(firstname + lastname +"has good credit score");
        }else {
            System.out.println(firstname + lastname +"has great credit score");
        }}}