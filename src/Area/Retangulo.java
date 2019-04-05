package Area;

public class Retangulo extends Shape {

	public double altura;
	public double largura;
	
	public Retangulo(Cor color, double altura, double largura) {
		super(color);
		
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getLargura() {
		return largura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setLargura(double largura){
		this.largura = largura;
	}
	
	double soma = 0.0;
	
	@Override
	public double Calculo() {
		
		soma = largura*altura;
		
		return soma;
	}
	public String toString() {
		return "$ "+ Calculo();
	}

}
