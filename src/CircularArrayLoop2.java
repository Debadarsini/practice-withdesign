public class CircularArrayLoop2 {


    public static boolean isLoop(int [] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int fast = i;
            int slow = i;
            boolean forward = nums[i] > 0;
            while (true) {
                slow = advance(slow, nums, forward);
                if (slow == -1) break;
                fast = advance(fast, nums, forward);
                if (fast == -1) break;
                fast = advance(fast, nums, forward);
                if (fast == -1) break;
                if (slow == fast) {
                    return true;
                }
                int j = i;
                while (nums[j] != 0 && (nums[j] > 0) == forward) {
                    int next = advance(j, nums, forward);
                    nums[j] = 0;
                    j = next == -1 ? j : next;
                    if (next == -1) break;
                }
            }
            return false;
        }
        return false;
    }

    private static int advance(int ptr, int[] nums, boolean forward){
        if(nums[ptr]==0)
            return -1;
        int n = nums.length;
        if(nums[ptr]>0!=forward)
            return -1;
        int nextptr =  ((ptr+nums[ptr])%n +n)%n;
        if(nextptr==ptr) return -1;
        return nextptr;
    }
}
