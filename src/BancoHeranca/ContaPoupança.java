package BancoHeranca;

public class ContaPoupança extends ContaSimples{

	
	public double juros;
	
	public ContaPoupança() {}
	
	public ContaPoupança(int numero, String titular, double saldo, double juros) {
		super (numero,titular,saldo);
		
		this.juros = juros;
	}
	
	public Double getJuros() {
		return juros;
	}
	
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	@Override
	public void saque(double valor) {
		saldo += saldo;
	}
}
