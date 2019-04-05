package Area;

public class Circulo2 extends Shape {

	public double raio;
	private double area;
	
	public Circulo2(Cor color, double raio) {
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
	
		double area = Math.PI * Math.pow(getRaio(),2);
		return area;
		
	}
	
	public String toString() {
		return "$"+ String.format("%.2f",Calculo());
	}
	

}
