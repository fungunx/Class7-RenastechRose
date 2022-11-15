package Day21_Methods_Con;

public class MEthodExamples {

    public static void main(String[] args) {

        double avarage = calculateAverage(13,14);

        System.out.println(analyseAverage(avarage));
        if (analyseAverage(avarage)== "Your grade is low, you need to study harder" ){
            System.out.println("SUCCESS");
        }

        //Assertion = Your grade is low, you need to study harder
    }

    //calculateAverage
    // 2 input
    // mid-term,final


    private static double calculateAverage (double midTerm, double finalExam) {

        double avarage = (midTerm+finalExam)/2;

        return avarage;
    }

    //analyseAverage
    // 50 Your grade is loq, you need to study hard
    // 50-75
    //75-100

    private static String analyseAverage (double avarage){

        String category = "";

        if (avarage<50 && avarage>=0){
            category ="Your grade is low, you need to study harder";

        } else if (avarage<=74.99 && avarage>=50) {
            category = " Your grade is not bad, but you need to study more";

        }else if (avarage<=100 && avarage>=75)
            category = " Your grade is perfect, and keep studying";


        return category;
    }
    }

