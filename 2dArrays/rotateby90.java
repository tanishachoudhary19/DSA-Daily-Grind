//Link:https://leetcode.com/problems/rotate-image/
//tc:O(n^2)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-16

class rotateby90{
     public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp  = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}