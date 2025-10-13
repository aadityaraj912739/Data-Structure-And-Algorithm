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
        Stack<Integer> stack = new Stack();
        int i = 0;
        ListNode tra = head;
        while(tra != null){
            stack.push(tra.val);
            tra = tra.next;
        }

        ListNode t = head;
        while(!stack.isEmpty()){
            t.val = stack.pop();
            t = t.next;
        }
        return head;
        
    }
}