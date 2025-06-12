//LINK:https://leetcode.com/problems/reorder-list/description/
//TC : O(N);
//SC: O(1);
// Status: Solved ✅ | Date: 2025-06-12


// class ReorderList{
//      public ListNode reverse(ListNode second){
//         ListNode curr = second;
//         ListNode prev = null;
//         while(curr != null){
//             ListNode nextNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//         }
//         return prev;
//     }

//     public void reorderList(ListNode head) {
//         if(head == null || head.next == null) return;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast.next != null && fast.next.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         ListNode second = reverse(slow.next);
//         slow.next = null;

//         ListNode first = head;
//         while(second != null){
//             ListNode temp1 = first.next;
//             ListNode temp2 = second.next;
//             first.next = second;
//             second.next = temp1;
//             first = temp1;
//             second = temp2;
//         }
//     }

// }







