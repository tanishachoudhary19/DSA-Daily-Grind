//Link:https://leetcode.com/problems/linked-list-cycle/
//tc: O(n)
//sc: O(n)
//Status: Solved ✅ | Date: 2025-08-6

// class LLCycle{
//     public boolean hasCycle(ListNode head) {
//         if(head == null || head.next == null) return false;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//             if(fast == slow) return true;
//         }
//         return false;
//     }
// }