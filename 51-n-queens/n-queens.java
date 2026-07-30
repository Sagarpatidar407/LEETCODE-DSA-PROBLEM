class Solution {

    public boolean issafe(char[][] board, int n, int colIndex, int rowIndex){

        int row = rowIndex;
        int col = colIndex;

        while(col>=0){ //horizontal
            if(board[row][col] == 'Q'){
                return false;
            }
            col = col-1;
        }

        row = rowIndex;
        col = colIndex;

        while(row >=0 && col >= 0){ //upper diagnol 
            if(board[row][col] == 'Q'){
                return false;
            }
            col = col-1;
            row = row-1;
        }

        row = rowIndex;
        col = colIndex;

        while(row<n && col >= 0){ //lower diagnol 
            if(board[row][col] == 'Q'){
                return false;
            }
            col = col-1;
            row = row+1;
        }
        return true;
    }

    public void solve(char[][] board, int n, int colIndex, List<List<String>> ans){

        if(colIndex == n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int rowIndex=0;rowIndex<n;rowIndex++){
            if(issafe(board, n, colIndex, rowIndex)){
                board[rowIndex][colIndex] = 'Q';
                solve(board, n, colIndex+1, ans);
                board[rowIndex][colIndex] = '.';

            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }

        int colIndex = 0;

        List<List<String>> ans = new ArrayList<>();

        solve(board, n, colIndex, ans);
        return ans;

    }
}