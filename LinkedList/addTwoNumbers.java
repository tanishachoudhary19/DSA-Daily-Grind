//link:https://leetcode.com/problems/add-two-numbers/
//Tc: O(Max(N,M))
//Sc:O(Max(N,M))
// Status: Solved ✅ | Date: 2025-06-15

// class addTwoNumbers {
    // public ListNode addTwoNum(ListNode l1, ListNode l2) {
    //     ListNode dummy = new ListNode(0);
    //     ListNode temp = dummy;
    //     int carry = 0;
    //     while(l1 != null || l2 != null || carry != 0){
    //         int sum = carry;
    //         if(l1 != null){
    //             sum += l1.val;
    //             l1 = l1.next;
    //         }
    //         if(l2 != null){
    //             sum += l2.val;
    //             l2 = l2.next;
    //         }

    //         temp.next = new ListNode(sum%10);
    //         temp = temp.next;
    //         carry = sum/10;

    //     }
    //     return dummy.next;
    // }
// }