//link:https://leetcode.com/problems/remove-duplicates-from-sorted-list/
//TC:O(N);
//SC: O(1)
// Status: Solved ✅ | Date: 2025-06-14


// class removeDuplicatesFromSortedLL{
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode temp = head;
//         while(temp != null && temp.next != null){
//             if(temp.val == temp.next.val){
//                     temp.next = temp.next.next;
//                 }
//             else temp = temp.next;
//         }
//         return head;
//     }

// }