//link:https://leetcode.com/problems/minimum-penalty-for-a-shop/
//TC: O(N)
//Sc: O(N);
// Status: Solved ✅ | Date: 2025-06-15

class minPenaltyforShop{
    public int bestClosingTime(String customers) {
        int n = customers.length();
        char[] arr = customers.toCharArray();
        int[] prefixN = new int[n+1];
        int[] suffixY = new int[n+1];
        int countN = 0;
        int countY = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 'N') countN += 1;
            prefixN[i+1] = countN;
        }

        for(int i=n-1; i >=0; i--){
            if(arr[i] == 'Y') countY += 1;
            suffixY[i] = countY;
        }

        int[] penalty = new int[n+1];
        for(int i=0; i<=n; i++){
            penalty[i] = prefixN[i] + suffixY[i];
        }

        int minPenalty = penalty[0];
        int bestHour = 0;
        for(int i=1; i<=n; i++){
            if(penalty[i] < minPenalty){
                 minPenalty = penalty[i];
                bestHour = i;
            }
        } 
        return bestHour;
    }
}