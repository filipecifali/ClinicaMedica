/**
 * 
 */
package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author Eduardo Pinheiro
 * Classe de serialização - deve conter os mesmos campos que as tabelas
 *
 */
public class Fornecedor implements IsSerializable {
	
	private int idFornecedor;
	private String cnpj;
	private String nome;
	private String endereco;
	private String bairro;
	private String uf;
	private String pais;
	
	private Fornecedor(){
		
	}
	
	public Fornecedor (int idFornecedor, String cnpj, String nome, String endereco, 
			String bairro, String uf, String pais){
		
		this.setIdFornecedor(idFornecedor);
		this.setCnpj(cnpj);
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setBairro(bairro);
		this.setUf(uf);
		this.setPais(pais);				
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
