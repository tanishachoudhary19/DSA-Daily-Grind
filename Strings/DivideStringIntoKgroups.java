//LINK:https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/?envType=daily-question&envId=2025-06-22
//tc: O(N)
//SC:O(N)
// Status: Solved ✅ | Date: 2025-06-22

class DivideStringIntoKgroups{
    public String[] divideString(String s, int k, char fill){
        int n = s.length();
        int NumOfGroups = n+k-1/k;
        String[] res = new String[NumOfGroups];
        for(int i=0; i<NumOfGroups; i++){
            StringBuilder group = new StringBuilder();
            for(int j=0; j<k; j++){
                int index = i*k+j;
                if(index < n){
                    group.append(s.charAt(index));
                }else{
                    group.append(fill);
                }
            }
            res[i] = group.toString();
        }
        return res;
    }

}