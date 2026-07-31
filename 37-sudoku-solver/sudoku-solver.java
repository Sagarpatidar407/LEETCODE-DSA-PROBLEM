class Solution {

    static boolean issafe(char[][] board, int rowIndex, int colIndex, char charvalue){
        for(int i=0;i<9;i++){ // horiz
            if(board[rowIndex][i] == charvalue){
                return false;
            }
        }

        for(int i=0;i<9;i++){ // vertical
            if(board[i][colIndex] == charvalue){
                return false;
            }
        }

        int row = rowIndex - rowIndex%3;
        int col = colIndex - colIndex%3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int actrow = row+i;
                int actcol = col+j;
                if(board[actrow][actcol] == charvalue){
                    return false;
                }
            }
        }

        return true;


    }

    static boolean findEmptyCell(char[][] board, int[] emptycell){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.'){
                    emptycell[0] = i;
                    emptycell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean solveSudokuHelper(char[][] board){

        int[] emptycell = new int[2];

        if(!findEmptyCell(board,emptycell)){
            return true;
        }

        int rowIndex = emptycell[0];
        int colIndex = emptycell[1];

        for(int value=1;value<=9;value++){
            char charvalue = (char)(value + '0');
            if(issafe(board, rowIndex, colIndex, charvalue)){
                board[rowIndex][colIndex] = charvalue;
                if(solveSudokuHelper(board) == true){
                    return true;
                }
                board[rowIndex][colIndex] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }
}