package br.com.engswb.clinica.client.estoque;

import br.com.engswb.clinica.shared.estoque.MedicamentosED;

import com.google.gwt.user.client.rpc.RemoteService;

public interface MedicamentosReq extends RemoteService {
	public MedicamentosED consultaMedicamentos();

	public String insereMedicamentos(String nome, String localizacao, String dataVencimento, String qtdEstoque, String qtdMinima, String tipo, String idFornecedor, String idProduto);
}
