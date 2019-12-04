public class Board {

    private boolean[][] board;

    /* Construct empty board */
    public Board(int size) {
        board = new boolean[size][size];
    }

    /* Returns true if a queen can be placed in specified row,column */
    public boolean isSafe(int row, int column) {
        return isSafeRow(row) && isSafeColumn(column)
                && isSafeDiagonals(row, column);
    }

    /* Places a queen in the specified row,column */
    public void place(int row, int column) {
        board[row][column] = true;
    }

    /* Removes a queen from specified row,column */
    public void remove(int row, int column) {
        board[row][column] = false;
    }

    /* String representation of the board */
    public String toString() {
        String result = "";
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                result += board[row][column] ? "Q " : "_ ";
            }
            result += "\n";
        }
        return result;
    }

    /* Private helper functions */

    /* Returns true if the passed in row is safe. */
    private boolean isSafeRow(int row) {
        for (int column = 0; column < board[row].length; column++) {
            if (board[row][column]) {
                return false;
            }
        }
        return true;
    }

    /* Returns true if the passed in column is safe. */
    private boolean isSafeColumn(int column) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][column]) {
                return false;
            }
        }
        return true;
    }

    /* Returns true if diagonals of the passed in row,column are safe. */
    private boolean isSafeDiagonals(int row, int column) {
        // Down and right
        for (int i = 0; row + i < board.length
                && column + i < board[0].length; i++) {
            if (board[row + i][column + i]) {
                return false;
            }
        }
        // Up and left
        for (int i = 0; row + i >= 0 && column + i >= 0; i--) {
            if (board[row + i][column + i]) {
                return false;
            }
        }
        // Up and right
        for (int i = 0; row - i >= 0 && column + i < board[0].length; i++) {
            if (board[row - i][column + i]) {
                return false;
            }
        }
        // Down and left
        for (int i = 0; row + i < board.length && column - i >= 0; i++) {
            if (board[row + i][column - i]) {
                return false;
            }
        }
        return true;
    }

}