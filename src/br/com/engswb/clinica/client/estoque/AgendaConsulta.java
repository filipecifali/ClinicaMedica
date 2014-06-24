package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.cell.client.SelectionCell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.view.client.ListDataProvider;

public class AgendaConsulta implements EntryPoint {
	private AbsolutePanel absolutePanel;
	private TextBox textBox;
	private TextBox textBox_1;
	private ListBox comboBox;
	private TextBox txtIdade;
	private TextBox textBox_2;
	private TextBox textBox_3;
	
	private static class Paciente {
		private String nome;
		
		public Paciente(String nome){
			this.nome =nome;
		}
	}
	
	private static List<Paciente> CONTACTS = Arrays.asList(new Paciente("John"), new Paciente("Mary"), new Paciente(
		      "Zander"));

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
		absolutePanel.add(lblNewLabel, 6, 87);
		lblNewLabel.setSize("130px", "34px");
		
		textBox = new TextBox();
		absolutePanel.add(textBox, 120, 130);
		
		Button btnCadastrarConsulta = new SubmitButton("CadastrarConsulta");
		btnCadastrarConsulta.setHTML("Cadastrar Consulta");
		btnCadastrarConsulta.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				String nome = getTxtNome().getText();
				String contato = txtContato().getText();
				String idade = getTxtIdade().getText();
				int genero = cmbSexo().getSelectedIndex();
				
				//MySql mysql = new MySql(host, database, user, pass)
				
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
		
		AbsolutePanel absolutePanel_2 = new AbsolutePanel();
		absolutePanel_1.add(absolutePanel_2, 10, 0);
		absolutePanel_2.setSize("625px", "460px");
		
		InlineHTML nlnhtmlbuscarConsulta = new InlineHTML("<h1>Buscar Consulta</h1>");
		absolutePanel_2.add(nlnhtmlbuscarConsulta, 6, 0);
		
		InlineHTML inlineHTML_2 = new InlineHTML("<hr>");
		absolutePanel_2.add(inlineHTML_2, 6, 44);
		
		Label lblBuscarConsulta = new Label("Buscar consulta");
		absolutePanel_2.add(lblBuscarConsulta, 20, 68);
		lblBuscarConsulta.setSize("130px", "34px");
		
		textBox_2 = new TextBox();
		absolutePanel_2.add(textBox_2, 6, 121);
		
		SubmitButton sbmtbtnBuscarConsulta = new SubmitButton("CadastrarConsulta");
		sbmtbtnBuscarConsulta.setHTML("Buscar Consulta");
		absolutePanel_2.add(sbmtbtnBuscarConsulta, 118, 416);
		sbmtbtnBuscarConsulta.setSize("169px", "34px");
		
		InlineHTML inlineHTML_3 = new InlineHTML("Nome");
		absolutePanel_2.add(inlineHTML_3, 6, 97);
		
		InlineHTML nlnhtmlId = new InlineHTML("ID da consulta");
		absolutePanel_2.add(nlnhtmlId, 6, 161);
		
		textBox_3 = new TextBox();
		absolutePanel_2.add(textBox_3, 6, 184);
		
		Button limparBuscaConsulta = new Button("Limpar dados");
		limparBuscaConsulta.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				getNomeBuscaConsulta().setText("");
				getIDBuscaConsulta().setText("");
			}
		});
		absolutePanel_2.add(limparBuscaConsulta, 6, 420);
		
		
		
		
		CellTable<Paciente> cellTable = new CellTable<Paciente>();
		absolutePanel_2.add(cellTable, 6, 224);
		cellTable.setSize("198px", "156px");
		
		
		TextColumn<Paciente> nameColumn = new TextColumn<Paciente>() {
			@Override
			public String getValue(Paciente paciente) {
				return paciente.toString();
			}
		};
		nameColumn.setSortable(true);
		
		cellTable.addColumn(nameColumn, "Nome:");
		
		/*
		TextColumn<Paciente> textColumn_1 = new TextColumn<Paciente>() {
			@Override
			public String getValue(Paciente paciente) {
				return paciente.toString();
			}
		};
		*/
		ListDataProvider<Paciente> dataProvider = new ListDataProvider<Paciente>();

	    dataProvider.addDataDisplay(cellTable);
		
		List<Paciente> list = dataProvider.getList();
	    for (Paciente paciente : CONTACTS) {
	      list.add(paciente);
	    }
	    
	    ListHandler<Paciente> columnSortHandler = new ListHandler<AgendaConsulta.Paciente>(
	            list);
	        columnSortHandler.setComparator(nameColumn,
	            new Comparator<AgendaConsulta.Paciente>() {
	              public int compare(Paciente o1, Paciente o2) {
	                if (o1 == o2) {
	                  return 0;
	                }

	                // Compare the name columns.
	                if (o1 != null) {
	                  return (o2 != null) ? o1.nome.compareTo(o2.nome) : 1;
	                }
	                return -1;
	              }
	            });
	    
		/*
		cellTable.addColumn(textColumn_1, "Data:");
		
		TextColumn<Object> textColumn_2 = new TextColumn<Object>() {
			@Override
			public String getValue(Object object) {
				return object.toString();
			}
		};
		cellTable.addColumn(textColumn_2, "Sala:");
		
		TextColumn<Object> textColumn_3 = new TextColumn<Object>() {
			@Override
			public String getValue(Object object) {
				return object.toString();
			}
		};
		cellTable.addColumn(textColumn_3, "Medico:");
		*/
		InlineHTML inlineHTML_1 = new InlineHTML("<hr>");
		absolutePanel_2.add(inlineHTML_1, 8, 44);
		inlineHTML_1.setSize("420px", "0px");
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_3, "Hist\u00F3rico", false);
		
		TextBox textBox_4 = new TextBox();
		absolutePanel_3.add(textBox_4, 10, 125);
		textBox_4.setSize("173px", "34px");
		
		InlineHTML inlineHTML_4 = new InlineHTML("Nome");
		absolutePanel_3.add(inlineHTML_4, 10, 101);
		inlineHTML_4.setSize("34px", "18px");
		
		Label label = new Label("Buscar consulta");
		absolutePanel_3.add(label, 10, 61);
		label.setSize("130px", "34px");
		
		InlineHTML inlineHTML_5 = new InlineHTML("<h1>Histórico das Consultas</h1>");
		absolutePanel_3.add(inlineHTML_5, 10, 0);
		inlineHTML_5.setSize("355px", "69px");
		
		
		InlineHTML inlineHTML_6 = new InlineHTML("<hr>");
		absolutePanel_3.add(inlineHTML_6, 6, 40);
		
		CellTable<Paciente> cellTable_1 = new CellTable<Paciente>();
		absolutePanel_3.add(cellTable_1, 10, 196);
		cellTable_1.setSize("198px", "156px");
		
		TextColumn<Paciente> textColumn = new TextColumn<Paciente>() {
			public String getValue(Paciente paciente) {
				return (String) null;
			}
		};
		cellTable_1.addColumn(textColumn, "Nome:");
		
		SubmitButton submitButton = new SubmitButton("CadastrarConsulta");
		submitButton.setHTML("Buscar Consulta");
		absolutePanel_3.add(submitButton, 122, 420);
		submitButton.setSize("169px", "34px");
		
		Button button = new Button("Limpar dados");
		absolutePanel_3.add(button, 10, 424);
		button.setSize("94px", "30px");
		rootPanel.add(tabLayoutPanel, 11, 158);
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
	public TextBox getNomeBuscaConsulta() {
		return textBox_2;
	}
	public TextBox getIDBuscaConsulta() {
		return textBox_3;
	}
}
