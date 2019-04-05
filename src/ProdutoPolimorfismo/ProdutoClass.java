package ProdutoPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoClass {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner e = new Scanner(System.in);
		List<Produto> array = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Quantos produtos deseja cadastrar?");
		int n = e.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto " + i + "º:");

			System.out.println("Qual o tipo de produto? (n/i/u)");
			char w = e.next().charAt(0);

			System.out.println("Digite o nome");
			String nome = e.next();

			System.out.println("Qual é o preço do produto:");
			double preco = e.nextDouble();

			if (w == 'n') {
				Produto p = new Produto(nome, preco);
				array.add(p);
			}
			if (w == 'i') {
				System.out.println("Digite o preço do frete:");
				double frete = e.nextDouble();
				Produto pf = new ProdutoImportado(nome, preco, frete);
				array.add(pf);
			}
			if (w == 'u') {
				System.out.println("Digite a data para entrega:");
				Date data = sdf.parse(e.next());
				Produto pu = new ProdutoUsado(nome, preco, data);
				array.add(pu);
			}

		}
		System.out.println("DADOS DO PRODUTO:__________");
		for (Produto prod : array) {
			System.out.println();
			System.out.println(prod);

		}

		e.close();
	}
}
