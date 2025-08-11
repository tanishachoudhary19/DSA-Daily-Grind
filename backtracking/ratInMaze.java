//Link:https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
//tc:O(4^n^2)
//sc:O(n^2)
// Status: Solved ✅ | Date: 2025-08-11

class ratInMaze{
     private boolean isValid(int x, int y, int n, int[][] maze){
        return x>=0 && x<n && y>=0 && y<n && maze[x][y] == 1;
    }
    private void helper(int x, int y, int n, int[][]maze, String path, char[] dir, int[] dx, int[]dy, ArrayList<String> res){
        if(x == n-1 && y == n-1){
            res.add(path);
            return;
        }
        for(int i=0; i<4; i++){
            int newX = x+dx[i];
            int newY = y+dy[i];
            if(isValid(newX,newY,n,maze)){
                maze[x][y] = 0;
                helper(newX,newY,n,maze,path+dir[i],dir,dx,dy,res);
                maze[x][y] = 1;
            }
        }
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> res = new ArrayList<>();
        char[] dir = {'D','L','R','U'};
        int[] dx = {1,0,0,-1};
        int[] dy = {0,-1,1,0};
        int n = maze.length;
        if(maze[0][0] == 1) helper(0,0,n,maze,"",dir,dx,dy,res);
        return res;
    }
}