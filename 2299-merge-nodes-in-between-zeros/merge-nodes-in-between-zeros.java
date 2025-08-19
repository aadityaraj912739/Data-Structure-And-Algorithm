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
    public static ListNode reverse(ListNode head){
        Stack<Integer>stack = new Stack();
        int count = 0;
        ListNode cur = head;
        while(cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        ListNode tra = head;
        while(tra != null){
            int val = stack.pop();
            tra.val = val;
            tra = tra.next;
        }
        return head;
    }
    public ListNode mergeNodes(ListNode head) {
        Stack<Integer>stack = new Stack();
        ListNode cur = head;
        int sum = 0;
        ListNode dummy = new ListNode(0);
        ListNode dh = dummy;
        while(cur != null){
            int val = cur.val;
            sum = 0;
            while(!stack.isEmpty() && val == 0){
                sum +=stack.pop();
            }
            if(sum != 0){
                ListNode createNode = new ListNode(sum);
                createNode.next = dummy;
                dh = createNode;
                dummy = createNode;
            }
            if(val != 0){
                stack.push(val);
            }
            cur = cur.next;
        }
        ListNode reverse = reverse(dh);
        ListNode h1 = reverse;
        return h1.next;
    }
}