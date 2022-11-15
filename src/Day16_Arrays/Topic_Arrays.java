package Day16_Arrays;

public class Topic_Arrays {
    public static void main(String[] args) {
        // Variable:
        //DataType name = value;

        //Arrays: Are the containers where they hold multiples in the same data types
        //DataType [] name {value, value1, value2, value3}
        int num1 = 78;
        int num2 = 23;
        int [] array1 = {78,23,91,34};

        // In arrays index starts from 0 the
        int [] array2 = {67,    90,    28,      10};
        //the   index index0  index1  index2   index3

        // If i want to get the number in 0, ==> array2 [0]
        System.out.println("The first number in  " +array2[0]);
        System.out.println("The second number in " +array2[1]);
        System.out.println("The third number in  " +array2[2]);
        System.out.println("The fourth number in " +array2[3]);

        int var3 = array2[2];
        System.out.println("The var3 value is:  "+var3);

        System.out.println("**************");
        // Boolean data type arrays
        boolean [] BoolArray = {true,false,true,true};
        System.out.println("The value in index3 in BoolArray is:  "+BoolArray[3]);
        boolean var = BoolArray[1];
        System.out.println("The var value is :  "+var);

        System.out.println("*************************************");
        // double data type arrays

        double [] DobArray = {90,65,23};
        System.out.println("The value is intex 0:  "+DobArray[0]);


        System.out.println("*******************************************");
        //String arrays
        String [] stringArray= {"Cheesus", "Harakar", "Ziya","Nelly",null};
        System.out.println("The name is:  "+stringArray[3]);
        System.out.println("The null is:  "+stringArray[4]);






    }
}
