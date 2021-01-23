package boardgame;

public class Piece {

	private Board board;
	protected Position position;

	public Piece(Board board) {
		this.board = board;
		position = null; // nao precisa obrigatoriamente desta declaracao pois por padrao o Java ja
							// inicia com valor nulo, apenas enfatizando com a declaracao por efeito
							// didatico
	}

	protected Board getBoard() {
		return board;
	}

}
