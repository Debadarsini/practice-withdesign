public class ValidWordAbrr {
    //public class Solution{
    public static boolean validWordAbbreviation(String word, String abbr) {

        int i=0;
    int j =0;
    char [] wordArray = word.toCharArray();
    char [] abbrArray = abbr.toCharArray();
    int wordLen = wordArray.length;
    int abbrLen = abbrArray.length;
        while(i<wordLen && j<abbrLen){
        if(wordArray[i]!=abbrArray[j] && ! Character.isDigit(abbrArray[j]) ){
            return false;
        }
        else if(wordArray[i]==abbrArray[j]){
            i++;
            j++;
        }else if(Character.isDigit(abbrArray[j])
                && Integer.parseInt(String.valueOf(abbrArray[j]))==0){
            return false;
        }else if(Character.isDigit(abbrArray[j])){
            int numToSkip=-1;
            if(j+1<abbrLen && Character.isDigit(abbrArray[j+1])){
                if(j+2<abbrLen &&Character.isDigit(abbrArray[j+2]) ){
                    return false;
                }
                numToSkip=Integer.parseInt(String.valueOf(abbrArray[j]) + abbrArray[j+1]);
                j+=2;
            }else{
                numToSkip=Integer.parseInt(String.valueOf(abbrArray[j]));
                j++;
            }
            i=i+numToSkip;
            if(i>wordLen)
                return false;
        }
    }
        return true;
}
   // }

    public static void main(String [] args ){

        System.out.println(validWordAbbreviation("tnginixqipjkhn","t10khn18"));
    }
}
