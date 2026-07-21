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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){//left==right-->1 node or both the values at positions left and right are equal
            return head;
        }
        ListNode dummy=new ListNode(0);//Create a dummy node so we don't lose access to the new head when the first node is part of the reversal
        dummy.next=head;

        ListNode prev=dummy;//'prev' should always point to the node just before the reversal starts
        for(int i=1;i<left;i++){
            //Start from 1 because prev is already at the dummy node(position 0)-->move prev to the node just before the left position
            prev=prev.next;
        }
        ListNode curr=prev.next;//'current' points to the first node to be reversed
        for(int i=0;i<(right-left);i++){//Repeat(right - left) times since each iteration moves one node to the front of the reversing part

        /* i=0-->Move 3
        i=1-->Move 4 */
            ListNode next=curr.next;//Store the node just after 'current'
            curr.next=next.next;//Remove 'next' from its current position
            next.next=prev.next;//Place next immediately after 'prev'
            prev.next=next;//Connect prev to the moved node
        }
        return dummy.next;//Dummy node is only a helper and is discarded at last
    }
}
/* Practical Approach:
   1. If left == right, return the original list
   2. Create a dummy node to handle the case when left == 1
   3. Move 'prev' to the node just before the left position
   4. Let 'current' point to the first node to be reversed
   5. Keep 'prev' and 'current' fixed
   6. Repeat (right - left) times:
      • Take the node after current
      • Remove it
      • Insert it immediately after prev
7. Return dummy.next */
