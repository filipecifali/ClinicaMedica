package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;

public class AgendaConsulta implements EntryPoint {

	@Override
	public void onModuleLoad() {
    	
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel, "Agendar Consulta", false);
		absolutePanel.setWidth("625px");
		
		InlineHTML nlnhtmlinformaesDoPaciente = new InlineHTML("<h1>Informa\u00E7\u00F5es do Paciente</h1>");
		absolutePanel.add(nlnhtmlinformaesDoPaciente);
		
		InlineHTML inlineHTML = new InlineHTML("<hr>");
		absolutePanel.add(inlineHTML);
		
		Label lblNewLabel = new Label("Cadastro de consulta");
		absolutePanel.add(lblNewLabel, 20, 68);
		lblNewLabel.setSize("130px", "34px");
		
		TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 120, 130);
		
		Button btnCadastrarConsulta = new Button("CadastrarConsulta");
		absolutePanel.add(btnCadastrarConsulta, 348, 130);
		btnCadastrarConsulta.setSize("169px", "34px");
		
		InlineHTML nlnhtmlNome = new InlineHTML("Nome");
		absolutePanel.add(nlnhtmlNome, 20, 143);
		
		InlineHTML nlnhtmlNewInlinehtml_1 = new InlineHTML("Idade");
		absolutePanel.add(nlnhtmlNewInlinehtml_1, 20, 183);
		
		InlineHTML nlnhtmlNewInlinehtml_2 = new InlineHTML("Contato");
		absolutePanel.add(nlnhtmlNewInlinehtml_2, 20, 224);
		
		InlineHTML nlnhtmlSexo = new InlineHTML("Sexo");
		absolutePanel.add(nlnhtmlSexo, 20, 266);
		
		TextBox textBox_1 = new TextBox();
		absolutePanel.add(textBox_1, 120, 170);
		
		TextBox textBox_2 = new TextBox();
		absolutePanel.add(textBox_2, 120, 210);
		
		TextBox textBox_3 = new TextBox();
		absolutePanel.add(textBox_3, 120, 250);
		
		DateBox dateBox = new DateBox();
		absolutePanel.add(dateBox, 120, 290);
		dateBox.setSize("159px", "16px");
		
		Button btnNewButton = new Button("Limpar dados");
		absolutePanel.add(btnNewButton, 423, 170);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_1, "Visualizar Agendamento", false);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_3, "Hist\u00F3rico", false);
		rootPanel.add(tabLayoutPanel, 10, 10);
		tabLayoutPanel.setSize("640px", "480px");
		
	}
}
