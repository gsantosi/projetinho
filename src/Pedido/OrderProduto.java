package Pedido;

import java.util.ArrayList;
import java.util.List;

public class OrderProduto {
	
	List<OrderProduto> array = new ArrayList<>();

	public int quantidade;
	public double preco;

	public Produto prod;

	public OrderProduto(int quantidade, double preco, Produto prod) {

		this.quantidade = quantidade;
		this.preco = preco;
		this.prod = prod;
	}

	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	double soma;

	public double SubTotal() {

		this.soma = quantidade * preco;
		return soma;
	}

	public double Total() {
		for (OrderProduto p : array ) {
            
			
			soma += preco;
		}
	return soma;
	}

	public String toString() {
		return "DADOS DO PRODUTO:" + "\n" + "Nome: " + prod.getNome() + "\nPreço: " + prod.getPreco() + "\nQuantidade: "
				+ quantidade + "\nSUBTOTAL: " + SubTotal();
	}
}
