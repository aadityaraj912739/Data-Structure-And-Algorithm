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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode tra = head;
        int count = 0;
        while (tra != null) {
            count++;
            tra = tra.next;
        }
        k = k % count;
        if (k == 0) return head;
        ListNode prev = head;
        int ind = 0;
        while (ind < count - k - 1) {
            prev = prev.next;
            ind++;
        }
        ListNode curHead = prev.next;
        ListNode prevCur = curHead;
        while (prevCur.next != null) {
            prevCur = prevCur.next;
        }
        prevCur.next = head;
        prev.next = null;

        return curHead;
    }
}
