import java.util.*;

/**
 * Explore how to apply the sliding window technique to solve the longest repeating
 * character replacement problem. Understand how to identify the length of the
 * longest substring where characters can be replaced up to k times to achieve uniformity.
 * This lesson helps you develop an efficient approach to this common coding interview
 * challenge, improving your problem-solving skills in string manipulation and optimization.
 */
public class LongestRepeatingCharacterReplacement {

    public static int longestRepeatingCharacterReplacement(String s, int k) {

        // Replace this placeholder return statement with your code

        char [] chars = s.toCharArray();
        int start=0;
        int count=0;
        int largestLength=0;
        int[] countofOccurence = new int[26];
        int freqMax=0;
        for(int i=0; i<chars.length;i++){
            int idx = chars[i]-'A';
            countofOccurence[idx]++;
            freqMax=Math.max(  countofOccurence[idx],freqMax);

            while((i-start+1)-freqMax>k){
                countofOccurence[s.charAt(start) - 'A']--;
                start++;

            }

            if(i-start+1>largestLength)
                largestLength = i-start+1;

        }

        return largestLength;
    }

    public static void main(String [] args){
        System.out.println(longestRepeatingCharacterReplacement("AAACBBBAABAB",2));
    }
}
