package Exercise;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Græs test = new Græs();

        System.out.println(test.antaldage(0.2, 5.0));

        ArrayListClass test2 = new ArrayListClass();
        ArrayList<String> list = new ArrayList();
        list.add("Alek");
        list.add("Markus");
        list.add("Simon");

        System.out.println(test2.doesArrayListContainString(list, "Hej"));
        System.out.println(test2.doesArrayListContainString(list, "Alek"));
    }
}
