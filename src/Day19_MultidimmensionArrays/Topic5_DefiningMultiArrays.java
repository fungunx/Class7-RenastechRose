package Day19_MultidimmensionArrays;

public class Topic5_DefiningMultiArrays {
    public static void main(String[] args) {
        int [][][] nums = {{  {34,5,6,4,2,3},{564,3213,677},{345,678,12}}  ,  {{45,45,333,666,77},{432,456,890}}};
        System.out.println(nums[0][2][1]);

        int [][][] numbers= {{{2312},{78,54,542}},     {{566,343},{333,3333,33333}}} ;
        int num =numbers[1][1][2];

        System.out.println("The number is: "+num);
    }





}
