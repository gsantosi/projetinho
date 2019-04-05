package Area;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ShapeClass {
  public static void main (String [] args) {
	  
	  Locale.setDefault(Locale.US);
	  Scanner e = new Scanner(System.in);
	  List<Shape> array = new ArrayList<>();

	  System.out.println("Quantas formas seram impressas?");
	  int n = e.nextInt();
	  
	  for (int i=1; i<=n; i++) {
		
		    System.out.println("Digite a Forma " +i+ "º:");
		    
		    System.out.println("Qual vai ser a forma? (c/r)");
		    char c = e.next().charAt(0);
		    
		    if (c == 'c') {
		    	  System.out.println("Entre com a cor: (black,white,blue)");
		    	  String color = e.next();
		    	
		    	  System.out.println("Qual é o valor do raio?");
		    	  double raio = e.nextDouble();
		    	  
		    	 Shape s = new Circulo2(Cor.valueOf(color),raio);
		    	  array.add(s);
		    	 
		    }
		    if ( c == 'r') {
		    	 
		    	System.out.println("Entre com a cor: (black,white,blue)");
		    	  String color = e.next();
		    	  
		    	  System.out.println("Digite o valor da largura:");
		    	  double largura = e.nextDouble();
		    	  
		    	  System.out.println("Digite o valor da altura:");
		    	  double altura = e.nextDouble();
		    	  
		    	  Shape sh = new Retangulo(Cor.valueOf(color),largura,altura);
		    	  array.add(sh);
		    }
		
	  }
	  
	  for(Shape ss : array) {
	  
	  System.out.println(ss);

	  }
	  
	  e.close();
  }
}
