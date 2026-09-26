import java.util.*;

// Definition for a Linked List node
public class MiddleOfLinkedList {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode middleNode(ListNode head) {

        // Replace this placeholder return statement with your code
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        if (fast.next == null) {
            return fast;
        }
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        if ((count + 1) / 2 == 0)
            return slow.next;
        return slow;
    }
}