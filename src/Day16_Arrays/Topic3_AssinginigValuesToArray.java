package Day16_Arrays;

public class Topic3_AssinginigValuesToArray {
    public static void main(String[] args) {
        //

        int [] intArray = {98,23,4,5,1,23}; // duplicate values ara allowed in Arrays
        // getting the valur in index 4
        int val = intArray[4];
        System.out.println("the value in index 4 or in var variable:  "+val);

        System.out.println("*****************************************************");

        int[] array1 = new int[4]; // {0, 0, 0, 0}
        array1[0] = 78;
        System.out.println("the index 0 value is:   "+array1[0]);
        System.out.println("the index 1 value is:   "+array1[1]);
        array1[1] = 90;
        System.out.println("the index 1 value is:   "+array1[1]);
        array1[2] = 76;
        array1[3]=12;
        // array1[4] = 13; this will give error because we already assing 4

        System.out.println("***********************************");
        char [] charArray = new char[5];
        charArray[0] = 'd';
        charArray[1] = 'c';
        charArray[2] = ' ';
        charArray[3] = 'o';
        charArray[4] = '2'; //{'d', 'd', ' ', 'o', '2' }

        System.out.println("te char at index 0 is:  "+charArray[0] );
        System.out.println("te char at index 1 is:  "+charArray[1] );
        System.out.println("te char at index 2 is:  "+charArray[2] );
        System.out.println("te char at index 3 is:  "+charArray[3] );
        System.out.println("te char at index 4 is:  "+charArray[4] );


    }
}
