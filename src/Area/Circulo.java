package Area;

public class Circulo extends Shape {

	public double raio;
	private double area;
	
	public Circulo(Cor color, double raio) {
		super(color);
		
		this.raio = raio;
	}
	public double getArea() {
		return area;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	

	
	@Override
	public double Calculo() {
	
	   return Math.PI * Math.pow(getRaio(),2);
	}
	public String toString() {
		return "$"+ String.format("%.2f",Calculo());
	}
	

}
