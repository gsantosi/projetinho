package Pedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	public Date moment;
	public OrderStatus status;
	List<OrderProduto> array = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        		
	public Cliente cli;
	public OrderProduto prod;

	public Order(Date moment, Cliente cli, OrderProduto prod,OrderStatus status) {

		this.moment = moment;
		this.status = status;
		this.cli = cli;
		this.prod = prod;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public Cliente getCli() {
		return cli;
	}

	public OrderProduto getProd() {
		return prod;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public void setProd(OrderProduto prod) {
		this.prod = prod;
	}

	public void addItem(OrderProduto prod) {
		array.add(prod);
	}

	public void removeItem(OrderProduto prod) {
		array.remove(prod);
	}
	double soma = 0;
	

   public String toString() {
	   return "Dados iniciais: " +"\n"+ "Nome: "+ cli.getNome() +"\nEmail: "+ cli.getEmail() +"\nData de nascimento: "+ sdf.format(cli.getdata())+
                "\nMomento: "+ sdf.format(getMoment()) + "\nStatus: " + getStatus() + "\nTOTAL: "+ prod.Total();
   }

}
