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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tra = dummy;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while( l1 != null && l2 != null){
            if(l1.val < l2.val){
                tra.next = l1;
                tra = l1;
                l1 = l1.next;
            }else{
                tra.next = l2;
                tra = l2;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            tra.next = l2;
        }
        if(l2 == null){
            tra.next = l1;
        }
        return dummy.next;
    }
}