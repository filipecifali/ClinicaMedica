package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Produto implements IsSerializable {
	private int idProduto;
	private String nome;
	private Date dataVencimento;
	private double quantidade;
	private int tipo;
	private String localizacao;
	private int idFornecedor;
	
	public Produto() {
	}

	public Produto(int idProduto, String nome, Date dataVencimento,
			double quantidade, int tipo, String localizacao, int idFornecedor) {
		this.idProduto = idProduto;
		this.nome = nome;
		this.dataVencimento = dataVencimento;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.localizacao = localizacao;
		this.idFornecedor = idFornecedor;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}
	
}
