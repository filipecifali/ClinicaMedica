package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;

public class AgendaConsulta implements EntryPoint {

	@Override
	public void onModuleLoad() {
    	
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel, "Nova Consulta", false);
		absolutePanel.setWidth("490px");
		
		InlineHTML nlnhtmlinformaesDoPaciente = new InlineHTML("<h1>Informa\u00E7\u00F5es do Paciente</h1>");
		absolutePanel.add(nlnhtmlinformaesDoPaciente);
		
		InlineHTML inlineHTML = new InlineHTML("<hr>");
		absolutePanel.add(inlineHTML);
		
		Label lblNewLabel = new Label("Pesquisar paciente por nome");
		absolutePanel.add(lblNewLabel, 20, 68);
		lblNewLabel.setSize("130px", "34px");
		
		TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 178, 68);
		
		Button btnPesquisar = new Button("Pesquisar");
		absolutePanel.add(btnPesquisar, 388, 72);
		
		InlineHTML nlnhtmlNome = new InlineHTML("Nome");
		absolutePanel.add(nlnhtmlNome, 20, 143);
		
		InlineHTML nlnhtmlNewInlinehtml = new InlineHTML("");
		absolutePanel.add(nlnhtmlNewInlinehtml, 178, 143);
		
		InlineHTML nlnhtmlNewInlinehtml_1 = new InlineHTML("Idade");
		absolutePanel.add(nlnhtmlNewInlinehtml_1, 20, 183);
		
		InlineHTML inlineHTML_1 = new InlineHTML("");
		absolutePanel.add(inlineHTML_1, 178, 183);
		
		InlineHTML nlnhtmlNewInlinehtml_2 = new InlineHTML("Contato");
		absolutePanel.add(nlnhtmlNewInlinehtml_2, 20, 224);
		
		InlineHTML inlineHTML_2 = new InlineHTML("");
		absolutePanel.add(inlineHTML_2, 178, 224);
		
		InlineHTML nlnhtmlSexo = new InlineHTML("Sexo");
		absolutePanel.add(nlnhtmlSexo, 20, 266);
		
		InlineHTML inlineHTML_3 = new InlineHTML("");
		absolutePanel.add(inlineHTML_3, 178, 266);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_1, "Visualizar Agendamento", false);
		
		AbsolutePanel absolutePanel_2 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_2, "Consulta de Pre\u00E7os", false);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_3, "Hist\u00F3rico", false);
		rootPanel.add(tabLayoutPanel, 10, 10);
		tabLayoutPanel.setSize("633px", "375px");
		
	}
}
