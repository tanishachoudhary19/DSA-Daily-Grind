//Link:https://leetcode.com/problems/middle-of-the-linked-list/
//tc:O(n)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-6

import java.util.LinkedList;
class middleofLL{
     public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}