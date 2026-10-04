public class CountSubArray {

    public long countSubarrays(int[] nums, long k) {

        // Replace this placeholder return statement with your code
        long count = 0;
        int n = nums.length;
        int start = 0;
        int sumSoFar = 0;
        for (int i = 0; i < n; i++) {
                sumSoFar += nums[i];
            //if ((sumSoFar * (i + 1)) < k)
              //  count++;
            while(start <=i && sumSoFar*(i-start+1)>=k) {
                sumSoFar -= nums[start];
                start++;
            }
            count += i-start+1;
        }
        return count;
    }

    public static void main(String [] args){

    }

}
