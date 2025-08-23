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
    public void reorderList(ListNode head) {
        Stack<Integer>stack = new Stack();
        ListNode slow = head;
        ListNode fast = head;
        Queue<Integer> list = new LinkedList();
        if(head == null || head.next == null){
            return;
        }
        while(fast != null && fast.next != null){
            list.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        while(slow != null){
            stack.push(slow.val);
            slow = slow.next;
        }
        int count = 1;
        ListNode tra = head;
        while(tra != null){
            if(count % 2 != 0 && !list.isEmpty()){
                tra.val = list.poll();
            }else{
                tra.val = stack.pop();
            }
            count++;
            tra = tra.next;
        }

    }
}