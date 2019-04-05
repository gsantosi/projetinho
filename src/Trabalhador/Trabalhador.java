package Trabalhador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

	public String nome;
	public Cargo nivel;
	public double salario;

	Departamento dep;
	List<HoraC> array = new ArrayList<>();
	//public Trabalhador () {}

	public Trabalhador(String nome, Cargo nivel, double salario, Departamento dep) {

		this.nome = nome;
		this.nivel = nivel;
		this.salario = salario;
		this.dep = dep;

	}

	public String getNome() {
		return nome;
	}

	public Cargo getNivel() {
		return nivel;
	}

	public double getSalario() {
		return salario;
	}

	public Departamento getDep() {
		return dep;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNivel(Cargo nivel) {
		this.nivel = nivel;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}

	public void addContrato(HoraC Contrato) {
		array.add(Contrato);
	}

	public void removeContrato(HoraC Contrato) {
		array.remove(Contrato);
	}

	public double incode(int mes, int ano) {
		Calendar cale = Calendar.getInstance();

		int soma = 0;

		for (HoraC x : array) {

			int mes1 = cale.get(Calendar.MONTH);
			int ano1 = cale.get(Calendar.YEAR);

			if (mes == mes1 && ano == ano1) {
                
				soma  += x.totalValue();
				
			}

		}
          return soma;
	}
}
