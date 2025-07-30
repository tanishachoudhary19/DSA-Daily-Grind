//Link:https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1
//tc:O(log n)
//sc:O(log n)
//Status: Solved ✅ | Date: 2025-07-30

// class NumofOccurences{
//     int countFreq(int[] arr, int target) {
//         int first = findFirst(arr,target);
//         if(first == -1) return 0;
//         int last = findLast(arr,target);
//         return last-first+1;
//     }
//     private int findFirst(int[] arr, int target){
//         int left = 0;
//         int right = arr.length-1;
//         int res = -1;
//         while(left <= right){
//             int mid = left + (right-left)/2;
//             if(arr[mid] == target){
//                 res = mid;
//                 right = mid-1;
//             }else if(arr[mid] > target) right = mid-1;
//             else left = mid+1;
//         }
//         return res;
//     }
//     private int findLast(int[] arr, int target){
//         int left = 0;
//         int right = arr.length-1;
//         int res = -1;
//         while(left <= right){
//             int mid = left + (right-left)/2;
//             if(arr[mid] == target){
//                 res = mid;
//                 left = mid+1;
//             }else if(arr[mid] > target) right = mid-1;
//             else left = mid+1;
//         }
//         return res;
//     }
// }
