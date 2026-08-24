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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);//Dummy node acts as a fixed starting point-->We never use dummy.val-->we only use dummy.next
        ListNode curr=dummy;//'curr' always points to the last node of the answerLL built so far
        int carry=0;//Initially no addition is performed-->so carry is 0
        while(l1 !=null || l2 !=null || carry !=0){//Continue until both LLs are finished and no carry is left
            int sum=carry;//Start every addition with the carry
            if(l1 !=null){//We again check l1 != null because l1 may become null in a previous iteration while the loop is still running due to l2 or carry
                sum=sum+l1.val;
                l1=l1.next;//Curr node is already processed-->so move l1 to the next node
            }
            if(l2 !=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            carry=sum/10;//Store the carry for the next addition
            curr.next=new ListNode(sum%10);//Create a new node with only the last digit of the sum
            curr=curr.next;//Move curr to the newly created last node
        }
        return dummy.next;//Return the actual head of the answer LL by skipping the dummy node
    }
}
/* Practical Approach:
  Traverse both Linked Lists simultaneously
  Add the corresponding digits along with the carry from the previous addition
  Store the last digit of the sum in a new node and update the carry
  Continue until both Linked Lists and the carry become empty
  Return the merged result using dummy.next */