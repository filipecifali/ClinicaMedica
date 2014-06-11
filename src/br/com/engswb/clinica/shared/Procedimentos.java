package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Procedimentos implements IsSerializable {
	private int id;
	private int idProntuario;
	private int idFuncionario;
	private String procedimentos;
	private String materiais;
	private double valor;
	
	public Procedimentos() {
	}
	
	public Procedimentos(int id, int idProntuario, int idFuncionario,
			String procedimentos, String materiais, double valor) {
		this.id = id;
		this.idProntuario = idProntuario;
		this.idFuncionario = idFuncionario;
		this.procedimentos = procedimentos;
		this.materiais = materiais;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProntuario() {
		return idProntuario;
	}

	public void setIdProntuario(int idProntuario) {
		this.idProntuario = idProntuario;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(String procedimentos) {
		this.procedimentos = procedimentos;
	}

	public String getMateriais() {
		return materiais;
	}

	public void setMateriais(String materiais) {
		this.materiais = materiais;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
