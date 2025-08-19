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
        ListNode cur = head;
        int count = 0;
        Stack<Integer>stack = new Stack();
        while(cur != null){
            stack.push(cur.val);
            cur = cur.next;
        }
        ListNode tra = head;
        while(tra != null){
            tra.val = stack.pop();
            tra = tra.next;
        }
        return head;
    }
    public ListNode removeNodes(ListNode head) {
        Stack<Integer>stack = new Stack();
        ListNode cur = head;
        ListNode dummy = new ListNode();
        ListNode dh = dummy;
        while(cur != null){
            int val = cur.val;
            while(!stack.isEmpty() && stack.peek()<val){
                stack.pop();
            }
            stack.push(val);
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            int val = stack.pop();
            ListNode createNode = new ListNode(val);
            createNode.next = dummy;
            dummy = createNode;
            dh = dummy;
        }
        ListNode tradh = dh;
        ListNode tradhNext = tradh.next;
        while(tradhNext.next != null){
            tradhNext = tradhNext.next;
            tradh = tradh.next;
        }
        tradh.next = null;
        return dh;
        
    }
}