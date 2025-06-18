//link:https://leetcode.com/problems/merge-k-sorted-lists/
//TC : O(N logK);
//SC: O(K);
// Status: Solved ✅ | Date: 2025-06-18

// class MergeKsortedLists{
//     public ListNode mergeKLists(ListNode[] lists) {
//         Comparator<ListNode> comp = (a,b)->Integer.compare(a.val,b.val);
//         PriorityQueue<ListNode> pq = new PriorityQueue<>(comp);

//         for(ListNode l : lists){
//             if(l != null) pq.add(l);
//         }

//         ListNode dummy = new ListNode(0);
//         ListNode temp = dummy;
//         while(!pq.isEmpty()){
//             ListNode node = pq.poll();
//             temp.next = node;
//             temp = temp.next;
//             if(node.next != null) pq.add(node.next);
//         }
//         return dummy.next;
//     }

// }