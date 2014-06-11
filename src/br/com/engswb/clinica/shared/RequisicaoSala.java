package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class RequisicaoSala implements IsSerializable {
	private int numeroSala;
	private Date dataHoraEntrada;
	private Date dataHoraSaida;
	private int idMedico;
	
	public RequisicaoSala() {
	}
	
	public RequisicaoSala(int numeroSala, Date dataHoraEntrada,
			Date dataHoraSaida, int idMedico) {
		this.numeroSala = numeroSala;
		this.dataHoraEntrada = dataHoraEntrada;
		this.dataHoraSaida = dataHoraSaida;
		this.idMedico = idMedico;
	}
	
	public int getNumeroSala() {
		return numeroSala;
	}
	
	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}
	
	public Date getDataHoraEntrada() {
		return dataHoraEntrada;
	}
	
	public void setDataHoraEntrada(Date dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}
	
	public Date getDataHoraSaida() {
		return dataHoraSaida;
	}
	
	public void setDataHoraSaida(Date dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}
	
	public int getIdMedico() {
		return idMedico;
	}
	
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
}