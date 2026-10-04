import java.util.*;

/**
 * Explore how to identify the longest substring without repeating characters
 * in a given string by applying the sliding window technique. Understand problem
 * constraints and develop an efficient solution to optimize time and space
 * complexity while practicing hands-on implementation.
 * Statement
 * Given a string, str, return the length of the longest substring without repeating characters.
 *
 * Constraints:
 *
 * 1
 * 1
 *
 * ≤
 * ≤
 *  str.length
 * ≤
 * 1
 * 0
 * 5
 * ≤10
 * 5
 *
 * str consists of English letters, digits, and spaces.
 */

public class LongestSubstring {
    public static int findLongestSubstring(String str) {

        // Replace this placeholder return statement with your code

        char[] chars = str.toCharArray();

        Map<Character, Integer> chartoPos = new HashMap<Character, Integer>();
        int start = 0;
        int length = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chartoPos.get(chars[i]) != null && chartoPos.get(chars[i]) != -1) {
                int newStart = chartoPos.get(chars[i]) + 1;
                for(int j=start;j<newStart;j++){
                    chartoPos.put(chars[j],-1);
                }
                start=newStart;
            }

            chartoPos.put(chars[i], i);
            if (i - start + 1 > length) {
                length = i - start + 1;
            }
        }
        return length;
    }

    public static void main (String [] args ){
       System.out.println(findLongestSubstring("abccabcabcc"));
    }

}
