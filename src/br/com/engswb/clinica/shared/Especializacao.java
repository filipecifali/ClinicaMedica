package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Especializacao implements IsSerializable {
	private int id;
	private int idFuncionario;
	private String nome;
	
	public Especializacao() {
	}

	public Especializacao(int id, int idFuncionario, String nome) {
		this.id = id;
		this.idFuncionario = idFuncionario;
		this.nome = nome;
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
	
}
