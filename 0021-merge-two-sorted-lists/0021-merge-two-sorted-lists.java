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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);//Dummy node acts as a fixed starting point--> -1 is just a helper value(not an index)-->we only use dummy.next
        ListNode curr=dummy;//'curr' always points to the last node of the merged Linked List-->so the next selected node is always attached using current.next

        while(list1 !=null && list2 !=null){//Continue until one of the LLs' becomes null
            if(list1.val<=list2.val){//Compare the curr nodes of both LLs'(LL1 & LL2)
                curr.next=list1;//Attach the smaller node to the merged LL
                list1=list1.next;//Move list1 to its next node
            }
            else{
                curr.next=list2;//Although curr.next = list1/list2 temporarily connects the remaining LL-->we continue comparing in the next iterations and keep updating the links
                list2=list2.next;
            }
            curr=curr.next;//Move curr to the newly attached node
        }
        if(list1==null){//One LL has become null-->so attach the remaining sorted LL at once
            curr.next=list2;
        }
        else{
            curr.next=list1;
        }
        return dummy.next;//Return the head of the merged LL
    }
}
/* Practical Approach:

  Create a dummy node and a current pointer to build the merged Linked List
  Compare the current nodes of both Linked Lists
  Attach the smaller node to the merged Linked List
  Move the pointer of the Linked List(LL1/LL2)from which the node was taken
  Move current to the newly attached node
  Repeat until one Linked List becomes null
  Attach the remaining nodes of the other Linked List because they are already sorted
  Return dummy.next because it points to the head of the merged Linked List*/