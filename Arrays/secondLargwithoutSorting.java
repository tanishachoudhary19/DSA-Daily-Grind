//TC: O(N)
//SC : O(1)

// import java.util.*;
// class secondLargwithoutSorting{
//     public static int findsecondl(int []arr, int n){
//         int maxi = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             maxi = Math.max(maxi,arr[i]);
//         }
//         int secondlargest = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             if(arr[i] < maxi && arr[i] > secondlargest){
//                 secondlargest = arr[i];
//             }
//         }
//         if(secondlargest == Integer.MIN_VALUE) return -1;
//         return secondlargest;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         int res = findsecondl(arr,n);
//         System.out.println(res);
//     }
// }