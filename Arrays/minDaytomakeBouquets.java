class minDaytomakeBouquets{
    public int minDays(int[] bloomDay, int m, int k){
        int n = bloomDay.length;
        int left = 0;
        int right = (int)1e9;
        long total = (long)m*k;
        if(total > n) return -1;
        while(left < right){
            int mid = left + (right-left)/2;
            if(isPossible(bloomDay, m , k, mid)) right = mid;
            else left = mid+1;
        }
        return left;
    }
    private boolean isPossible(int[]bloomDay, int m, int k, int mid){
        int count = 0;
        int bonquets = 0;
        for(int bloom : bloomDay){
            if(bloom <= mid){
                count++;
                if(count == k){
                    bonquets++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return bonquets >= m;
    }
}