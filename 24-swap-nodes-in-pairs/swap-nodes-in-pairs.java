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
    public ListNode swapPairs(ListNode head) {
        ListNode tra = head;
        ListNode cur = head;
        ListNode prev = head;
        Stack<Integer> stack = new Stack();
        int count = 0;
        while(tra != null){
            stack.push(tra.val);
            count++;
            tra = tra.next;
            if(count == 2){
                while(count > 0 && !stack.isEmpty()){
                    cur.val = stack.pop();
                    count--;
                    cur = cur.next;
                }
            }
        }
        return head;
    }
}