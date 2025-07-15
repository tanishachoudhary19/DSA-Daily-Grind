//Link:https://leetcode.com/problems/search-a-2d-matrix/
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-15

class search{
     public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int s = 0;
        int e = rows*cols-1;
        while(s <= e){
            int mid = s + (e-s)/2;
            int element = matrix[mid/cols][mid%cols];
            if(element > target) e = mid-1;
            else if(element < target) s= mid+1;
            else return true;
        }
        return false;
    }
}