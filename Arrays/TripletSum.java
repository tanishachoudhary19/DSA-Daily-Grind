//Link:https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1
//tc:O(n2)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-20

import java.util.*;
class TripletSum{
     public static boolean hasTripletSum(int arr[], int target) {
        // Your code Her
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int left = i+1;
            int right = arr.length-1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum > target) right--;
                else if(sum < target) left++;
                else{
                    return true;
                }
            }
        }
        return false;
    }
}