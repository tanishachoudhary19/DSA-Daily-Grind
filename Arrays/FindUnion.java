// link: https://www.geeksforgeeks.org/problems/union-of-two-arrays3538/1
//Tc : O(n+m)
//Sc : O(n+m)
// Status: Solved ✅ | Date: 2025-07-03

import java.util.*;
class FindUnion{
       public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<a.length; i++){
            hset.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            hset.add(b[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num : hset){
            ans.add(num);
        }
        return ans;
    }
}