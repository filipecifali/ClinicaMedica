package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class OpcaoPagamento implements IsSerializable {
	private int id;
	private String nome;
	private String descricao;
	private int permiteParcelamento;
	
	public OpcaoPagamento() {
	}

	public OpcaoPagamento(int id, String nome, String descricao,
			int permiteParcelamento) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.permiteParcelamento = permiteParcelamento;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPermiteParcelamento() {
		return permiteParcelamento;
	}

	public void setPermiteParcelamento(int permiteParcelamento) {
		this.permiteParcelamento = permiteParcelamento;
	}
	
}
