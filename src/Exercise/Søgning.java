package Exercise;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;

public class Søgning {

   // private String [] stringArray;

    public Søgning(){
       // this.stringArray = stringArray;
    }

    public int searchString(String searchString, String [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i].toLowerCase().contains(searchString.toLowerCase())){
                 return i;
            }
        }
        throw new InputMismatchException("No answer found");

    }

}
