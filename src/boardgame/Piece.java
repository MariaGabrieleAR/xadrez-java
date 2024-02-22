package boardgame;
//posicao não visivel

public class Piece {
	
	protected Position position; // nome do atributo 
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; //posicao recem criada
		
	}

	protected Board getBoard() { // tabuleiro não acessivel
		return board;
	}
}
