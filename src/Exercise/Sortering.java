package Exercise;

import java.util.Scanner;

public class Sortering{
    private Scanner input;

    public Sortering(){
        input = new Scanner(System.in);

    }

    public void sortWords(){
        String[] words = new String[5];

        for(int i=0;i<5;i++){
        words[i] = input.nextLine();
        }

        boolean sorted = true;
        while(!sorted){
            for(int j=0;j<words.length-1;j++){
                String word = words[j];
                if(word.charAt(0)<words[j+1].charAt(0)){
                    String wordChange = words[j];
                    words[j] = words[j+1];
                    words[j+1] = wordChange;
                    sorted = false;
                }
                else if(word.charAt(j)==words[j+1].charAt(0)){
                    if(word.charAt(j)<words[j+1].charAt(0)){
                        String wordChange = words[j];
                        words[j] = words[j+1];
                        words[j+1] = wordChange;
                        sorted = false;
                    }

                }
            }
        }

        for(int l=0;l< words.length;l++){
            System.out.println(words[l] +"\n");
        }

    }


}
