package br.com.engswb.clinica.client.estoque;

import br.com.engswb.clinica.shared.estoque.MedicamentosED;
import com.google.gwt.user.client.rpc.RemoteService;

public interface MedicamentosReq extends RemoteService {
	public MedicamentosED consultaMedicamentos();
}
