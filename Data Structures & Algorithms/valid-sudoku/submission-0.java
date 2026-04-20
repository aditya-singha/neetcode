class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board[i])) {
                return false;
            }
        }
        
        for (int col = 0; col < 9; col++) {
            if (!isValidColumn(board, col)) {
                return false;
            }
        }
        for (int grid = 0; grid < 9; grid++) {
            if (!isValidGrid(board, grid )) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidRow(char[] row) {
        Set<Character> seen = new HashSet<>();
        
        for (char num : row) {
            if (num != '.' && (!seen.add(num) || num < '1' || num > '9')) {
                return false;
            }
        }
        
        return true;
    }

    public boolean isValidColumn(char[][] board, int colIndex) {
        Set<Character> seen = new HashSet<>();
        
        for (int row = 0; row < 9; row++) {
            char num = board[row][colIndex];
            if (num != '.' && (!seen.add(num) || num < '1' || num > '9')) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidGrid(char[][] board, int gridNum) {
        Set<Character> seen = new HashSet<>();

        int startRow = (gridNum / 3) * 3;
        int startCol = (gridNum % 3) * 3;

        for (int row = startRow; row < startRow +3 ; row ++) {
            for (int col = startCol; col < startCol +3; col++) {
                char num = board[row][col];
                if (num != '.' && (!seen.add(num) || num < '1' || num > '9')) {
                    return false;
                }
            }
        }
        
        
        
        return true;
    }
}
