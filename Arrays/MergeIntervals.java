//Link:https://leetcode.com/problems/merge-intervals/
//tc:O(log n) + O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-22

 import java.util.*;
class MergeIntervals{
      public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
        }
        int[][] res = new int[ans.size()][2];
        for(int i=0; i<ans.size(); i++){
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }
        return res;
    }
}