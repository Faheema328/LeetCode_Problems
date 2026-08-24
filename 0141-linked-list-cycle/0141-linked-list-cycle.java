/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){//An empty LL can not have a cycle
            return false;
        }
        ListNode hare=head;//Fast pointer which moves 2 steps at a time
        ListNode turtle=head;//Slow pointer which moves 2 steps at a time
        while(hare !=null && hare.next !=null){//Continue while hare can safely move 2 steps-->otherwise it means the LL has no cycle
            hare=hare.next.next;//Move hare by 2 steps
            turtle=turtle.next;//Move turtle by 2 steps

            if(hare==turtle){//If both pointers point to the same node(same memory address)-->a cycle exists
                return true;
            }
        }
        return false;//hare reached null or cannot move further-->which means the LL does not contain a cycle
    }
}
/* Practical Approach:
  Use two pointers hare and turtle starting from the head
  Move hare by 2 steps and turtle by 1 step
  If there is a cycle both pointers will eventually meet
  If hare reaches null or hare.next becomes null there is no cycle
  Return true if both pointers meet otherwise return false */