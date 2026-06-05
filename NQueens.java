public class NQueens {

   
    static void sout(int[][] board, int n) {

        System.out.println("Solution:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }

        System.out.println();
    }

   
    static boolean isSafe(int[][] board, int row, int col, int n) {

       
        for (int i = 0; i < row; i++) {

            if (board[i][col] == 1) {
                return false;
            }
        }

        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 1) {
                return false;
            }
        }

       
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {

            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

   
    static void NQueens(int[][] board, int row, int n) {

        // Base Case
        if (row == n) {

            sout(board, n);
            return;
        }

        
        for (int j = 0; j < n; j++) {

            if (isSafe(board, row, j, n)) {

    
                board[row][j] = 1;

               
                NQueens(board, row + 1, n);

                
                board[row][j] = 0;
            }
        }
    }

    
    public static void main(String[] args) {

        int n = 8;

        
        int[][] board = new int[n][n];

        
        NQueens(board, 0, n);
    }
}