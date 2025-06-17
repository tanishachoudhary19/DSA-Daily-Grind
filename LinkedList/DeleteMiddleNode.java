//link:https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
//TC:O(N)
//SC: O(1);
// Status: Solved ✅ | Date: 2025-06-17

// class DeleteMiddleNode{
//       public ListNode deleteMiddle(ListNode head) {
//         if(head == null || head.next == null) return null;
//         ListNode slow = head;
//         ListNode fast = head;
//         ListNode prev = null;
//         while(fast != null && fast.next != null){
//             prev = slow;
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         prev.next = slow.next;
//         return head;
//     }
// }