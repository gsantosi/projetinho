package BancoHeranca;

import java.util.Scanner;

public class BancoClass {
   public static void main (String [] args) {
	   
	   Scanner e = new Scanner(System.in);
	 
	   ContaSimples c = new ContaSimples(1111,"guigui",100);
	   c.saque(20);
	   System.out.println(c.getSaldo());
   
      ContaSimples c1 = new ContaHeranca(1112,"Fernanda",1000.00,0.1);
      
           c1.saque(200.00);
           System.out.println(c1.getSaldo());
   
   
   }
}