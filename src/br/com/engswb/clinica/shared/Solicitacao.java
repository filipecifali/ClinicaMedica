package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Solicitacao implements IsSerializable {
	private int idSolicitacao;
	private double quantidade;
	private String status;
	private Date dataSolicitacao;
	private Date dataRetorno;
	private int idProduto;
	
	public Solicitacao() {
	}

	public Solicitacao(int idSolicitacao, double quantidade, String status,
			Date dataSolicitacao, Date dataRetorno, int idProduto) {
		this.idSolicitacao = idSolicitacao;
		this.quantidade = quantidade;
		this.status = status;
		this.dataSolicitacao = dataSolicitacao;
		this.dataRetorno = dataRetorno;
		this.idProduto = idProduto;
	}

	public int getIdSolicitacao() {
		return idSolicitacao;
	}

	public void setIdSolicitacao(int idSolicitacao) {
		this.idSolicitacao = idSolicitacao;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
}
