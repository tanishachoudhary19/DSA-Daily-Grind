//Link:https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
//tc:O(n)
//sc:O(n)
//Status: Solved ✅ | Date: 2025-07-22

// import java.util.*;
// class MissingandRepeating{
//     ArrayList<Integer> findTwoElement(int arr[]) {
//         int n = arr.length;
//         HashMap<Integer,Integer>hmap = new HashMap<>();
//         int missingvalue = 0;
//         int repeatingvalue = 0;
//         for(int i : arr){
//             hmap.put(i,hmap.getOrDefault(i,0)+1);
//         }
//         for(int i=0; i<=n; i++){
//             if(!hmap.containsKey(i)) missingvalue = i;
//         }
//         for(int i : hmap.keySet()){
//             int count = hmap.get(i);
//             if(count == 2) repeatingvalue = i;
//         }
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(repeatingvalue);
//         list.add(missingvalue);
//         return list;
//     }
// }
