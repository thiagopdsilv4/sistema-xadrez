package boardgame;

public abstract class Piece {

	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {//metodo concreto
		return possibleMoves()[position.getRow()][position.getColumn()];//utilizando metodo abstrato (hook methods)
	}
	
	public boolean isThereAnyPossibleMove() { //implementação concreta que depende do método abstrato
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
