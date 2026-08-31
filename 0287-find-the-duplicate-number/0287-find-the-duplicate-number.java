class Solution {
    public int findDuplicate(int[] nums) {
        /* We do NOT actually convert the array into a LL-->We only Imagine it as a LL by treating:
        index → nums[index]
        Example:
        nums = [1, 3, 4, 2, 2]
        0 → nums[0] → 1
        1 → nums[1] → 3
        3 → nums[3] → 2
        2 → nums[2] → 4
        4 → nums[4] → 2
        So the path becomes:
        0 → 1 → 3 → 2 → 4 → 2 → 4 → ...
        The line below follows this "next" relationship:
        slow = nums[slow]; */
        int slow=nums[0];//Initialize the slow and fast pointers at the value stored at index 0
        int fast=nums[0];
        do{//Finding a meeting point inside the cycle-->We need it bcoz it proves that a cycle exists and gives us a point inside the cycle-->The meeting point itself is not necessarily the duplicate-->We use it to find the cycle entrance
        //We temporarily view nums[index] as the next pointer of index-->So nums[currentIndex] gives us the next position to move to(Ex: .next in a LL)
            slow=nums[slow];//Slow moves 1 step
            fast=nums[nums[fast]];//Fast moves 2 steps
        }while(slow != fast);
        /* Find the entrance of the cycle-->Start another pointer from the beginning-->The mathematical property of Floyd's algorithm tells us that if one pointer starts from the beginning and the other starts from the meeting point,then moving both one step at
        a time makes them meet at the cycle entrance */           
        int slow2=nums[0];//Start another pointer from the beginning to find the cycle entrance
        while(slow != slow2){/* Both pointers now move ONE step at a time
        slow2 → starts from the beginning
        slow  → starts from the Phase-1 meeting point and their meeting point = cycle entrance */
            slow=nums[slow];
            slow2=nums[slow2];
        }
        //The cycle entrance is the duplicate number bcoz the duplicate value appears at two different positions, causing the array-based LL traversal to enter a cycle at that value
        return slow;//Return the duplicate value found in the array
    }
}
/* Practical Approach:
    Treat the array as a Linked List by imagining index → nums[index]
    The duplicate number creates a cycle in this structure
    Use Floyd's Hare-Turtle algorithm to find a meeting point inside the cycle
    Start another pointer from the beginning and move both pointers one step at a time
    Their second meeting point is the cycle entrance, which is the duplicate number
    No extra array or HashSet is used, so extra space is O(1) */