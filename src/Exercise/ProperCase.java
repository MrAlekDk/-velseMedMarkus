package Exercise;

public class ProperCase {

    public ProperCase(){}


    public void checkProperCase(String sætning){


        String[] ord = sætning.split(" ");
        String[] fixedSentence = new String[ord.length];
        for(int i=0;i<ord.length;i++){
            String wordToCheck = ord[i];

            if(wordToCheck.length()>3){
                wordToCheck.charAt(0)
            }




            for(int j=0;j<wordToCheck.length();j++){
                if(wordToCheck.charAt(j)>=101&&wordToCheck.charAt(j)<=132){

                }
            }
        }


    }


}
