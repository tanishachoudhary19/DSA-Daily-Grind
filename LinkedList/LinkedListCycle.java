//Link:https://leetcode.com/problems/linked-list-cycle/description/
//tc:o(N)
//sc:O(1)
// Status: Solved ✅ | Date: 2025-06-11

// class LinkedListCycle{
//      public boolean hasCycle(ListNode head) {
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