//link:https://leetcode.com/problems/sort-list/
//TC:(n logn)
//SC: O(n)
// Status: Solved ✅ | Date: 2025-06-18

// class SortList{
//       public ListNode sortList(ListNode head) {
//         if(head == null || head.next == null) return head;
//         Comparator<ListNode> comp = (a,b)->Integer.compare(a.val, b.val);
//         PriorityQueue<ListNode> pq = new PriorityQueue<>(comp);

//         ListNode temp = head;
//         while(temp != null){
//             pq.add(temp);
//             temp = temp.next;
//         }

//         ListNode dummy = new ListNode(0);
//         temp = dummy;
//         while(!pq.isEmpty()){
//             ListNode node = pq.poll();
//             temp.next = node;
//             temp = temp.next;
//         }
//         temp.next = null;
//         return dummy.next;
//     }
// }