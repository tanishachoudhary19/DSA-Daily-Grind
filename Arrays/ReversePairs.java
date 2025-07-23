//Link:https://leetcode.com/problems/reverse-pairs/
//tc:O(n log n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-23

class ReversePairs{
     public int merge(int[]nums, int left, int mid, int right){
        int count = 0;
        int j=mid+1;
        for(int i=left; i<=mid; i++){
            while(j <= right && (long)nums[i] > 2L*nums[j]){
                j++;
            }
            count += (j-(mid+1));
        }
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0; i<n1; i++){
                L[i] = nums[left+i];
        }
        for(int i=0; i<n2; i++){
                R[i] = nums[mid+1+i];
        }
        int i=0;
        j=0;
        int k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                nums[k++] = L[i++];
            }else{
                nums[k++] = R[j++];
            }
        }
        while(i < n1) nums[k++] = L[i++];
        while(j < n2)nums[k++] = R[j++];
        return count;
    }
    public int mergeSort(int[]nums, int left , int right){
        int count = 0;
        if(left < right){
            int mid = left + (right-left)/2;
            count += mergeSort(nums,left,mid);
            count += mergeSort(nums,mid+1,right);
            count += merge(nums,left,mid,right);
        }
        return count;
    }
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums,0,n-1);
    }
}