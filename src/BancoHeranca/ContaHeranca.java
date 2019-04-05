package BancoHeranca;



public class ContaHeranca extends ContaSimples{

	public double limite;
    
	
	public ContaHeranca(int numero, String titular, double saldo,double limite) {
		super(numero,titular,saldo);
		
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void limite() {
		if(saldo>=limite) {
			saldo-=limite;
		}else {
			System.out.println("O seu saldo não é suficiente!");
		}
	
	}
	
	public String toString() {
		return "Dados do cliente:"+ "\n" + "Nome: "+ titular +"\nNumero da conta: "+ numero +"\nSaldo:"+ 
	            saldo;
	}
	
	
	
	
}
