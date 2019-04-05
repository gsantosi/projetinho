package ProdutoPolimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;
   

public class ProdutoUsado extends Produto {

	public Date data;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MMyyyy");
	
	public ProdutoUsado(String nome, double preco, Date data) {
		super (nome,preco);
		
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	@Override
	public double EtiquetaPreco() {
		return preco;
	}
	
	public String toString() {
		return "Nome: "+ nome+" (Used)"+", $"+preco+", Data: "+ sdf.format(data);
	}
	 
}
