
public class E29Queens {

    private static final int BOARD_SIZE = 8;

    private static int calls = 0;

    public static void main(String[] args) {
        Board board = new Board(BOARD_SIZE);

        queens(board, 8, 0);

        System.out.println(board);
        System.out.println(calls);
    }

    private static boolean queens(Board board, int numQueens, int row) {
        calls++;
        if (numQueens == 0) {
            return true;
        } else {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (board.isSafe(row, col)) {
                    board.place(row, col);
                    if (queens(board, numQueens - 1, row + 1)) {
                        return true;
                    }
                    board.remove(row, col);
                }
            }
            return false;
        }
    }

}
