//Link:https://www.geeksforgeeks.org/problems/c-matrix-rotation-by-180-degree0745/1
//tc:O(n^2)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-16

class rotateby180{
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        for(int i=0; i<n; i++){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
       for(int j=0; j<mat[0].length; j++){
           int top = 0;
           int bottom = mat[0].length-1;
           while(top < bottom){
               int temp = mat[top][j];
               mat[top][j] = mat[bottom][j];
               mat[bottom][j] = temp;
               top++;
               bottom--;
           }
       }
        
    }
}