class NDigitnum{
    private static void helper(int start, int n,ArrayList<Integer> curr, ArrayList<Integer> res){
        if(n ==0 ){
            int ans = 0;
            for(int digit : curr){
                ans = ans*10+digit;
            }
            res.add(ans);
            return;
        }
        for(int i=start; i<=9; i++){
            curr.add(i);
            helper(i+1,n-1,curr,res);
            curr.remove(curr.size()-1);
        }
        
    }
    public static ArrayList<Integer> increasingNumbers(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(n == 1){
            for(int i=0; i<=9; i++) res.add(i);
            return res;
        }
        ArrayList<Integer> curr = new ArrayList<>();
        helper(1,n,curr,res);
        return res;
    }
}