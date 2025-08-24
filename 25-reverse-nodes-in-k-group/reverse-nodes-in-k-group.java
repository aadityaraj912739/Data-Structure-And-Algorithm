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
import java.util.Stack;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> stack = new Stack();
        int count = 0;
        ListNode tra = head;
        ListNode cur = head;
        while (tra != null) {
            stack.push(tra.val);
            count++;
            tra = tra.next;
            if (count == k) {
                while (count > 0 && !stack.isEmpty()) {
                    cur.val = stack.pop();
                    cur = cur.next;
                    count--;
                }
            }
        }
        Stack<Integer> temp = new Stack();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        while (!temp.isEmpty()) {
            cur.val = temp.pop();
            cur = cur.next;
        }

        return head;
    }
}
