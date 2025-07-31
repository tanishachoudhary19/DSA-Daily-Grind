//Link:https://leetcode.com/problems/rotate-string/
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-31

class RotateString{
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        String rotated = s+s;
        return rotated.contains(goal);
    }
}