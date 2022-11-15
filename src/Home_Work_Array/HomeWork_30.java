package Home_Work_Array;

public class HomeWork_30 {
    public static void main(String[] args) {

        /*

        Write  a code   string   array    with   the   following   strings:
"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.
int [] numbers ={78,34,12,31,45};
        Arrays.toString(numbers);
        System.out.println("All the elements in Array: "+Arrays.toString(numbers));

         */
        String [] days = {"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday", "Saturday"};
        int j = 0;
        for (int i = 0; i <days.length ; i++) {
            System.out.println(days[i]);

        }


    }
}
