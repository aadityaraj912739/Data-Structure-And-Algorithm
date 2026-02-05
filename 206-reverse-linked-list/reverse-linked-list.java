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
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = cur;
        ListNode last = null;
        
        while(cur != null && prev != null){
            cur = prev;
            prev = prev.next;
            cur.next = last;
            last = cur;
        }
        return cur;
    }
}