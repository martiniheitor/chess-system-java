package chess;

<<<<<<< HEAD
public class ChessException extends RuntimeException {
=======
import boardgame.BoardException;

public class ChessException extends BoardException {
>>>>>>> 06abbaca9124e5b8d1a79e18acd4dae17fb22286
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}