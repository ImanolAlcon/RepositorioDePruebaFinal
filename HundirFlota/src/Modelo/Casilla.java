package Modelo;



public class Casilla {

	private int x;
	private int y;
	private boolean esAgua;
	private Barco barco;
	
	public Casilla(int x, int y, boolean esAgua) {
		x = this.x;
		y = this.y;
		esAgua = this.esAgua;
	}

	public void setEsAgua(boolean esAgua) {
		this.esAgua = esAgua;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		// TODO - implement Casilla.getY
		return this.y;
	}
	
	public static boolean esAgua() {
		return true;
	}
	public void colocarBarco(Barco pBarco) {
		barco = pBarco;
	}

}