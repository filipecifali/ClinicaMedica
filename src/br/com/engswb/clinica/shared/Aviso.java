package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Aviso implements IsSerializable {

	private int idProduto;
	private Date data;
	private String tipo;
	
	public Aviso() {
		
	}
	public Aviso(int idProduto, Date data, String tipo) {
		this.idProduto = idProduto;
		this.data = data;
		this.tipo = tipo;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
