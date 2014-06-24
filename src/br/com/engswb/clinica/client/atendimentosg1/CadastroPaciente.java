package br.com.engswb.clinica.client.atendimentosg1;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;

public class CadastroPaciente implements EntryPoint {
	private TextBox txtNome;
	private TextBox txtContato;
	private TextBox txtIdade;
	private TextBox txtGenero;
	
	public TextBox getTxtNome() {
		return txtNome;
	}
	public void setTxtNome(TextBox txtNome) {
		this.txtNome = txtNome;
	}
	public TextBox getTxtContato() {
		return txtContato;
	}
	public void setTxtContato(TextBox txtContato) {
		this.txtContato = txtContato;
	}
	public TextBox getTxtIdade() {
		return txtIdade;
	}
	public void setTxtIdade(TextBox txtIdade) {
		this.txtIdade = txtIdade;
	}
	public TextBox getTxtGenero() {
		return txtGenero;
	}
	public void setTxtGenero(TextBox txtGenero) {
		this.txtGenero = txtGenero;
	}
	public RootPanel getRootPanel() {
		return rootPanel;
	}
	public void setRootPanel(RootPanel rootPanel) {
		this.rootPanel = rootPanel;
	}
	public CadastroPaciente() {
		// TODO Auto-generated constructor stub
	}
	RootPanel rootPanel = RootPanel.get();

	
	
	@Override
	public void onModuleLoad() {
		
		Label label = new Label("Cadastro de Funcion\u00E1rio.");
		rootPanel.add(label, 10, 10);
		label.setSize("145px", "18px");
		
		Label lblNome = new Label("Nome:");
		rootPanel.add(lblNome, 10, 34);
		lblNome.setSize("38px", "18px");
		
		TextBox txtNome = new TextBox();
		rootPanel.add(txtNome, 103, 34);
		txtNome.setSize("274px", "9px");
		
		Label lblContato = new Label("Contato:");
		rootPanel.add(lblContato, 10, 82);
		lblContato.setSize("49px", "18px");
		
		TextBox txtContato = new TextBox();
		rootPanel.add(txtContato, 103, 82);
		txtContato.setSize("274px", "9px");
		
		Button btnSubmeter = new Button("Submeter");
		rootPanel.add(btnSubmeter, 103, 153);
		btnSubmeter.setSize("80px", "28px");
		
		Button btnLimpar = new Button("Limpar");
		rootPanel.add(btnLimpar, 203, 153);
		btnLimpar.setSize("80px", "28px");
		
		Label lblIdade = new Label("Idade:");
		rootPanel.add(lblIdade, 10, 60);
		lblIdade.setSize("38px", "18px");
		
		TextBox txtIdade = new TextBox();
		rootPanel.add(txtIdade, 103, 60);
		txtIdade.setSize("274px", "9px");
		
		TextBox txtGenero = new TextBox();
		rootPanel.add(txtGenero, 103, 108);
		txtGenero.setSize("274px", "9px");
		
		Label lblGenero = new Label("Genero:");
		rootPanel.add(lblGenero, 10, 108);
		lblGenero.setSize("49px", "18px");
		// TODO Auto-generated method stub

	}

}
