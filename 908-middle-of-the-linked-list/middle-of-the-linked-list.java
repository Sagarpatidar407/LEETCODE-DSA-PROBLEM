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
    public ListNode middle(ListNode slow, ListNode fast){
        if(fast == null || fast.next==null){
            return slow;
        }

        return middle(slow.next, fast.next.next);

    }
    public ListNode middleNode(ListNode head) {
        return middle(head, head);
    }
}