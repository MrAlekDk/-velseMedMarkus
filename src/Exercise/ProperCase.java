package Exercise;

public class ProperCase {

    public ProperCase(){}


    public String checkProperCase(String sætning){


        String[] ord = sætning.split(" ");
        for(int i=0;i<ord.length;i++){
            String wordToCheck = ord[i];

            if(isUpperCase(wordToCheck)==true){
                ord[i] = wordToCheck;
                break;
            }

            if(wordToCheck.length()>3){
                wordToCheck = wordToCheck.toLowerCase();
                String firstLetter = wordToCheck.substring(0,1).toUpperCase();
                ord[i] = firstLetter+wordToCheck.substring(1,wordToCheck.length());
                break;
            }

            if(wordToCheck.length()<=3){
                wordToCheck = wordToCheck.toLowerCase();
                ord[i] = wordToCheck;
                break;
            }

        }

        String fixed ="";
        for(int k=0;k< ord.length;k++){
            fixed += ord[k] + " ";
        }
        return fixed;


    }

    public static boolean isUpperCase(String s)
    {
        for (int i=0; i<s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }


}
