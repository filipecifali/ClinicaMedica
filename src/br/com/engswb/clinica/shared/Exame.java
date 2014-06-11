package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Exame implements IsSerializable {
	private int id;
	private int idProntuario;
	private int idFuncionario;
	private Date duracao;
	private String descricao;
	
	public Exame() {
	}

	public Exame(int id, int idProntuario, int idFuncionario, Date duracao,
			String descricao) {
		this.id = id;
		this.idProntuario = idProntuario;
		this.idFuncionario = idFuncionario;
		this.duracao = duracao;
		this.descricao = descricao;
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

	public Date getDuracao() {
		return duracao;
	}

	public void setDuracao(Date duracao) {
		this.duracao = duracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
