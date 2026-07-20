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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;//curr-->Temp var for traversing-->Initially,it points to the same first node as head
        while(current != null && current.next != null){//Traverse until the curr node or the next node becomes null

            //Handles an empty LL and ensures a next node exists to compare(stops for a single-node list and at the last node)
            if(current.val==current.next.val){//If curr node and the next node have the same value
                current.next=current.next.next;//Skip the duplicate node
            }
            else{
                current=current.next;//Else move the curr to nxt node
            }
        }
      return head;//Gives access to the entire updated LL
    }
}
/* Practical Approach:
    The LL is already sorted,so duplicate nodes are next to each other
    Traverse the linked list one node at a time
    If the current node and the next node have the same value, skip the duplicate node
    Otherwise, move to the next node
    Return the updated linked list */
