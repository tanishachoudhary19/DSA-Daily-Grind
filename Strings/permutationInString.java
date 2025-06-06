
import java.util.Arrays;

//LiNK:https://leetcode.com/problems/permutation-in-string/description/
//T.C = O(N+M)
//SC : O(1)
// Status: Solved ✅ | Date: 2025-06-06

class permutationInString{
    public boolean checkInclusion(String s1, String s2){
        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(char c : s1.toCharArray()){
            s1freq[c-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            s2freq[s2.charAt(i)-'a']++;
            if(i > s1.length()){
                s2freq[s2.charAt(i-s1.length()-'a')]--;
            }
            if(Arrays.equals(s1freq,s2freq)) return true;
        }
        return false;
    }
}