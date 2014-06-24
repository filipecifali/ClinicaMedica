package br.com.engswb.clinica.shared.estoque;


import java.sql.Date;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * A class for the user database table
 */
public class FornecedoresED implements IsSerializable {
    private int idFornecedor = 0;
    private String nome = "";
    private String cnpj = "";
    private String endereco = "";
    private String bairro = "";
    private String pais = "";
    private String uf = "";
    
    private FornecedoresED() {
        //just here because GWT wants it.
    }
    
    /**
     * A user of the system
     * @param id
     * @param username
     * @param password
     */

	public FornecedoresED(int idFornecedor, String nome, String cnpj,
			String endereco, String bairro, String pais, String uf) {
		super();
		this.idFornecedor = idFornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.bairro = bairro;
		this.pais = pais;
		this.uf = uf;
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
    
    
}
