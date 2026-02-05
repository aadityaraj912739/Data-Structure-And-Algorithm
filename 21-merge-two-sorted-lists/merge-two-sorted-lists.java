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
        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(h1 != null && h2 != null){
            if(list1.val < list2.val){
                dummy.next = list1;
                h1 = h1.next;
                dummy = list1;
                list1 = h1;
            }else{
                dummy.next = list2;
                h2 = h2.next;
                dummy = list2;
                list2 = h2;
            }
        }

        while(h1 != null){
            dummy.next = h1;
            dummy = h1;
            h1 = h1.next;
        }

        while(h2 != null){
            dummy.next = h2;
            dummy = h2;
            h2 = h2.next;
        }

        return head.next;
    }
}