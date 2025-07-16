//Link:https://leetcode.com/problems/transpose-matrix/
//tc:O(n^2)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-16

class transpose{
    public int[][] Transpose(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[m][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}