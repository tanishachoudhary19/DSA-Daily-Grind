//Link:https://leetcode.com/problems/odd-even-linked-list/
//sc:O(1)
// Status: Solved ✅ | Date: 2025-08-08

// class OddEvenLL{
//     public Node oddEven(Node head){
//         if(head == null || head.next == null);
//         Node odd = head;
//         Node even = head.next;
//         Node evenhead = head.next;
//         while(even != null && evenhead.next != null){
//             odd.next = odd.next.next;
//             even.next = even.next.next;
//             odd = odd.next;
//             even = even.next;
//         }
//         odd.next = evenhead;
//         return head;
//     }
// }