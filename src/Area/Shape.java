package Area;

public abstract class Shape {

	public Cor color;

	public Shape(Cor color) {

		this.color = color;
	}

	public Cor getColor() {
		return color;
	}

	public void setColor(Cor color) {
		this.color = color;
	}
	
	double soma=0.0;
	public double Calculo() {
		
		return soma;
	}
	
}
