package Personal_HomeWork;

public class Lop {
    public static void main(String[] args) {
        int weeks = 4;
        int days = 7;
        //outer loop
        for (int i = 1; i <weeks ; i++) {
            System.out.println("weeks"+i);

            //inner loop

            for (int j = 1; j <=days; j++) {
                System.out.println("Days"+j);
                if (j==2){
                    String tue = "Tuesday";
                    System.out.println(tue);

                    if (tue.contains("es")) {
                        System.out.println("Its true, its Tuesday");

                    }else {
                        System.out.println("Not correct day");
                    }
                }

            }

        }
    }
}
