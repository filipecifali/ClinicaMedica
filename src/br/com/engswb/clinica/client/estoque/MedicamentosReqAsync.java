package br.com.engswb.clinica.client.estoque;

import br.com.engswb.clinica.shared.estoque.MedicamentosED;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MedicamentosReqAsync {

	void consultaMedicamentos(AsyncCallback<MedicamentosED> callback);

	void insereMedicamentos(String nome, String localizacao, String dataVencimento, String qtdEstoque, String qtdMinima, String tipo, String idFornecedor, String idProduto, AsyncCallback<String> asyncCallback);
	
	

}
