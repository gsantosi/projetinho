package BancoHeranca;

public class ContaSimples {
	// List<ContaSimples> array = new ArrayList<>();
	protected int numero;
	protected String titular;
	protected double saldo;

	public ContaSimples() {
	}

	public ContaSimples(int numero, String titular, double saldo) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double deposito(double valor) {
		saldo += valor;

		return saldo;
	}

	public void saque(double valor) {
		saldo -= valor + 5.0;

	}
	
}
