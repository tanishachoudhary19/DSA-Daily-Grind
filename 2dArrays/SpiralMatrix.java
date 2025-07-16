//Link:https://leetcode.com/problems/set-matrix-zeroes/?envType=daily-question&envId=2025-05-21
//tc:O(n*m)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-16

import java.util.*;
class SpiralMatrix{
       public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int rowstart = 0;
        int rowend = m-1;
        int colstart = 0;
        int colend = n-1;
        while(rowstart <= rowend && colstart <= colend){
            for(int i=colstart; i<=colend; i++){
                list.add(matrix[rowstart][i]);
            }
            rowstart++;
            for(int i=rowstart; i<= rowend; i++){
                list.add(matrix[i][colend]);
            }
            colend--;
            if(rowstart <= rowend){
                for(int i=colend; i>=colstart; i--){
                    list.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colstart <= colend){
                for(int i=rowend; i>=rowstart; i--){
                    list.add(matrix[i][colstart]);
                }
                colstart++;
            }
        }
        return list;
    }
}