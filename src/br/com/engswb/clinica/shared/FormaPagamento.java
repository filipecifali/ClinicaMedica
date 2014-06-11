package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class FormaPagamento implements IsSerializable {
	private int id;
	private String descricao;
	private String ativo;
	
	public FormaPagamento() {
		
	}
	
	public FormaPagamento(int id, String descricao, String ativo) {
		this.id = id;
		this.descricao = descricao;
		this.ativo = ativo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
}
