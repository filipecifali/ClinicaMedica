package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Prontuario implements IsSerializable {
	private int id;
	private int idPaciente;
	private String historico;
	private Date dataCriacao;
	private Date dataModificacao;
	private String tipoSanguineo;
	
	public Prontuario() {
	}
	
	public Prontuario(int id, int idPaciente, String historico,
			Date dataCriacao, Date dataModificacao, String tipoSanguineo) {
		this.id = id;
		this.idPaciente = idPaciente;
		this.historico = historico;
		this.dataCriacao = dataCriacao;
		this.dataModificacao = dataModificacao;
		this.tipoSanguineo = tipoSanguineo;
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

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
}
