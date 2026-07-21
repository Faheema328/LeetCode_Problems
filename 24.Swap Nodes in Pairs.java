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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){//If the list is empty or has only one node-->no swap is needed
            return head;//Return type is ListNode-->So,we must return a node 
        }
        ListNode dummy=new ListNode(0);//Create a dummy node-->Makes swapping easy
        dummy.next=head;//Connect the newNode(dummy node)to the LL
        ListNode prev=dummy;//prev-->points to the node before the current pair
        while(prev.next != null && prev.next.next != null){//Continue only until there are at least two nodes available to swap
            ListNode first=prev.next;
            ListNode second=first.next;

            first.next=second.next;//1->3
            second.next=first;//2->1

            prev.next=second;//prev connects to swapped pair
            prev=first;//Move prev to the end of the swapped pair
        }
        return dummy.next;//Newhead of the updated LL
    }
}
/* Practical Approach:
    Traverse the linked list two nodes at a time
    Swap every pair of adjacent nodes
    Move to the next pair and repeat the process
    If only one node is left, leave it unchanged
    Return the updated linked list */
