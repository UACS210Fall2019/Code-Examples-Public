public class E06Queens {

    private static final int BOARD_SIZE = 8;

    public static void main(String[] args) {
        Board board = new Board(BOARD_SIZE);

        queens(board, BOARD_SIZE, 0);

        System.out.println(board);
    }

    // takes a board, a number of queens to place and the current column as
    // parameters. Returns true if there is a placement of the queens on the
    // board that means none are in danger, false otherwise. At the end of the
    // function the queens will be placed on the board in a valid configuration
    // if it is possible.
    public static boolean queens(Board board, int numQueens, int col) {
        if (numQueens == 0) {
            return true;
        } else {
            for (int row = 0; row < BOARD_SIZE; row++) {
                if (board.isSafe(row, col)) {
                    board.place(row, col);
                    if (queens(board, numQueens - 1, col + 1)) {
                        return true;
                    }
                    board.remove(row, col);
                }
            }
            return false;
        }

    }

}
