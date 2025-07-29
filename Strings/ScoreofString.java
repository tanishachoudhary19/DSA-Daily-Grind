//Link:https://leetcode.com/problems/score-of-a-string/
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-29

class ScoreofString{
      public int scoreOfstring(String s) {
        char[] words = s.toCharArray();
        int left = 0;
        int right = left+1;
        int ans = 0;
        while(right < words.length){
            ans += Math.abs((int)words[left] - (int)words[right]);
            left = right;
            right++;
        }
        return ans;
    }
}