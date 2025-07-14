//Link:https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
//tc:O(n)
//sc:O(1)
//Status: Solved ✅ | Date: 2025-07-14

import java.util.*;
class Arrayleaders{
public static ArrayList<Integer> leaders(int arr[]){
    ArrayList<Integer> list = new ArrayList<>();
    int n = arr.length;
    int maxi = arr[n-1];
    list.add(maxi);
    for(int i=n-2; i>=0; i--){
        if(arr[i] >= maxi){
            list.add(arr[i]);
            maxi = Math.max(maxi,arr[i]);
        }
    }
    Collections.reverse(list);
    return list;
}
}