package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class BancoClass {
public static void main (String [] args) {
	   
	   Locale.setDefault(Locale.US);
	   Scanner e = new Scanner(System.in);
	   List<Banco> array = new ArrayList<>();
	   Banco b = null;
	   
	   System.out.println("Digite quantos contratos deseja cadastrar:");
	   int n = e.nextInt();
	   
	   for (int i=0; i<n; i++) {
	   System.out.println("Digite seu nome: ");
	   String nome = e.next();
	   
	   
	   System.out.println("Digite sua conta: ");
	   int conta = e.nextInt();
	  
	   System.out.println("Digite o seu saldo");
	   double saldo = e.nextDouble();
	   
	    b = new Banco(nome, conta, saldo);
	    array.add(b);
	    
	 
	   System.out.println("Digite um valor para saque:");
	   double sa = e.nextDouble();
	   b.saque(sa);
	   
	   }
	   for (Banco x: array) {
		   System.out.println("____________________"); 
		   System.out.println(x);
	   }
	   
	   
	   e.close(); 
 }
}
