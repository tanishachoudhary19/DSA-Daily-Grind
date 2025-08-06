//Link:https://leetcode.com/problems/powx-n/
//tc:O(log n)
//sc: O(log n)
//Status: Solved ✅ | Date: 2025-08-6

class powXN{
     private double Pow(double x, long n){
       if(n == 0) return 1;
       double half = Pow(x,n/2);
       if(n % 2 == 0) return half*half;
       else return x*half*half;
    }
    public double myPow(double x, int n) {
       long N = n;
       if(N < 0){
        x = 1/x;
        N = -N;
       }
       return Pow(x,N);
    }
}