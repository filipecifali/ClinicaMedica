
package br.com.engswb.clinica.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.Date;

public class Agenda implements IsSerializable {
	private int id;
	private int idProcedimento;
	private Date data;
	
	public Agenda() {
		
	}
	
	public Agenda(int id, int idProcedimento, Date data) {
		this.id = id;
		this.idProcedimento = idProcedimento;
		this.data = data;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdProcedimento() {
		return idProcedimento;
	}

	public void setIdProcedimento(int idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
