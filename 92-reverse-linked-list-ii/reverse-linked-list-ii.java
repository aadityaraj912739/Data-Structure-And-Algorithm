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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 1;
        Stack<Integer>stack = new Stack();
        ListNode cur = head;
        while(cur != null){
            if(count >= left && count <= right){
                stack.push(cur.val);
            }
            count++;
            cur = cur.next;
        }
        ListNode tra = head;
        int count1 = 1;
        while(tra != null){
            if(count1 >= left && count1 <= right){
                tra.val = stack.pop();
            }
            count1++;
            tra = tra.next;
        }
        return head;
    }
} 