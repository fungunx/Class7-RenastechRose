package Day24_ArrayList;

import java.util.ArrayList;

public class Topic5_StandartDeviation {
    public static void main(String[] args) {

        ArrayList<Integer> MyDataSet = new ArrayList<>();

        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(8);
        MyDataSet.add(4);

        int n = MyDataSet.size();
        int sum =0;

        for (int i = 0; i < n; i++) {
            sum = sum+MyDataSet.get(i);

        }
        System.out.println("Sum is equal: "+sum);

        int mean = sum/n;
        System.out.println("Mean is equal: "+ mean);

       ArrayList <Integer> MyCalculatedVariance = CalculateVarianceArrayList(MyDataSet, mean);

       double SumOfVariance = 0;
        for (int i = 0; i < MyCalculatedVariance.size(); i++) {
            SumOfVariance= SumOfVariance+MyCalculatedVariance.get(i);
//            Below code same as above

        }

        System.out.println("Sum of the Variance Array list is:  "+SumOfVariance);

        double Variance = SumOfVariance / (n-1);

        System.out.println("Variance : "+Variance);

        double StandartDeviation = Math.sqrt(Variance);

        System.out.println("Stndart Deviation : "+StandartDeviation);
    }
    /// This method will calculate Variance of given array list
    ///@param1 = this is an Arraylist that you will pass your Data Set
    ///@param2 = this is an int that you will pass your calculated mean value
    public static ArrayList <Integer> CalculateVarianceArrayList (ArrayList<Integer> MyDateSet, int mean){
        ArrayList<Integer>  Variance = new ArrayList<>();

        for (int i = 0; i < MyDateSet.size(); i++) {
           // Variance.set(i,MyDateSet.get(i)-mean);
            Variance.add(MyDateSet.get(i)- mean);

        }
        for (int i = 0; i < Variance.size(); i++) {
            int SquareOfElement = Variance.get(i)*Variance.get(i);
            //Below code will calculate the power of given value, Same as we are sending 2
            //   double  SquareOfElementUsingPow = Math.pow(Variance.get(i),2);
            Variance.set(i,SquareOfElement);

        }

return Variance;
    }

}
