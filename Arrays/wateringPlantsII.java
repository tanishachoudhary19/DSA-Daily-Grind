//link:https://leetcode.com/problems/watering-plants-ii/
//TC:O(N)
//SC:O(1)
// Status: Solved ✅ | Date: 2025-06-14

// class wateringPlantsII{
//   public int minimumRefill(int[] plants, int capacityA, int capacityB) {
//         int left = 0;
//         int right = plants.length-1;
//         int count = 0;
//         int A =  capacityA;
//         int B = capacityB;
//         while(left < right){
//             if(plants[left] > capacityA){
//                 count++;
//                 capacityA = A;
//             }
//             capacityA -= plants[left
//             ];
//             left++;

//             if(plants[right] > capacityB){
//                 count++;
//                 capacityB = B;
//             }
//             capacityB -= plants[right];
//             right--;
//         }
//         if(left == right){
//             int need = plants[left];
//             if(Math.max(capacityA, capacityB) < need) count++;
//             else{
//                 if(capacityA >= capacityB){
//                     capacityA -= need;
//                 }else{
//                     capacityB -= need;
//                 }
//             }
//         }
//         return count;
//     }
// }