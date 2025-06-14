//Link:https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//TC: O(N);
//SC: O(1);
// Status: Solved ✅ | Date: 2025-06-14

// class removeNthnodefromLast{
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummy = new ListNode(0);
//         dummy.next = head;
//         ListNode slow = dummy;
//         ListNode fast = dummy;
//         for(int i=0; i<=n; i++){
//             fast = fast.next;
//         }
//         while(fast != null){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         slow.next = slow.next.next;
//         return dummy.next;
//     }

// }

//Second method is to reverse then remove then return reversed head
