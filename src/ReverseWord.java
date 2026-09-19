public class ReverseWord {
    public static String reverseWords(String sentence) {

        // Replace this placeholder return statement with your code
        String[] words = sentence.split(" ");
        int left=0;
        int right=words.length-1;
        while(left<right){
            String rightW = words[right].strip();
            String leftW = words[left].strip();
            words[right]=leftW;
            words[left]=rightW;
            left++;
            right--;
        }
        String rretsentence = String.join(" ",words).replaceAll("\\s+", " ");;
        return rretsentence;
    }

    public static void main(String [] args){
       System.out.println(reverseWords("Hello    World"
        ));
    }

}

