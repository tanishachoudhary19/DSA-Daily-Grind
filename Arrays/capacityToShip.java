//Link:https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
//tc:O(n * log(W - M))
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-13

// class capacityToShip{
//     public int shipWithinDays(int[] weights, int days){
//         int low = 0, high = 0;
//         for(int weight : weights){
//             low = Math.max(low, weight);
//             high += weight;
//         }
//         while(low < high){
//             int mid = low + (high-low)/2;
//             if(canShip(weights,days,mid)) high = mid;
//             else low = mid+1;
//         }
//         return low;
//     }
//     private boolean canShip(int[] weights, int days, int mid){
//         int day = 1;
//         int currload = 0;
//         for(int weight : weights){
//             if(currload + weight > mid){
//                 day++;
//                 currload = 0;
//             }else{
//                 currload += weight;
//             }
//             return day <= days;
//         }
//     }
// }