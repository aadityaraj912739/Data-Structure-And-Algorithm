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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1 = list1;
        ListNode cur1 = list1;
        ListNode prev1 = list1;
        int count = 0;
        while(head1 != null){
            if(a-1 == count){
                prev1 = head1;
            }
            if(b == count ){
                cur1 = head1;
            }
            count++;
            head1 = head1.next;
        }
        ListNode tra2 = list2;
        while(tra2.next != null){
            tra2 = tra2.next;
        }
        prev1.next = list2;
        tra2.next = cur1.next;
        return list1;
    }
}