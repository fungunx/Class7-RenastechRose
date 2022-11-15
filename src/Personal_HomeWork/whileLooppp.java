package Personal_HomeWork;

public class whileLooppp {
    public static void main(String[] args) {
        int weeks = 4;
        int days = 7;
        int i = 1;
        //outer
        while (i<=weeks){
            System.out.println("weeks"+i);


            //inner
            for (int j = 1; j <=days; j++) {
                System.out.println("Days"+j);

            }
            i++;
        }


    }
}
