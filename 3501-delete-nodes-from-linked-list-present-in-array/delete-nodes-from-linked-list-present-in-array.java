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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode dh = dummy;
        HashSet<Integer>set = new HashSet<>();
        Stack<Integer>stack = new Stack();
        ListNode cur = head;
        int n = nums.length;
        int i = 0;
        while(i < n){
            int val = nums[i];
            if(!set.contains(val)){
                set.add(val);
            }
            i++;
        }
        while(cur != null){
            int val = cur.val;
            if(!set.contains(val)){
                stack.push(val);
            }
            cur = cur.next;
        }
        while(!stack.isEmpty()){
            int val = stack.pop();
            ListNode createNode = new ListNode(val);
            createNode.next = dummy;
            dummy = createNode;
            dh = dummy;
        }
        ListNode prev = dh;
        ListNode cur1 = prev.next;
        while(cur1.next != null){
            prev = prev.next;
            cur1 = cur1.next;
        }
        prev.next = null;
        return dh;

    }
}