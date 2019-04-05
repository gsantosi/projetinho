package ProdutoPolimorfismo;

public class ProdutoImportado extends Produto{

	public double frete;
	
	public ProdutoImportado(String nome, double preco,double frete) {
		super(nome,preco);
		
		this.frete = frete;
	}
	
	public double getFrete() {
		return frete;
	}
	
	public void setFrete(double frete) {
		this.frete = frete;
	}
	
	@Override
	public double EtiquetaPreco(){
		return preco = preco + frete;
	}
	public String toString() {
		return "Nome: " +nome+ ", $"+ EtiquetaPreco() +", Custo do Frete: "+ frete;
	}
}
