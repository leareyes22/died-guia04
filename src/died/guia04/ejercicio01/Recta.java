package died.guia04.ejercicio01;

public class Recta {
	public Punto getP1() {
		return P1;
	}

	public void setP1(Punto p1) {
		P1 = p1;
	}

	public Punto getP2() {
		return P2;
	}

	public void setP2(Punto p2) {
		P2 = p2;
	}

	Punto P1;
	Punto P2;
	
	public Recta(Punto P1,Punto P2) {
		// TODO Auto-generated constructor stub
		this.P1 = P1;
		this.P2 = P2;
	}
	
	public Recta() {
		this.P1.x = this.P1.y;
		this.P2.x = this.P2.y;
	}
	
	public float Pendiente() {
		float m;
		float deltax = P2.getX() - P1.getX();
		float deltay = P2.getY() - P1.getY();
		if(deltax!=0) {
			m = (deltay/deltax);
			return m;
		}
		else {
			return 0;
		}
	}
	
	public boolean paralelas(Recta otraRecta) {
		return(this.Pendiente()==otraRecta.Pendiente());
	}
	
	public boolean equals(Recta otraRecta) {
		Recta aux = new Recta(this.P2,otraRecta.P1);
		return(aux.paralelas(this)&&aux.paralelas(otraRecta));
	}

}
