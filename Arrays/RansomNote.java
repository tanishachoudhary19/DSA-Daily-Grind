//Link:https://leetcode.com/problems/ransom-note/
//tc:O(n+m)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-25

class RansomNote{
     public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hmap = new HashMap<>();
        for(char c : magazine.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : ransomNote.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c : map.keySet()){
            if(hmap.containsKey(c)){
                int count1 = map.get(c);
                int count2 = hmap.get(c);
                if(count1 > count2) return false;
                else c++;
            }else{
                return false;
            }
        }
        return true;
    }
}