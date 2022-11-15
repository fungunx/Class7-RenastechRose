package Day19_MultidimmensionArrays;

public class Topic3_DimensionArrayLoop {

    public static void main(String[] args) {


        String [][] names = {  {"Ziya","Seda"},       {"Sena","Anil","Hrakar"},     {"Ferah","Onder","Fahretin","Amer"}};

        for (int i = 0; i < names.length; i++) {


            System.out.println("The row  " +i+ "  :");

            for (int j = 0; j < names[i].length; j++) {

                System.out.println(names[i][j]+ "  ");
            }


        }
    }
}
