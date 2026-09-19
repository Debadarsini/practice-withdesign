import java.util.*;
public class SortColors {



    public static int[] sortColors (int[] colors) {

        // Write your code here
        int left = 0;
        int right = colors.length-1;
        int i =0;
        // while(left<right){
        //  int i =0;
        while(i<=right){
            if(colors[i]==0) {
                int temp = colors[left];
                colors[left]=0;
                colors[i]=temp;
                left++;
                i++;
            }else if (colors[i]==1){
                i++;
            }else if(colors[i]==2){
                int temp = colors[right];
                colors[right]=2;
                colors[i]=temp;
                right--;
            }
        }

        return colors;
    }
    public static void main(String [] args){
       System.out.println( Arrays.toString(sortColors(new int[]{2,0,1,2,1,0,2,1,0,1})));
    }


}
