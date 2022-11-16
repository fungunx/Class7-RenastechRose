package Day24_ArrayList;

import java.util.ArrayList;

public class Topic2_AccesElements {

    public static void main(String[] args) {

        ArrayList<String> RandomWords = new ArrayList<>(4);
        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");


        String SecondWord = RandomWords.get(1);
        System.out.println("************************************************************");
        System.out.println(SecondWord);

        //0 1 ....

        for (int i = 0; i <RandomWords.size() ; i++) {
            System.out.println(RandomWords.get(i));

        }
        System.out.println("************************************************************");
        int j=0;
        while (j <RandomWords.size()){
            System.out.println(RandomWords.get(j));
            j++;
        }
        System.out.println("************************************************************");

        int IndexOfElastic = RandomWords.indexOf("elastic");
        System.out.println(IndexOfElastic);
        int IndexOfHayri = RandomWords.indexOf("Hayri");
        if (IndexOfHayri > -1){
            System.out.println("We have Hayri in the ArrayList");
        }else {
            System.out.println("We don't have Hayri in the ArrayList");
        }
        boolean DoweHaveBulgurInArrayList = RandomWords.contains("bulgur");
        System.out.println(DoweHaveBulgurInArrayList);
        System.out.println("************************************************************");
        System.out.println(RandomWords);

        RandomWords.set(RandomWords.indexOf("elastic"),"chocolate");
        System.out.println("Modified array list is: "+RandomWords);

    }
}
