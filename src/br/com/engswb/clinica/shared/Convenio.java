package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Convenio implements IsSerializable {
	private int id;
	private int idFuncionario;
	private String nome;
	private double cota;
	
	public Convenio() {
		
	}
	
	public Convenio(int id, int idFuncionario, String nome, double cota) {
		this.id = id;
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cota = cota;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCota() {
		return cota;
	}

	public void setCota(double cota) {
		this.cota = cota;
	}
	
}
