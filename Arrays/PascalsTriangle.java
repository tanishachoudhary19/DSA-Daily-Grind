//Link:https://leetcode.com/problems/pascals-triangle/
//tc:O(numRows^2)
//sc:O(numRows^2)
//Status: Solved ✅ | Date: 2025-07-17

import java.util.*;
class PascalsTriangle{
        public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0) return ans;
        List<Integer>firstrow = new ArrayList<>();
        firstrow.add(1);
        ans.add(firstrow);
        for(int i=1; i<numRows; i++){
            List<Integer> prevRow = ans.get(i-1);
            List<Integer> currRow = new ArrayList<>();
             currRow.add(1);
            for(int j=1; j<i; j++){
                currRow.add(prevRow.get(j-1)+prevRow.get(j));
            }
             currRow.add(1);
             ans.add(currRow);
        }
        return ans;
    }
}