package Pedido;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoClass {
  public static void main (String [] args) throws ParseException {
	  
	  Locale.setDefault(Locale.US);
	  Scanner e = new Scanner(System.in);
	  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	  SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	  List<OrderProduto> teste = new ArrayList<>();
	  
	  Cliente cli = null;
	  Produto p =null;
	  OrderProduto or = null;
	  Order o = null;
	  
	  System.out.println("Entre com os dados:");
	  
	  System.out.println("Digite seu nome:");
	  String nome = e.next();
	  
	  System.out.println("Digite seu e-mail:");
	  String email = e.next();
	  
	  System.out.println("Digite a data de nascimento: ");
	  Date data = sdf.parse(e.next());
	  
	  System.out.println("Digite o status: (pendente,processando,enviado)");
	  String status = e.next();
	  
	  cli = new Cliente(nome,email,data);
	  
	  Date dataa = sdf1.parse("20/08/1998 10:10:10");
	  
	  System.out.println("Quandos pedidos vão ser feitos?");
	  int n = e.nextInt();
	  
	  for (int i=0; i<n;i++) {
		  System.out.println("Dados do produto:");

		  System.out.println("Nome do produto:");
		  String nomep = e.next();
		  
		  System.out.println("Preço do produto:");
		  double preco = e.nextDouble();
		  
		  System.out.println("Qual a quantidade?");
		  int quantidade = e.nextInt();
		  
		  
		  //System.out.println(sdf.format(dataa));
		  
		  p = new Produto(nomep, preco);
		  or = new OrderProduto(quantidade,preco,p);
		  o = new Order (dataa,cli,or,OrderStatus.valueOf(status));
		  teste.add(or);
 
	  }
  
       
	 
      for (OrderProduto ord: teste) {
        	System.out.println();  
		  System.out.println(ord);
          }
      System.out.println(o.toString()); 
  }
}
