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

}
