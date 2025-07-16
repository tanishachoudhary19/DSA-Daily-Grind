//Link:https://leetcode.com/problems/set-matrix-zeroes/?envType=daily-question&envId=2025-05-21
//tc:O(n*m)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-16

class SetMatrixZeroes{
       public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}