package Exercise;

import java.util.Scanner;

public class Sortering implements Comparable{
    private Scanner input;

    public Sortering(){
        input = new Scanner(System.in);

    }

    public void sortWords(){
        String[] words = new String[5];

        for(int i=0;i<5;i++){
        words[i] = input.nextLine();
        }

        boolean sorted = false;
        while(!sorted){
            for(int j=0;j<words.length-1;j++){
                String word = words[j];
                if(word.charAt(j)>words[j+1].charAt(0)){

                }
            }
        }

    }

    @Override
    public int compareTo(Object o) {

    }
}
