package boardgame;

public abstract class Piece {

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

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}