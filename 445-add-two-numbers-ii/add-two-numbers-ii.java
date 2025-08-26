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
    public ListNode addTwoNum(ListNode l1, ListNode l2){
        int carry = 0;
        ListNode dmy = new ListNode(0);
        ListNode crn = dmy;

        while(l1 != null || l2 != null || carry > 0){
            int sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            ListNode createNode = new ListNode(sum % 10);
            crn.next = createNode;
            crn = createNode;
        }
        return dmy.next;
    }
    public ListNode reverse(ListNode head){
        Stack<Integer> stack = new Stack();
        ListNode cur = head;
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);
        ListNode add = addTwoNum(l1, l2);
        ListNode reverse = reverse(add);
        return reverse;


        
    }
}