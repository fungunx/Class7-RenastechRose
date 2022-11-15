package Day20_Methods;

public class Topic8_MethodsParamExam {

    // Write a method where it takes array of integers and print sum of all the elements in the array
    public static void main(String[] args) {

        int [] ArrayInt = {56,7,8,23,4,5,6,3,2,5,6,8,};

        SumArray(ArrayInt);
        System.out.println("***********************************");
        int [] Nums = {78,-98};

        SumArray(Nums);


    }
    public static void SumArray (int [] numbers){

        int sum = 0;
        for (int num:numbers){
            sum=sum+num;
        }
        System.out.println(" The sum of the all the numbers in array is:  " +sum);


    }
}
