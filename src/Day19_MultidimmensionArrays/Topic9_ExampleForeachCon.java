package Day19_MultidimmensionArrays;

public class Topic9_ExampleForeachCon {
    public static void main(String[] args) {

        String name = "Hrakar Ali Amer";

        char [] charArray =name.toCharArray(); // conver String to char array you can use eachloop
        int count =0;
        for (char ch:charArray){
            if (ch == 'a'|| ch == 'A'){
                count++;

            }
        }
        System.out.println("The count od a's in the"+name +" string is:  "+count);
    }
}
