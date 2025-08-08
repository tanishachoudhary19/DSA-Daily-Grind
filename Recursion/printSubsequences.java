//Link:https://www.naukri.com/code360/problems/print-subsequences_624391?leftPanelTabValue=PROBLEM
//tc:o(2^n*N)
//sc:O(N)
// Status: Solved ✅ | Date: 2025-08-08

class printSubsequences{
    private static void subsequences(String input, String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        String sub = input.substring(1);
        subsequences(sub, output);
        subsequences(sub,output+ch);
    }
    public static void printsubsequences(String input){
        subsequences(input,"");
    }
}