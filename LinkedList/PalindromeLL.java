//LINK:https://leetcode.com/problems/palindrome-linked-list/
//TC : O(N);
//SC: O(1);
// Status: Solved ✅ | Date: 2025-06-12

// class PalindromeLL{
//        public ListNode reverse(ListNode second){
//         ListNode curr = second;
//         ListNode prev= null;
//         while(curr != null){
//             ListNode nextNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//         }
//         return prev;
//     }

//     public boolean isPalindrome(ListNode head) {
//         if(head == null || head.next == null) return true;
//         ListNode slow = head;
//         ListNode fast = head;
//         while(fast.next != null && fast.next.next!= null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         ListNode secondHead = reverse(slow.next);
//         slow.next = null;
//         ListNode firstHead = head;
//         while(secondHead != null){
//             if(firstHead.val == secondHead.val){
//                 firstHead = firstHead.next;
//                 secondHead = secondHead.next;
//             }else{
//                 return false;
//             }
//         }
//         return true;
//     }
// }