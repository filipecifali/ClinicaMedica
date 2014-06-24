package br.com.engswb.clinica.client.atendimentosg1;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dev.asm.Label;
import com.google.gwt.user.client.ui.*;

public class Prontuario implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		RootPanel rootPanel = RootPanel.get();
		
		Label lblPronturio = new Label("Prontu\u00E1rio");
		rootPanel.add(lblPronturio, 10, 10);
		
		Label lblCpf = new Label("CPF:");
		rootPanel.add(lblCpf, 13, 49);
		
		TextBox textBoxCPF = new TextBox();
		rootPanel.add(textBoxCPF, 68, 49);
		textBoxCPF.setSize("274px", "9px");
		
		Button btnSubmeter = new Button("Submeter");
		rootPanel.add(btnSubmeter, 68, 114);
		btnSubmeter.setSize("80px", "28px");
		
		Button btnLimpar = new Button("Limpar");
		rootPanel.add(btnLimpar, 168, 114);
		btnLimpar.setSize("80px", "28px");
	}
}

