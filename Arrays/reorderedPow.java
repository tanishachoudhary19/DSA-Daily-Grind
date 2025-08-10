//Link:https://leetcode.com/problems/permutations-ii/
//tc:O(log n)
//sc:O(1)
// Status: Solved ✅ | Date: 2025-08-10

import java.util.Arrays;
class reorderedPow{
     public boolean reorderedPowerOf2(int n) {
        int[] count = digitCount(n);
        for(int i=0; i<31; i++){
            int pow = 1 << i;
            if(Arrays.equals(count,digitCount(pow))) return true;
        }
        return false;
    }
        private int[] digitCount(int num){
            int[] cnt = new int[10];
            while(num > 0){
                cnt[num%10]++;
                num /= 10;
            }
            return cnt;
        }
}