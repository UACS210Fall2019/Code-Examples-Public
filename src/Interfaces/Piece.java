package Interfaces;

public abstract class Piece {
	
	private int row;
	private int column;
	
	public Piece(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public abstract boolean moveValid(int x, int y);
}
