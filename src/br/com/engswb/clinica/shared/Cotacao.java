package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Cotacao implements IsSerializable {
	private int idCotacao;
	private int idProduto;
	private double valor;
	private double quantidade;
	private Date validade;
	public Cotacao() {
	}
	public Cotacao(int idCotacao, int idProduto, double valor,
			double quantidade, Date validade) {
		this.idCotacao = idCotacao;
		this.idProduto = idProduto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.validade = validade;
	}
	
	public int getIdCotacao() {
		return idCotacao;
	}
	
	public void setIdCotacao(int idCotacao) {
		this.idCotacao = idCotacao;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	public Date getValidade() {
		return validade;
	}
	
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
}
