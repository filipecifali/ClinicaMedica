package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Lancamentos implements IsSerializable {
	private int id;
	private int idPaciente;
	private int idFormaPagamento;
	private double valor;
	private Date dataLancamento;
	private Date dataPagamento;
	private Date tipoLancamento;
	
	public Lancamentos() {
		
	}
	
	public Lancamentos(int id, int idPaciente, int idFormaPagamento,
			double valor, Date dataLancamento, Date dataPagamento,
			Date tipoLancamento) {
		this.id = id;
		this.idPaciente = idPaciente;
		this.idFormaPagamento = idFormaPagamento;
		this.valor = valor;
		this.dataLancamento = dataLancamento;
		this.dataPagamento = dataPagamento;
		this.tipoLancamento = tipoLancamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdFormaPagamento() {
		return idFormaPagamento;
	}

	public void setIdFormaPagamento(int idFormaPagamento) {
		this.idFormaPagamento = idFormaPagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Date getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(Date tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}
	
}
