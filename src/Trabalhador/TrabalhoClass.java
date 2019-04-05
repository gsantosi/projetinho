package Trabalhador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class TrabalhoClass {
   public static void main (String [] args) throws ParseException {
	   
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
	   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	   HoraC hr = null;
	   Trabalhador trab = null;
	   
	   System.out.println("Entre com o numero do departamento:");
	   String departamento = e.next();
	   
	   System.out.println("Entre com os dados:");
	   System.out.println("____________________");
	   System.out.println("Nome:");
       String nome = e.next();
       
       System.out.println("Qual é sua experiência profissional? (junior,pleno,senior)");
       String nivel = e.next();
       
       System.out.println("Digite o salario:");
       double salario = e.nextDouble();
       
       trab = new Trabalhador(nome, Cargo.valueOf(nivel),salario, new Departamento (departamento));
       
       System.out.println("Quantos contratos deseja Cadastrar?");
       int n = e.nextInt();
       
       for(int i=0; i<n; i++) {
    	   System.out.println("Entre com o contrato" +(i+1)+":º");
    	   System.out.println("Digite a data:(dd/MM/yyyy)");
    	   Date data = sdf.parse(e.next());
    	   
    	   System.out.println("Digite o valor por hr:");
    	   double valor = e.nextDouble();
    	   
    	   System.out.println("Digite a duração do hr extra:");
    	   int hre = e.nextInt();
    	   
    	   hr = new HoraC (data, valor, hre);
        }
       
       System.out.println("Entre com mês e o ano que vai gerar o aumento:");
       String mea = e.next();
       
       int mes = 1+Integer.parseInt(mea.substring(0,1));
       int ano = Integer.parseInt(mea.substring(3));
       System.out.println("Nome:" + trab.getNome());
       System.out.println("Departamento:" + trab.getDep().getNome());
       System.out.println("Valor extra:" + trab.incode(mes , ano));
	  
   e.close();}
}
