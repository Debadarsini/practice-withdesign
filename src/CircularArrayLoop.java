import java.util.*;

public class CircularArrayLoop {


    public static boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            boolean forward = nums[i] > 0;
            int slow = i, fast = i;

            while (true) {
                slow = advance(nums, slow, forward);
                if (slow == -1) break;
                fast = advance(nums, fast, forward);
                if (fast == -1) break;
                fast = advance(nums, fast, forward);
                if (fast == -1) break;

                if (slow == fast) {
                    return true; // met at a valid (length > 1) cycle
                }
            }

            // mark the path from i as visited (0) so we don't redo work
            int j = i;
            while (nums[j] != 0 && (nums[j] > 0) == forward) {
                int next = advance(nums, j, forward);
                nums[j] = 0;
                j = next == -1 ? j : next;
                if (next == -1) break;
            }
        }
        return false;
    }

    private static int advance(int[] nums, int idx, boolean forward) {
        if (nums[idx] == 0) return -1;
        if ((nums[idx] > 0) != forward) return -1; // direction changed
        int n = nums.length;
        int next = ((idx + nums[idx]) % n + n) % n;
        if (next == idx) return -1; // self-loop, length 1 — not valid
        return next;
    }


    public static void main(String [] args){
        System.out.println(CircularArrayLoop.circularArrayLoop(new int[] {5,4,-2,-1,3}));



    }
}

