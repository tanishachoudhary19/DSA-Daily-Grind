//Link:https://www.geeksforgeeks.org/problems/count-substring/1
//tc:O(n)
//sc: O(1)
//Status: Solved ✅ | Date: 2025-07-31

class countsubString{
      public static int countSubstring(String s) {
        // code here
        int n = s.length();
        int start = 0;
        int res = 0;
        int[] freq = new int[3];
        for(int e=0; e<n; e++){
            freq[s.charAt(e) - 'a']++;
            while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                res += n-e;
                freq[s.charAt(start)-'a']--;
                start++;
            }
        }
        return res;
    }
}