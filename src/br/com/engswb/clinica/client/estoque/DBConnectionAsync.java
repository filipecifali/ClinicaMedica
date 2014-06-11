package br.com.engswb.clinica.client.estoque;

import java.sql.SQLException;

import br.com.engswb.clinica.shared.Fornecedor;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DBConnectionAsync 
{
    //public void authenticateUser(String username, String password, AsyncCallback<Fornecedor> callback);
	public void retornaFornecedor(AsyncCallback<Fornecedor> callback) throws SQLException;
}