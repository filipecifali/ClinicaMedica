package br.com.engswb.clinica.shared.estoque;


import java.sql.Date;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * A class for the user database table
 */
public class MedicamentosED implements IsSerializable {
    private int idProduto = 0;
    private String nome = "";
    private Date dataVencimento;
    private int quantidade = 0;
    private int tipo = 0;
    private String localizacao = ""; 
    private int idFornecedor = 0;
    
    private MedicamentosED() {
        //just here because GWT wants it.
    }
    
    /**
     * A user of the system
     * @param id
     * @param username
     * @param password
     */
    public MedicamentosED(int idProduto, String nome, Date dataVencimento, int quantidade, int tipo, String localizacao, int idFornecedor) {
        this.setIdProduto(idProduto);
        this.setNome(nome);
        this.setDataVencimento(dataVencimento);
        this.setQuantidade(quantidade);
        this.setTipo(tipo);
        this.setLocalizacao(localizacao);
        this.setIdFornecedor(idFornecedor);
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
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