package leetCode;

import java.util.Arrays;
//sudoku solver

public class LC37 {
    public static void main(String[] args) {
        char[][] board={{'.','6','.','.','.','.','.','4','9'},
                        {'.','.','8','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.'},
                        {'8','.','.','.','2','.','5','.','.'},
                        {'.','9','.','.','.','.','.','6','.'},
                        {'.','.','.','.','1','.','.','.','.'},
                        {'3','.','.','7','.','.','8','.','.'},
                        {'7','.','.','9','.','4','.','.','.'},
                        {'.','.','.','6','.','.','.','.','.'}
        };
        if(board == null || board.length == 0)
            return;
        System.out.println(solve(board));
        System.out.println(Arrays.deepToString(board));

    }


        public static boolean solve(char[][] board){
            for(int i = 0; i < board.length; i++){
                for(int j = 0; j < board[0].length; j++){
                    if(board[i][j] == '.'){
                        for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                            if(isValid(board, i, j, c)){
                                board[i][j] = c; //Put c for this cell

                                if(solve(board))
                                    return true; //If it's the solution return true
                                else
                                    board[i][j] = '.'; //Otherwise go back
                            }
                        }

                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean isValid(char[][] board, int row, int col, char c){
            for(int i = 0; i < 9; i++) {
                if(board[i][col] != '.' && board[i][col] == c) return false; //check row
                if(board[row][i] != '.' && board[row][i] == c) return false; //check column
                if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' &&
                        board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
            }
            return true;
        }
    }

