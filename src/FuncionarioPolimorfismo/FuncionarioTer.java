package FuncionarioPolimorfismo;

public class FuncionarioTer extends Funcionario {

	public double extra;
	
	public FuncionarioTer(String nome, int hr, double valorh, double extra) {
		super(nome,hr,valorh);
	
	       this.extra = extra;
	}
	
	public double getExtra() {
		return extra;
	}
	
	public void setExtra(double extra) {
		this.extra = extra;
	}
	
	@Override
	public double Pagamento() {
		return super.Pagamento() + extra*1.1;
	}
	
	
	
	
}
