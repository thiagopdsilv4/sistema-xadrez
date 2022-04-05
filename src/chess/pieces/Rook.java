package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);//repassando os dados para o construtor da superClasse
		
	}
	
	@Override
	public String toString() { //convertendo torre para string
		return "R";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; //matriz de booleanos na mesma dimenção  do tabuleiro
		
		return mat;
	}
}
