package Interfaces;

public class Rook extends Piece {
	
	public Rook(int row, int column) {
		super(row, column);
	}

	public boolean moveValid(int row, int column) {
		return ((getRow() == row && getColumn() != column) ||
				(getRow() != row && getColumn() == column));
	}
}
