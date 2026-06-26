/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode prev, ListNode curr){

        if(curr == null) return prev;

        ListNode nextnode = curr.next;

        curr.next = prev;

        return reverse(curr, nextnode);

    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        return reverse(prev, curr);
      

    }
}