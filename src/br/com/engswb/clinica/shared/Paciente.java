package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Paciente implements IsSerializable {
	private int id;
	private String nome;
	private int idade;
	private String contato;
	private String genero;
	
	public Paciente(int id, String nome, int idade, String contato,
			String genero) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.contato = contato;
		this.genero = genero;
	}
	
	public Paciente() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
}
