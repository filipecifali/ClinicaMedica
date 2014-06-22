package br.com.engswb.clinica.client.atendimentosg1;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class CadastroFuncionario implements EntryPoint {

	public CadastroFuncionario() {
		// TODO Auto-generated constructor stub
	}
	
	RootPanel rootPanel = RootPanel.get();
	
	
	

	@Override
	public void onModuleLoad() {
		
		Label lblCadastroDeFuncionrio = new Label("Cadastro de Funcion\u00E1rio.");
		rootPanel.add(lblCadastroDeFuncionrio, 10, 10);
		
		Label lblNome = new Label("Nome:");
		rootPanel.add(lblNome, 10, 34);
		
		Label lblCargo = new Label("Cargo:");
		rootPanel.add(lblCargo, 10, 58);
		
		Label lblContato = new Label("Contato:");
		rootPanel.add(lblContato, 10, 82);
		
		Label lblNIS = new Label("NIS:");
		rootPanel.add(lblNIS, 10, 106);
		
		Label lblCTPS = new Label("CTPS:");
		rootPanel.add(lblCTPS, 10, 130);
		
		Label lblSalario = new Label("Sal\u00E1rio:");
		rootPanel.add(lblSalario, 10, 154);
		
		Label lblEspecialidade = new Label("Especialidade:");
		rootPanel.add(lblEspecialidade, 10, 178);
		
		Label lblCrm = new Label("CRM:");
		rootPanel.add(lblCrm, 10, 205);
		
		Label lblSenha = new Label("Senha:");
		rootPanel.add(lblSenha, 10, 230);
		
		TextBox txtNome = new TextBox();
		rootPanel.add(txtNome, 103, 34);
		txtNome.setSize("274px", "9px");
		
		TextBox txtCargo = new TextBox();
		rootPanel.add(txtCargo, 103, 58);
		txtCargo.setSize("274px", "9px");
		
		TextBox txtContato = new TextBox();
		rootPanel.add(txtContato, 103, 82);
		txtContato.setSize("274px", "9px");
		
		TextBox txtNis = new TextBox();
		rootPanel.add(txtNis, 103, 106);
		txtNis.setSize("274px", "9px");
		
		TextBox txtCTPS = new TextBox();
		rootPanel.add(txtCTPS, 103, 130);
		txtCTPS.setSize("274px", "9px");
		
		TextBox txtSalario = new TextBox();
		rootPanel.add(txtSalario, 103, 154);
		txtSalario.setSize("274px", "9px");
		
		TextBox txtEspecialidade = new TextBox();
		rootPanel.add(txtEspecialidade, 103, 178);
		txtEspecialidade.setSize("274px", "9px");
		
		TextBox txtCRM = new TextBox();
		rootPanel.add(txtCRM, 103, 205);
		txtCRM.setSize("274px", "9px");
		
		TextBox txtSenha = new TextBox();
		rootPanel.add(txtSenha, 103, 230);
		txtSenha.setSize("274px", "9px");
		
		Button btnSubmeter = new Button("Submeter");
		rootPanel.add(btnSubmeter, 103, 257);
		btnSubmeter.setSize("80px", "28px");
		
		Button btnLimpar = new Button("Limpar");
		rootPanel.add(btnLimpar, 203, 257);
		btnLimpar.setSize("80px", "28px");
		// TODO Auto-generated method stub

	}
}
