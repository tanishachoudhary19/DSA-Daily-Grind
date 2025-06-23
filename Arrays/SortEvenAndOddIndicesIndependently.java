//Link : https://leetcode.com/problems/sort-even-and-odd-indices-independently/
//TC : O(n log n)
//SC: O(N);
// Status: Solved ✅ | Date: 2025-06-23

import java.util.Arrays;

class SortEvenAndOddIndicesIndependently{
    public int[] sortEvenOdd(int[] nums){
        int n = nums.length;
        int evencount = (n+1)/2;
        int oddcount = n/2;
        int[] even = new int[evencount];
        int[] odd = new int[oddcount];
        for(int i=0; i<n; i++){
            if(i % 2 == 0) even[i/2] = nums[i];
            else odd[i/2] = nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int evenindex = 0;
        int oddindex = oddcount-1;
        for(int i=0; i<n; i+=2){
            nums[i] = even[evenindex++];
        }
        for(int i=1; i<n; i+=2){
            nums[i] = odd[oddindex--];
        }
        return nums;
    }
}