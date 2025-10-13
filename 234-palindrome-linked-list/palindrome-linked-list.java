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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode tra = head;
        while(tra != null){
            stack.push(tra.val);
            tra = tra.next;
        }


        ListNode agn = head;
        while(agn != null){
            int pop = stack.pop();
            if(pop != agn.val){
                return false;
            }
            agn = agn.next;
        }

        return true;
    }
}