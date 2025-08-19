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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode tra = head;
        Stack<Integer>stack = new Stack();
        while(tra != null){
            count++;
            tra = tra.next;
        }
        
        if(count == 0 || count == 1){
            return head;
        }
        ListNode cur = head;
        int again = 1;
        while(cur != null){
            if(again == k || again == count-k+1){
                stack.push(cur.val);
            }
            again++;
            cur = cur.next;
        }
        ListNode traCur = head;
        int ind = 1;
        while(traCur != null){
            if((ind == k || ind == count-k+1) && !stack.isEmpty()){
                int val = stack.pop();
                traCur.val = val;
            }
            ind++;
            traCur = traCur.next;
        }
        return head;
    }
}