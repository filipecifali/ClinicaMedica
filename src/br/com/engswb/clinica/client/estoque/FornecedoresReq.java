package br.com.engswb.clinica.client.estoque;

import java.util.List;

import br.com.engswb.clinica.shared.estoque.FornecedoresED;

import com.google.gwt.user.client.rpc.RemoteService;

public interface FornecedoresReq extends RemoteService {
	public List<FornecedoresED> consultaFornecedores();
}
