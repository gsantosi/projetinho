package FuncionarioPolimorfismo;

public class Funcionario {

	public String nome;
	public int hr;
	public double valorh;

	public Funcionario(String nome, int hr, double valorh) {

		this.nome = nome;
		this.hr = hr;
		this.valorh = valorh;
	}

	public String getNome() {
		return nome;
	}
	public int getHr() {
		return hr;
	}
	
	public double getValorh() {
		return valorh;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setHr(int hr) {
		this.hr = hr;
	}
	
	public void setValorh(double valorh){
		this.valorh = valorh;
	}
	
	public double Pagamento() {
		return hr*valorh;
	}
	}
