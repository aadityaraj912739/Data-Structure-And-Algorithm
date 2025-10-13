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
        HashSet<ListNode> set = new HashSet<>();
        ListNode traA = headA;
        while(traA != null){
            if(!set.contains(traA)){
                set.add(traA);
            }
            traA = traA.next;
        }
        ListNode traB = headB;
        while(traB != null){
            if(set.contains(traB)){
                ListNode ans = traB;
                return ans;
            }
            traB = traB.next;
        }

        return null;
    }
}