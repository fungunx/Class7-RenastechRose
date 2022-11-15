package Day23_MethodsOverloadWrapperRecap;

public class Topic2_CheckPrimrNumbers {
    public static void main(String[] args) {


 int num =13;

boolean IsItPrimeNumber = true;

        for (int i = 2; i < num; i++) {
            if (num % i ==0){
                IsItPrimeNumber=false;
                break;
            }

        }

        if (IsItPrimeNumber == true){
            System.out.println("It is a prime number");

        }
        else {
            System.out.println("It is not a prime number");
        }
/*
    }
    public static boolean CheckPrimeNumbers(int param1){
        boolean IsItPrimeNumber = true;

        for (int i = 2; i <param1 ; i++) {
            if ((param1 % i == 0)){
                IsItPrimeNumber=false;

            }
        }
        return IsItPrimeNumber;

 */
    }
}
