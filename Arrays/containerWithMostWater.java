//Link:https://leetcode.com/problems/container-with-most-water/description/
//TC:O(N)
//SC: O(1)
// Status: Solved ✅ | Date: 2025-06-07

class containerWithMostWater{
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            maxArea = Math.max(h*w,maxArea);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
    }
    return maxArea;
}
}