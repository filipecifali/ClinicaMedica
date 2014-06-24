package br.com.engswb.clinica.client.atendimentosg1;
import org.omg.CORBA.PRIVATE_MEMBER;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dev.asm.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public class Prontuario implements EntryPoint {
	private TextBox txtCPF;
	
	private TextBox getTxtCPF() {
		return txtCPF;
	}
	private void setTxtCPF(TextBox txtCPF) {
		this.txtCPF = txtCPF;
	}
	
	

	@Override
	public void onModuleLoad() {

		Label lblNome = new Label("CPF");
		AbsolutePanel rootPanel;
		rootPanel.add(lblNome, 47, 45);
		
		TextBox txtCPF = new TextBox();
		rootPanel.add(txtCPF, 87, 42);
		txtCPF.setSize("274px", "9px");
		
		Label lblProntuario = new Label("Prontu\u00E1rio");
		rootPanel.add(lblProntuario, 22, 10);
	
		Button btnBuscar = new Button("Buscar");
		btnBuscar.setText("Buscar");
		rootPanel.add(btnBuscar, 49, 94);
		btnBuscar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String CPF = getTxtCPF().getText();
			}
		}

		Button btnGeraProntuario = new Button("Gerar Prontuario");
		btnGeraProntuario.setText("Gerar Prontu\u00E1rio");
		rootPanel.add(btnGeraProntuario, 123, 94);
		btnGeraProntuario.setSize("159px", "30px");
		btnGeraProntuario.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
			}
			}
		
		Button btnLimpar = new Button("Limpar");
		btnLimpar.setText("");
		rootPanel.add(btnLimpar, 302, 94);
		btnLimpar.setSize("57px", "30px");
		btnLimpar.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String CPF =  btnLimpar.setTxtCPF("");
				// CAMPO PARA MOSTRAR RESULTADO .
				}
		}
	
}
}
