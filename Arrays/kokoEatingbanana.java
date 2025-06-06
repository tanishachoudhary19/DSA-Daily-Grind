//Link:https://leetcode.com/problems/koko-eating-bananas/description/
//tc = o(nlog(m))
//sc = o(1);
// Status: Solved ✅ | Date: 2025-06-06

class kokoEatingbanana{
    public int minEatingSpeed(int[] piles, int h){
        int low = 0;
        int high = 0;
        for(int pile : piles){
            high = Math.max(pile,high);
        }
        int res = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            long hours = 0;
            for(int pile : piles){
                hours += Math.ceil((double)pile/mid);
            }
            if(hours <= h){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
}