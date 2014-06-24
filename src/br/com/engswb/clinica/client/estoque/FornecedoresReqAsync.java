package br.com.engswb.clinica.client.estoque;

import java.util.List;

import br.com.engswb.clinica.shared.estoque.FornecedoresED;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FornecedoresReqAsync {

	void consultaFornecedores(AsyncCallback<List<FornecedoresED>> callback);
	
	

}
