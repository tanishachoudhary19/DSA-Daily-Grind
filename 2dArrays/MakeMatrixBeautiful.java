//Link:https://www.geeksforgeeks.org/problems/make-matrix-beautiful-1587115620/1
//tc:O(n2)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-28

class MakeMatrixBeautiful{
    public static int balanceSums(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[] rowSum = new int[n];
        int[] colSum = new int[m];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += mat[i][j];
            }
            rowSum[i] = sum;
        }
        for(int j=0; j<m; j++){
            int sum = 0;
            for(int i=0; i<n; i++){
                sum += mat[i][j];
            }
            colSum[j] = sum;
        }
        
        int target = 0;
        for(int i=0; i<n; i++) target = Math.max(target,rowSum[i]);
        for(int i=0; i<m; i++) target = Math.max(target,colSum[i]);
        int total = 0;
        for(int i=0; i<n; i++) total += rowSum[i];
        int count = (target*n)-total;
        return count;
        
    }
}