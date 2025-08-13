//Link:https://leetcode.com/problems/power-of-three/?envType=daily-question&envId=2025-08-13
//sc:O(1)
// Status: Solved ✅ | Date: 2025-08-13

class powerofThree{
    public boolean isPowerOfThree(int n) {
        for(int i=0; i<=19; i++){
            int ans = (int)Math.pow(3,i);
            if(ans == n) return true;
        }
        return false;
    }
}