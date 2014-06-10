package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class AgendaConsulta implements EntryPoint {
	private AbsolutePanel absolutePanel;
	private TextBox textBox;
	private TextBox textBox_1;
	private ListBox comboBox;
	private TextBox txtIdade;

	@Override
	public void onModuleLoad() {
    	
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		
		absolutePanel = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel, "Agendar Consulta", false);
		absolutePanel.setWidth("625px");
		
		InlineHTML nlnhtmlinformaesDoPaciente = new InlineHTML("<h1>Informa\u00E7\u00F5es do Paciente</h1>");
		absolutePanel.add(nlnhtmlinformaesDoPaciente);
		
		InlineHTML inlineHTML = new InlineHTML("<hr>");
		absolutePanel.add(inlineHTML);
		
		Label lblNewLabel = new Label("Cadastro de consulta");
		absolutePanel.add(lblNewLabel, 20, 68);
		lblNewLabel.setSize("130px", "34px");
		
		textBox = new TextBox();
		absolutePanel.add(textBox, 120, 130);
		
		Button btnCadastrarConsulta = new SubmitButton("CadastrarConsulta");
		btnCadastrarConsulta.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String nome = getTxtNome().getText();
				String contato = txtContato().getText();
				String idade = getTxtIdade().getText();
				int genero = cmbSexo().getSelectedIndex();
				
			}
		});
		absolutePanel.add(btnCadastrarConsulta, 134, 330);
		btnCadastrarConsulta.setSize("169px", "34px");
		
		InlineHTML nlnhtmlNome = new InlineHTML("Nome");
		absolutePanel.add(nlnhtmlNome, 20, 143);
		
		InlineHTML nlnhtmlNewInlinehtml_1 = new InlineHTML("Idade");
		absolutePanel.add(nlnhtmlNewInlinehtml_1, 20, 183);
		
		InlineHTML nlnhtmlNewInlinehtml_2 = new InlineHTML("Contato");
		absolutePanel.add(nlnhtmlNewInlinehtml_2, 20, 224);
		
		InlineHTML nlnhtmlSexo = new InlineHTML("Sexo");
		absolutePanel.add(nlnhtmlSexo, 20, 266);
		
		txtIdade = new TextBox();
		absolutePanel.add(txtIdade, 120, 170);
		
		textBox_1 = new TextBox();
		absolutePanel.add(textBox_1, 120, 210);
		
		Button btnNewButton = new Button("Limpar dados");
		btnNewButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				getTxtNome().setText("");
				txtContato().setText("");
				getTxtIdade().setText("");
				cmbSexo().setSelectedIndex(0);
			}
		});
		absolutePanel.add(btnNewButton, 20, 334);
		
		comboBox = new ListBox();
		comboBox.addItem("Masculino");
		comboBox.addItem("Feminino");
		absolutePanel.add(comboBox, 124, 262);
		comboBox.setSize("169px", "22px");
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_1, "Visualizar Agendamento", false);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_3, "Hist\u00F3rico", false);
		rootPanel.add(tabLayoutPanel, 10, 10);
		tabLayoutPanel.setSize("640px", "480px");
		
	}
	public AbsolutePanel getAbsolutePanel() {
		return absolutePanel;
	}
	public TextBox getTxtNome() {
		return textBox;
	}
	public TextBox txtContato() {
		return textBox_1;
	}
	public ListBox cmbSexo() {
		return comboBox;
	}
	public TextBox getTxtIdade() {
		return txtIdade;
	}
}
