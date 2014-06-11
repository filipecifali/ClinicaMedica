package br.com.engswb.clinica.client.estoque;

import java.sql.SQLException;

import br.com.engswb.clinica.shared.Fornecedor;

import com.google.gwt.user.client.rpc.RemoteService;

public interface DBConnection extends RemoteService 
{
    //public Fornecedor authenticateUser(String username, String password);
	public Fornecedor retornaFornecedor() throws SQLException;
}