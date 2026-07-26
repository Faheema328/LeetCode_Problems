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
    public ListNode reverse(ListNode head){//Reverse the given LL(second half)and return its new head
            ListNode prevNode=null;//'prevNode' keeps track of the prev node -->Initially it is null because after reversal-->the original first node becomes the last node and its next should point to null
            ListNode currNode=head;//At first-->head=middle.next
            while(currNode != null){//Traverse until all the nodes are reversed
                ListNode nextNode=currNode.next;//Save the next node before changing the link-->otherwise the remaining LL will be lost
                currNode.next=prevNode;//Reverse the current node's link
                prevNode=currNode;//Move 'prevNode' and 'currNode' one step forward
                currNode=nextNode;
            }
            return prevNode;//'prevNode' now points to the new head of the reversed LL(second half)
        }

        public ListNode findMiddle(ListNode head){
            ListNode hare=head;//Fast pointer
            ListNode turtle=head;//Slow Pointer
            while(hare.next !=null && hare.next.next !=null){
                hare=hare.next.next;//Move hare two steps forward
                turtle=turtle.next;//Move turtle one step forward
            }
            return turtle;//When the hare reaches the end,the turtle will be at the middle
            //For even-sized LLs-->this implementation returns the first(left)middle
        }

    public boolean isPalindrome(ListNode head) {//A LL with 0 or 1 node is always a palindrome
        if(head==null || head.next==null){
            return true;
        }
        ListNode middle=findMiddle(head);//Find the middle of the entire LL to identify where the second half starts
        ListNode secondHalfStart=reverse(middle.next);//Reverse the second half so we can compare corresponding nodes while moving only forward

        ListNode firstHalfStart=head;//Start comparing from the first node of the LL
        while(secondHalfStart != null){//Compare until the end of the reversed second half-->We stop here because the second half is always shorter(or equal)than the first half
            if(firstHalfStart.val != secondHalfStart.val){////If any pair of corresponding nodes is different
                return false;
            }
            firstHalfStart=firstHalfStart.next;//Moves to the next node of both the first and second halves
            secondHalfStart=secondHalfStart.next;
        }
        return true;//All corresponding nodes matched
    }
}
/* Practical Approach:
  Block 1:
  Find the middle to identify where the second half of the Linked List starts(middle.next=Second half start)
  Block 2:
  Reverse the second half so we can compare corresponding nodes
  from both halves while moving only forward
  Block 3:
  Compare the first half and the reversed second half
  to check whether the Linked List is a palindrome
  If any pair of corresponding nodes is different, return false
  Otherwise, return true */

/* Golden Notes:
  >A singly Linked List has only forward(next) pointers
  >LLs do not support direct index access like arrays
  >Both approaches(Two-pass traversal approach→Find size first,then find the middle)have O(n) time complexity but the slow and fast pointer technique is preferred because it finds the middle
  in a single traversal instead of two */

/* Final LL:
   head
   ↓
   1 → 2 → NULL

  secondHalfStart
      ↓
  1 → 2 → NULL */
