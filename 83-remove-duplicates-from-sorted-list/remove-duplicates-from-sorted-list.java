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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode prev = head;
        HashSet<Integer> set = new HashSet<>();
        while(cur != null){
            
            if(cur != null && !set.contains(cur.val) ){
                set.add(cur.val);
                prev = cur;
                cur = cur.next;
            }else{
                prev.next = cur.next;
                cur = cur.next;
            }
            
        }
        return head;
    }
}