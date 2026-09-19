
// Definition for a Linked List node
// class ListNode {
//     int val;
//     ListNode next;

//     // Constructor
//     public ListNode(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }
import java.util.*;
class ListNode{
    ListNode next;
    int data;

    public ListNode(int i) {
        this.data=i;
        this.next=null;
    }
}
class NthNode {
    public static ListNode removeNthLastNode(ListNode head, int n) {
        if(head==null){
            return head;
        }
        // Replace this placeholder return statement with your code
        int count=0;
        ListNode nthNode = head;
        while(nthNode!=null && count<n){
            nthNode = nthNode.next;
            count++;
        }

        ListNode current = head;

        if(nthNode.next == null && count!=n ){
            head = head.next;
            return head;
        }

        while(nthNode.next!=null){
            nthNode=nthNode.next;
            current = current.next;
        }

        if(current.next!=null){
            current.next=current.next.next;
        }

        return head;
    }

    public static void main(String [] args){
        ListNode head = new ListNode(1);

        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
       head.next.next.next = new ListNode(4);
       head.next.next.next.next = new ListNode(5);

        // Function call
        head = removeNthLastNode(head, 2);

        // Print updated linked list
        printList(head);
    }

    static void printList(ListNode head)
    {
        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");

            curr = curr.next;
        }
    }
}