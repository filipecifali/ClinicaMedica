package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Consulta implements IsSerializable {
	private int id;
	private int idPaciente;
	private int idProntuario;
	private int idProcedimento;
	public Consulta() {
		
	}
	public Consulta(int id, int idPaciente, int idProntuario, int idProcedimento) {
		this.id = id;
		this.idPaciente = idPaciente;
		this.idProntuario = idProntuario;
		this.idProcedimento = idProcedimento;
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
	public int getIdProntuario() {
		return idProntuario;
	}
	public void setIdProntuario(int idProntuario) {
		this.idProntuario = idProntuario;
	}
	public int getIdProcedimento() {
		return idProcedimento;
	}
	public void setIdProcedimento(int idProcedimento) {
		this.idProcedimento = idProcedimento;
	}
	
}
