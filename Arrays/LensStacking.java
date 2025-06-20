//link : https://www.algopath.ai/problems/lens-stacking
//TC: O(N)
//SC: O(N)
// Status: Solved ✅ | Date: 2025-06-20

import java.util.*;
class LensStacking{
    public static void stacking(int[] arr, long M){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            long product = 1L*arr[left]*arr[right];
            if (product== M){
                System.out.println("YES");
                return;
            }
            else if (product < M) left++;
           else right--;
        }
        System.out.println("NO");
    }
    public static void main(String[] args) throws java.lang.Exception {
        // Start coding here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        long M = input.nextLong();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }

        stacking(arr,M);
    }
}