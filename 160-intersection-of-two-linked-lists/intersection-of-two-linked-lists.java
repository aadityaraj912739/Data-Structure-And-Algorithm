/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tra1 = headA;
        ListNode tra2 = headB;
        HashSet<ListNode> set = new HashSet<>();
        while(tra1 != null){
            if(!set.contains(tra1)){
                set.add(tra1);
            }
            tra1 = tra1.next;
        }

        while(tra2 != null){
            if(!set.contains(tra2)){
                set.add(tra2);
            }else{
                return tra2;
            }
            tra2 = tra2.next;
        }
        return null;
    }
}