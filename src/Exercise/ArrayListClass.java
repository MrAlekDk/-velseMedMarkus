package Exercise;

import java.util.ArrayList;

public class ArrayListClass {



    public boolean doesArrayListContainString(ArrayList list, String text){

        if(list.contains(text)){
            System.out.println("The String has been found");
            return true;
        }
        else{
            return false;
        }

    }

}
