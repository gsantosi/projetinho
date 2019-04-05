package FuncionarioPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FuncionarioClass {
   public static void main(String [] args) {
	   
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
	   List<Funcionario> array = new ArrayList<>();
	   
	   System.out.println("Quantos funcionários seram cadastrados:");
	   int n = e.nextInt();
	   
	   for(int i=1; i<=n; i++) {
		   System.out.println("Funcionário " +i+ "º:");
		   
		   System.out.println("Esse funcionario é terceiro? ( s/n )");
		   char c = e.next().charAt(0);
		   
		   System.out.println("Nome:");
		   String nome = e.next();
		   
		   System.out.println("Horas trabalhadas:");
		   int hr = e.nextInt();
		   
		   System.out.println("Valor da hora:");
		   double valorh = e.nextDouble();
		   
	       if ( c == 's') {
	    	   
	    	   System.out.println("Valor da hora extra:");
			   double extra = e.nextDouble();
			   Funcionario f = new FuncionarioTer(nome,hr,valorh,extra);
			   array.add(f);
	       }else {
	    	   Funcionario fu = new Funcionario(nome,hr,valorh);
	    	   array.add(fu);
	       }
	   
	   }
	   
	   System.out.println("DADOS DO FUNCIONÁRIO:");
	   for(Funcionario fun: array )  {
		   
		   System.out.println();
		   System.out.println(fun.getNome()+" - $"+ fun.Pagamento());
	   }

	   e.close();
   }
}
