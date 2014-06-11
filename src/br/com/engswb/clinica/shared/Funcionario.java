package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Funcionario implements IsSerializable {
	private int id;
	private int senha;
	private String nome;
	private String cargo;
	private String contato;
	private int nis;
	private int ctps;
	private double salario;
	
	public Funcionario() {
	}

	public Funcionario(int id, int senha, String nome, String cargo,
			String contato, int nis, int ctps, double salario) {
		this.id = id;
		this.senha = senha;
		this.nome = nome;
		this.cargo = cargo;
		this.contato = contato;
		this.nis = nis;
		this.ctps = ctps;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public int getNis() {
		return nis;
	}

	public void setNis(int nis) {
		this.nis = nis;
	}

	public int getCtps() {
		return ctps;
	}

	public void setCtps(int ctps) {
		this.ctps = ctps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
