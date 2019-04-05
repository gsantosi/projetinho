package ProdutoPolimorfismo;

public class Produto {

	public String nome;
	public double preco;
	
	public Produto(String nome, double preco) {
		
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
	   return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double EtiquetaPreco() {
		return preco;
	}
	public String toString() {
		return "Nome: "+ nome +", $"+ preco;
	}
	
}
