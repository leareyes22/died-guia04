package died.guia04.ejercicio01;

public class Punto {
	public float getY() {
		return y;
	}
	
	public float getX() {
		return x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setX(float x) {
		this.x = x;
	}

	float x;
	float y;

	public Punto(float x,float y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Punto otroPunto) {
		return (this.x==otroPunto.getX()&&this.y==otroPunto.getY());
	}

}
