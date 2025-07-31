//Link:https://leetcode.com/problems/valid-anagram/
//tc:O(n logn)
//sc: O(1)
//Status: Solved ✅ | Date: 2025-07-31

class validAnagram{
    public boolean isAnagram(String s, String t) {
      char[] s1 = s.toCharArray();
      char[] s2 = t.toCharArray();
      Arrays.sort(s1);
      Arrays.sort(s2);
      return Arrays.equals(s1,s2);
    }
}