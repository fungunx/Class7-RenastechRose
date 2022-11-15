package Day19_MultidimmensionArrays;

public class Topic8_Foreachloop {
    public static void main(String[] args) {

        // write a code where user check every string values in array and see if that string has "a" in it:

        String[]str= {"Alibaba","Omur","Gorken","Nasrettin","Hoca"};

        for (String var:str){
            if (var.contains("a")|| var.contains("A")) {
                System.out.println("The word:  " + var + "  Contains A or a");
            }else System.out.println("The word:  " + var + "   is not contains A or a");
        }

    }
}
