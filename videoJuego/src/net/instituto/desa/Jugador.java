package net.instituto.desa;

public class Jugador {
	int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void movmientoDerecha() {
		this.x++;
	}
	
	public void movmientoIzquierda() {
		this.x--;
	}

	public void movmientoArriba() {
		this.y--;
	}

	public void movmientoAbajo() {
		this.y++;
	}

}
