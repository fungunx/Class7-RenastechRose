package Day19_MultidimmensionArrays;

public class Topic2_Examples {
    public static void main(String[] args) {

        String [][] names = {  {"Ziya","Seda"},       {"Sena","Anil","Hrakar"},     {"Ferah","Onder","Fahretin","Amer"}};


        // Index                  names [0]              names[1]                [names2]
        // String [] nam = names[0]  == {"Ziya","Seda"}
        // regular [1] == "Seda"  ===. names [0] [1]  ===. "Seda"


        String [] regular = names[0];
        System.out.println("The value in index1 :  "+regular[1]);
        System.out.println("The value in Index1:  "+names[0][1]);

        // Getting the length (size) of multidimensional arrays

        int namesLen= names.length;
        System.out.println("The length of array: " +namesLen);

        //  names[0] in an array, names[1] is an array ====. names[index].length to find inner array

        System.out.println("the length of names[0] array is: " +names[0].length);
        System.out.println("the length of names[1] array is: " +names[1].length);
        System.out.println("the length of names[2] array is: " +names[2].length);

        int [][] nums = {{1,2,3,4,5,6,2,1},{908,3,4,5,2,3,2,1,87,4,5,6,90,7,7}};
        System.out.println("The length nums array: " +nums.length);
        System.out.println("The length of nums 0 array"+nums[0].length);


    }
}
