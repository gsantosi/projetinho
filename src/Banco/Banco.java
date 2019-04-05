package Banco;

public class Banco {

	public String nome;
	public int conta;
	public double saldo;
	
	
	
	public Banco( String nome, int conta, double saldo) {

		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
        
	}



	public String getNome() {
		return nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public void setConta(int conta) {
    	this.conta = conta;
    }

    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
 
    
	public void saque (double saque) {
		this.saldo = (saldo - saque);
	}
    
    public String toString() {
    	return"Dados cadastrais:\n " + "Nome: " + nome + " \nConta: " + conta + " \nTotal saldo: " 
    			+ saldo;
    }

}
