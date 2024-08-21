package chess;

import boardgame.Position;
<<<<<<< HEAD

public class ChessPosition {

=======
import boardgame.Position;

public class ChessPosition {
	
>>>>>>> 3993511 (Little improvement in board printing)
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
<<<<<<< HEAD
	
=======

>>>>>>> 3993511 (Little improvement in board printing)
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
	
}
=======
}
>>>>>>> 3993511 (Little improvement in board printing)
