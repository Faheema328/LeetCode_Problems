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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;//Gives the count of total number of nodes in the LL
        ListNode curr=head;//Temp pointer for traversing

        while(curr != null){//Loop to count the total number of nodes
            count++;
            curr=curr.next;
        }
        if(count==n){//The nth node from the end is the 1st node from the beginning-->so return the 2nd node as the new head then the first node automatically loses access(Removed from the LL)
            return head.next;
        }
        int pos=count-n;//Position of the node just before the one to be deleted
        curr=head;
        for(int i=1;i<pos;i++){//Move to the node before the node to be deleted(start from 1 since current is already at the first node)
            curr=curr.next;//Keep moving current until it reaches the node before the one to be deleted
        }
        curr.next=curr.next.next;//From 3->4->5 to 3->5(Skipping the nth node from n)
        return head;//Stores the reference to the entire LL
    }
}
/* Practical Approach:
    Pass 1:
    Traverse the LL and count the total number of nodes

    Pass 2:
    Find the position of the node just before the one to be deleted (Length - n)
    Traverse to that position
    Skip the required node
    Return the updated LL */
