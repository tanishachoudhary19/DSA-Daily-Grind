//Link:https://leetcode.com/problems/merge-two-sorted-lists/description/
//TC:O((n + m) log(n + m))
//SC:O(n + m)
// Status: Solved ✅ | Date: 2025-06-09

// class MergeTwoSortedlists{
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//       ArrayList<Integer> arr = new ArrayList<>();
//       while(list1 != null){
//         arr.add(list1.val);
//         list1 = list1.next;
//       }
//       while(list2 != null){
//         arr.add(list2.val);
//         list2 = list2.next;
//       }
//       Collections.sort(arr);
//       ListNode dummy = new ListNode(-1);
//       ListNode curr = dummy;
//       for(int i=0; i<arr.size(); i++){
//         curr.next = new ListNode(arr.get(i));
//         curr = curr.next;
//       }
//       return dummy.next;
//     }
// }