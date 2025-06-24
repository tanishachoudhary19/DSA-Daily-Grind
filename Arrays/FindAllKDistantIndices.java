//link:https://leetcode.com/problems/find-all-k-distant-indices-in-an-array/?envType=daily-question&envId=2025-06-24
//TC : O(N2)
//SC : O(N);
// Status: Solved ✅ | Date: 2025-06-24
import java.util.*;

class FindAllKDistantIndices{
        public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> keyindex = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == key) keyindex.add(i);
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j : keyindex){
                if(Math.abs(i-j) <= k){
                     res.add(i);
                     break;
                }
            }
        }
        return res;
    }
}