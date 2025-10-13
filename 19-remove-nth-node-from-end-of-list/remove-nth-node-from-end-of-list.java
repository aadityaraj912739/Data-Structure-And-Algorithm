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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode tra = head;
        ListNode prev = head;
        int count = 0;
        
        while(tra != null){
            count++;
            tra = tra.next;
        }

        int target = count-n;
        int cnt = 0;

         if (target == 0) {
            return head.next;
        }
        while(target != cnt && cur.next != null){
            
            prev = cur;
            cur = cur.next;
            cnt++;
            
        }
        

        prev.next = cur.next;
        return head;
    }
}