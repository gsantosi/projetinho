package Pedido;

import java.util.Date;

public class Cliente {

	public String nome;
	public String email;
	public Date data;

	public Cliente(String nome, String email, Date data) {

		this.nome = nome;
		this.email = email;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Date getdata() {
		return data;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setData(Date data) {
		this.data = data;

	}

}
