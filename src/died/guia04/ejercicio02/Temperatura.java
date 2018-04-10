package died.guia04.ejercicio02;

public class Temperatura {
	double grados;
	Escala escala;
	
	public double getGrados() {
		return grados;
	}
	public void setGrados(double grados) {
		this.grados = grados;
	}
	public Escala getEscala() {
		return escala;
	}
	public void setEscala(Escala escala) {
		this.escala = escala;
	}
	
	public Temperatura() {
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(double g, Escala e){
		this.grados = g;
		this.escala = e;
	}
	
	public String toString() {
		String temp=null;
		switch(this.escala) {
		case CELCIUS:
			temp = String.valueOf(this.grados)+" "+"°C";
			break;
		case FAHRENHEIT:
			temp = String.valueOf(this.grados)+" "+"°F";
			break;
		}
			return temp;
	}
	
	public double asCelcius() {
		double temp=0;
		switch(this.escala) {
		case CELCIUS:
			temp = this.grados;
			break;
		case FAHRENHEIT:
			temp = (this.grados-32)/1.8;
			break;
		}
		return temp;
	}
	
	public double asFahrenheit() {
		double temp=0;
		switch(this.escala) {
		case CELCIUS:
			temp = (this.grados*1.8)+32;
			break;
		case FAHRENHEIT:
			temp = this.grados;
			break;
		}
		return temp;
	}
	
	public void aumentar(Temperatura temperaturis) {
		Escala E1 = this.escala;
		Escala E2 = temperaturis.escala;
		
		switch(E1) {
		case CELCIUS:
			if(E2==Escala.CELCIUS) {
				this.grados+=temperaturis.grados;
			}
			if(E2==Escala.FAHRENHEIT) {
				double auxTemp = temperaturis.asCelcius();
				this.grados+=auxTemp;
			}
			break;
		case FAHRENHEIT:
			if(E2==Escala.FAHRENHEIT) {
				this.grados+=temperaturis.grados;
			}
			if(E2==Escala.CELCIUS) {
				double auxTemp = temperaturis.asFahrenheit();
				this.grados+=auxTemp;
			}
		}
		
	}
	
	public void disminuir(Temperatura temperaturis) {
		Escala E1 = this.escala;
		Escala E2 = temperaturis.escala;
		
		switch(E1) {
		case CELCIUS:
			if(E2==Escala.CELCIUS) {
				this.grados-=temperaturis.grados;
			}
			if(E2==Escala.FAHRENHEIT) {
				double auxTemp = temperaturis.asCelcius();
				this.grados-=auxTemp;
			}
			break;
		case FAHRENHEIT:
			if(E2==Escala.FAHRENHEIT) {
				this.grados-=temperaturis.grados;
			}
			if(E2==Escala.CELCIUS) {
				double auxTemp = temperaturis.asFahrenheit();
				this.grados-=auxTemp;
			}
		}
		
	}
	
}
