package Day21_Ziya_MethodsOverload;

public class Topic1_MethodExample {

    // Write A code where you make Omelette

    // Step-by-step instruction
    // 1) turn on the stove
    // 2)Add butter based in how many people will be eating
    // 3) Wait for 5 mins
    // 4) Get amount of eggs of needed based on how people will eat
    //  5) Scramble your egg and add it to the pan.
    // 6) for medium -- 4 mins for well done  wait 6 mins

    public static void OnOff(String onoff){ //  1) turn on the stove
        if (onoff.equalsIgnoreCase("On")){
            System.out.println("The stove is ON");
        }else {
            System.out.println("The stove is OFF");
        }


    }

    public static void AddButter(int people){ //2)Add butter based in how many people will be eating
        if (people<=2){
            System.out.println("2 mg butter is added to pan");
        } else if (people>2 && people <5) {
            System.out.println("4 mg butter is added to pan");

        }else {
            System.out.println("8 mg butter is added to pan");
        }

    }
    public static void Scrum(){ //  5) Scramble your egg and add it to the pan.
        System.out.println(" The eggs are mixed and added to the  pan");
    }

    public static void Wait(int mins){ //3) Wait for 5 mins -
        // 6) for medium -- 4 mins for well done  wait 6 mins

        for (int i =0; i<mins; i++){
            System.out.println("one minutes passed");
        }
        System.out.println(mins+" Is DONE");
    }

    public static String Eggs(int eggs){ //4) Get amount of eggs of needed based on how people will eat
        return eggs+" of eggs added";
    }


    public static void main(String[] args) {

        int people = 4;
        int ppl = 4;
        String how = "mid"; //"well"

        OnOff("ON");

        AddButter(ppl);
        Wait(4);

        System.out.println(Eggs(5));

        Scrum();

        if (how.equalsIgnoreCase("mid")){
            Wait(4);

        }else {
            Wait(6);
        }
        System.out.println("The Omelette is Done");
    }

}
