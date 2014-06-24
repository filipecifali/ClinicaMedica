package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.InlineHTML;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.DecoratedTabPanel;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.SimpleRadioButton;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.datepicker.client.DatePicker;

public class Medic implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		rootPanel.add(absolutePanel, 0, 0);
		absolutePanel.setSize("631px", "363px");
		
		InlineHTML nlnhtmlinformaesDoPaciente = new InlineHTML("<h1>Pesquisa de Medicamentos</h1>");
		absolutePanel.add(nlnhtmlinformaesDoPaciente);
		
		InlineHTML inlineHTML = new InlineHTML("<hr>");
		absolutePanel.add(inlineHTML);
		
		
		Label label = new Label("Nome:");
		absolutePanel.add(label, 10, 85);
		label.setSize("47px", "18px");
		
		TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 56, 85);
		textBox.setSize("84px", "6px");
		
		Label lblVencimento = new Label("Vencimento:");
		absolutePanel.add(lblVencimento, 349, 85);
		lblVencimento.setSize("75px", "18px");
		
		Label lblPesquisarPor = new Label("Pesquisar por:");
		absolutePanel.add(lblPesquisarPor, 10, 56);
		lblPesquisarPor.setSize("94px", "18px");
		
		ListBox listBox = new ListBox();
		absolutePanel.add(listBox, 106, 56);
		listBox.setSize("94px", "18px");
		
		Button btnNewButton = new Button("New button");
		btnNewButton.setText("Salvar");
		absolutePanel.add(btnNewButton, 136, 323);
		
		Button btnNovo = new Button("Novo");
		btnNovo.setText("Limpar");
		absolutePanel.add(btnNovo, 195, 323);
		
		Button btnExcluir = new Button("Excluir");
		absolutePanel.add(btnExcluir, 256, 323);
		
		DatePicker datePicker = new DatePicker();
		absolutePanel.add(datePicker, 430, 85);
		datePicker.setSize("189px", "101px");
		
		Label lblFornecedor = new Label("Fornecedor:");
		absolutePanel.add(lblFornecedor, 171, 85);
		lblFornecedor.setSize("75px", "18px");
		
		ListBox listBox_1 = new ListBox();
		absolutePanel.add(listBox_1, 242, 85);
		listBox_1.setSize("94px", "18px");
	}
}
