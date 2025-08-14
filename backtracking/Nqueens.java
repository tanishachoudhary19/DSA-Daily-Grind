//link:https://leetcode.com/problems/n-queens/
//TC:O(N.N!)
//SC:O(N^2)
// Status: Solved ✅ | Date: 2025-08-12

// import java.util.*
// class Nqueens {
//    private boolean isValid(int rowidx, int colidx,int n, char[][] board){
//         for(int col=0; col<n; col++){
//             if(board[rowidx][col] == 'Q') return false;
//         }
//         int i=rowidx, j=colidx;
//         while(i >=0 && j>=0){
//             if(board[i][j] == 'Q') return false;
//             i--;
//             j--;
//         }
//         i=rowidx;
//         j=colidx;
//         while(i < n && j >= 0){
//             if(board[i][j] == 'Q') return false;
//             i++;
//             j--;
//         }
//         return true;
//     }
//     private void helper(int colidx, int n, char[][] board,List<List<String>> ans){
//         if(colidx == n){
//             List<String> temp = new ArrayList<>();
//             for(int i=0; i<n; i++){
//                 temp.add(new String(board[i]));
//             }
//             ans.add(temp);
//             return;
//         }
//         for(int rowidx = 0; rowidx <n; rowidx++){
//             if(isValid(rowidx,colidx,n,board)){
//                 board[rowidx][colidx] = 'Q';
//                 helper(colidx+1,n,board,ans);
//                 board[rowidx][colidx] = '.';
//             }
//         }
//     }
//     public List<List<String>> solveNQueens(int n) {
//         List<List<String>> ans = new ArrayList<>();
//         char[][] board = new char[n][n];
//         for(int i=0; i<n; i++){
//             Arrays.fill(board[i], '.');
//         }
//         helper(0,n,board,ans);
//         return ans;
//     }  
// }