package Trabalhador;

import java.util.Date;

public class HoraC {

	public Date data;
	public double valorh;
	public int hr;
	
	public HoraC (Date data, double valorh, int hr) {
		
		this.data = data;
		this.valorh = valorh;
		this.hr = hr;
			
	}
	
	
	public Date getData() {
		return data;
	}
	
	public double getValorh() {
		return valorh;
	}
	
	public int getHr() {
		return hr;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public void setValorh (double valorh) {
	    this.valorh = valorh;		
	}
	
	public void setHr(int hr) {
		this.hr = hr;		
	}
	
	public double totalValue() {
		return valorh * hr;		
	}

}
