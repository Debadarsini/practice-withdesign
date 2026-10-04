/**
 * Explore how to apply the sliding window technique to efficiently find maximum values within a moving window across an integer array. This lesson guides you through understanding the problem constraints and implementing a solution that optimizes both time and space complexity, helping you solve this common coding interview pattern with confidence.
 * Statement
 * You are given an array of integers nums and a sliding window of size w that moves from left to right across the array, shifting one position at a time.
 * <p>
 * Your task is to find the maximum value within the current window at each step and return it.
 */

import java.util.*;

public class SlidingWindowMaximum {


    public static int[] findMaxSlidingWindow(int[] nums, int w) {

        // Replace this placeholder return statement with your code
        int first = 0;
        int n = nums.length;
        Deque<Integer> q = new ArrayDeque<Integer>();
        int noofSliding = n - w + 1;
        int maxNums[] = new int[noofSliding];
        for (int i = 0; i < n; i++) {
            if (!q.isEmpty() && q.peekFirst() < i - w + 1) {
                q.pollFirst();
            }

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offerLast(i);

            if (i >= w - 1) {
                maxNums[first++] = nums[q.peekFirst()];
            }

        }


        return maxNums;
    }


public static void main(String[] args) {
    System.out.println(Arrays.toString(findMaxSlidingWindow(new int[]{4, 5, 6, 1, 2, 3}, 1)));
}

}
