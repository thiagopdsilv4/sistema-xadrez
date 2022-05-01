package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);//repassando os dados para o construtor da superClasse
		
	}
	
	@Override
	public String toString() { //convertendo torre para string
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()]; //matriz de booleanos na mesma dimenção  do tabuleiro
		
		Position p = new Position(0, 0);
		
		
		
		//Essa foi a lógica para marcar como verdadeiro as posicoes NW da peca
		
		p.setValues(position.getRow()  - 1, position.getColumn() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //enquanto a posicao p existir e nao tiver uma peca lá, marcar como verdadeira
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() - 1);				
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Essa foi a lógica para marcar como verdadeiro as posicoes a ne da peca
		
		p.setValues(position.getRow() - 1, position.getColumn()  + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //enquanto a posicao p existir e nao tiver uma peca lá, marcar como verdadeira
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn() + 1);					
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Essa foi a lógica para marcar como verdadeiro as posicoes baixo + direita da peca
		p.setValues(position.getRow() + 1, position.getColumn()  + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //enquanto a posicao p existir e nao tiver uma peca lá, marcar como verdadeira
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() + 1);;					
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//Lógica para marcar como verdadeiro as posicoes para baixo da peca
		
		p.setValues(position.getRow()  + 1, position.getColumn() - 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { //enquanto a posicao p existir e nao tiver uma peca lá, marcar como verdadeira
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn() - 1);					
		}
		
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		return mat;
	}
}
