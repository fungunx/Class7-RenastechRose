package Day20_Methods;

public class Topic2_ForEachLoopCont {
    public static void main(String[] args) {

        // Write a code you are given an array of String as shown below to check how many character 'c'
        // is in the each value;



        String [] Animals = {"Cow","Fish","Horse","Lion","Crocodile","Eagle"};

        for (String var:Animals){
            System.out.println("The value of var variable:  "+var);

            char [] letters = var.toCharArray(); //{'C','o','w'}
                                                //{'F','i','s','h'}
            int count=0;

            for (char letter:letters){ //letter = 'C', = 'o', = ,'w'
                if (letter=='c' || letter == 'C'){
                    count++;

                }

            }System.out.println("The animal   "+var+" has :"+ +count+"  char o in the name");
            System.out.println("**********************************************************");


            }
        }


    }
