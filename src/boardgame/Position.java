package boardgame;

//encapsulamento dos campos e construtores e superclasse e o conceito de sobreposição com toString 

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	@Override 
	public String toString() { //para imprimir a posição na tela
		return row + ", " + column;
	}
}
