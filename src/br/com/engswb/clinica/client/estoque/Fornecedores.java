package br.com.engswb.clinica.client.estoque;

import java.util.List;

import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
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
import br.com.engswb.clinica.shared.estoque.FornecedoresED;
import br.com.engswb.clinica.shared.estoque.MedicamentosED;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.DefaultFormat;
import com.google.gwt.i18n.client.DateTimeFormat;;


public class Fornecedores implements EntryPoint {
		
	@Override
	public void onModuleLoad() {
		final String idForn = "";
		
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel fornecedorTabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		fornecedorTabLayoutPanel.setAnimationDuration(30);
		fornecedorTabLayoutPanel.setAnimationVertical(true);
		
		AbsolutePanel pesqFornecedorAbsolutePanel = new AbsolutePanel();
		fornecedorTabLayoutPanel.add(pesqFornecedorAbsolutePanel, "Pesquisa", false);
		pesqFornecedorAbsolutePanel.setSize("631px", "363px");		
		
		InlineHTML pesquisaFornecedorTitulo = new InlineHTML("<h1>Pesquisa de Fornecedores</h1>");
		pesqFornecedorAbsolutePanel.add(pesquisaFornecedorTitulo);
		
		InlineHTML inlineHTML = new InlineHTML("<hr>");
		pesqFornecedorAbsolutePanel.add(inlineHTML);		
		
		Label nomePesqLabel = new Label("Nome:");
		pesqFornecedorAbsolutePanel.add(nomePesqLabel, 10, 85);
		nomePesqLabel.setSize("47px", "18px");
		
		TextBox nomePesqTextBox = new TextBox();
		pesqFornecedorAbsolutePanel.add(nomePesqTextBox, 136, 85);
		nomePesqTextBox.setSize("84px", "6px");
		
		Label cnpjPesqLabel = new Label("CNPJ:");
		pesqFornecedorAbsolutePanel.add(cnpjPesqLabel, 10, 105);
		cnpjPesqLabel.setSize("75px", "18px");	
		
		TextBox cnpjPesqTextBox = new TextBox();
		pesqFornecedorAbsolutePanel.add(cnpjPesqTextBox, 136, 105);
		cnpjPesqTextBox.setSize("84px", "6px");
		
		Label enderecoPesqLabel = new Label("Endereço:");
		pesqFornecedorAbsolutePanel.add(enderecoPesqLabel, 10, 125);
		enderecoPesqLabel.setSize("75px", "18px");	
		
		TextBox enderecoPesqTextBox = new TextBox();
		pesqFornecedorAbsolutePanel.add(enderecoPesqTextBox, 136, 125);
		enderecoPesqTextBox.setSize("84px", "6px");
		
		Label bairroPesqLabel = new Label("Bairro:");
		pesqFornecedorAbsolutePanel.add(bairroPesqLabel, 10, 145);
		bairroPesqLabel.setSize("75px", "18px");	
		
		TextBox bairroPesqTextBox = new TextBox();
		pesqFornecedorAbsolutePanel.add(bairroPesqTextBox, 136, 145);
		bairroPesqTextBox.setSize("84px", "6px");
		
		Label ufPesqLabel = new Label("UF:");
		pesqFornecedorAbsolutePanel.add(ufPesqLabel, 10, 165);
		ufPesqLabel.setSize("75px", "18px");	
		
		TextBox ufPesqTextBox = new TextBox();
		pesqFornecedorAbsolutePanel.add(ufPesqTextBox, 136, 165);
		ufPesqTextBox.setSize("84px", "6px");
		
		Label paisPesqLabel = new Label("País:");
		pesqFornecedorAbsolutePanel.add(paisPesqLabel, 10, 185);
		paisPesqLabel.setSize("75px", "18px");	
		
		TextBox paisPesqTextBox = new TextBox();
		pesqFornecedorAbsolutePanel.add(paisPesqTextBox, 136, 185);
		paisPesqTextBox.setSize("84px", "6px");
		
//		Label lblPesquisarPor = new Label("Pesquisar por:");
//		pesquisaFornecedorAbsolutePanel.add(lblPesquisarPor, 10, 56);
//		lblPesquisarPor.setSize("94px", "18px");
//		
//		ListBox listBoxPesq = new ListBox();
//		pesquisaFornecedorAbsolutePanel.add(listBoxPesq, 106, 56);
//		listBoxPesq.setSize("200px", "18px");
//		listBoxPesq.addItem("Todos", "1");
//		listBoxPesq.addItem("N\u00EDvel Baixo no Estoque", "2");
//		listBoxPesq.addItem("Data de Vencimento Expirada", "3");
		
		Button pesquisaFornecedorButton = new Button("btnPesquisar");
		pesquisaFornecedorButton.setText("Pesquisar");
		pesqFornecedorAbsolutePanel.add(pesquisaFornecedorButton, 10, 205);
		pesquisaFornecedorButton.setSize("220px", "30px");
		
//		Label lblFornecedor = new Label("Fornecedor:");
//		pesqFornecedorAbsolutePanel.add(lblFornecedor, 171, 85);
//		lblFornecedor.setSize("75px", "18px");
//		
//		final ListBox listBox_1 = new ListBox();
//		pesqFornecedorAbsolutePanel.add(listBox_1, 242, 85);
//		listBox_1.setSize("94px", "18px");
//		
//		FlexTable flexTable = new FlexTable();
//		pesqFornecedorAbsolutePanel.add(flexTable, 6, 109);
//		flexTable.setSize("615px", "230px");
//		
//		DateBox dateBox = new DateBox();
//		dateBox.setFormat(new DefaultFormat(DateTimeFormat.getFormat("YYYY-MM-DD")));
//		pesqFornecedorAbsolutePanel.add(dateBox, 424, 85);
//		dateBox.setSize("84px", "6px");
		
		/*setText(0, 0, "ID");
		setText(0, 1, "Nome");
		setText(0, 2, "Descrição");
		setText(0, 3, "Quantidade");
		setText(0, 4, "Preço");
		setCellPadding(6);
		
		getRowFormatter().addStyleName(0, "listHeader");
		addStyleName("list");
		getCellFormatter().addStyleName(0, 1, "listTextColumn");
		getCellFormatter().addStyleName(0, 2, "listTextColumn");
		getCellFormatter().addStyleName(0, 3, "listNumericColumn");
		getCellFormatter().addStyleName(0, 4, "listNumericColumn");
		
		addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Cell td = getCellForEvent(event);
				if (td == null) return;
		        
		        boolean sameRow = selectedRow == td.getRowIndex();
		        changeRow(selectedRow, false);
		        selectedRow = td.getRowIndex();
		        changeRow(selectedRow, !sameRow);
		       	if (sameRow) selectedRow = 0;
			}
		});*/
		
		//CADASTRO DE MEDICAMENTOS
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		fornecedorTabLayoutPanel.add(absolutePanel_1, "Medicamento", false);
		absolutePanel_1.setSize("631px", "355px");
		
		InlineHTML nlnhtmlinformaesDoPaciente1 = new InlineHTML("<h1>Cadastro de Medicamentos</h1>");
		absolutePanel_1.add(nlnhtmlinformaesDoPaciente1);
		
		InlineHTML inlineHTML1 = new InlineHTML("<hr>");
		absolutePanel_1.add(inlineHTML1);
		
		
		Label label = new Label("Nome:");
		absolutePanel_1.add(label, 10, 67);
		label.setSize("94px", "18px");
		
		final TextBox textBox = new TextBox();
		absolutePanel_1.add(textBox, 136, 67);
		textBox.setSize("288px", "6px");
		
		Label label_1 = new Label("Localiza\u00E7\u00E3o:");
		absolutePanel_1.add(label_1, 10, 87);
		label_1.setSize("94px", "18px");
		
		final TextBox textBox_1 = new TextBox();
		absolutePanel_1.add(textBox_1, 136, 87);
		textBox_1.setSize("288px", "6px");
		
		Label label_2 = new Label("Data Vencimento:");
		absolutePanel_1.add(label_2, 10, 107);
		label_2.setSize("110px", "18px");
		
		final TextBox textBox_2 = new TextBox();
		absolutePanel_1.add(textBox_2, 136, 107);
		textBox_2.setSize("288px", "6px");
		
		Label label_3 = new Label("Quantidade Estoque:");
		absolutePanel_1.add(label_3, 10, 127);
		label_3.setSize("128px", "18px");
		
		final TextBox textBox_3 = new TextBox();
		absolutePanel_1.add(textBox_3, 136, 127);
		textBox_3.setSize("288px", "6px");
		
		Label label_4 = new Label("Quantidade M\u00EDnima:");
		absolutePanel_1.add(label_4, 10, 147);
		label_4.setSize("128px", "18px");
		
		final TextBox textBox_4 = new TextBox();
		absolutePanel_1.add(textBox_4, 136, 147);
		textBox_4.setSize("288px", "6px");
		
		Label label_5 = new Label("Tipo:");
		absolutePanel_1.add(label_5, 10, 171);
		label_5.setSize("104px", "18px");
		
		/*final TextBox textBox_5 = new TextBox();
		absolutePanel_1.add(textBox_5, 136, 167);
		textBox_5.setSize("288px", "6px");*/
		
		final ListBox listBox_ = new ListBox();
		absolutePanel_1.add(listBox_, 136, 167);
		listBox_.setSize("288px", "18px");
		listBox_.addItem("Comprimido", "1");
		listBox_.addItem("Gotas", "2");
		
		Label label_6 = new Label("Fornecedor:");
		absolutePanel_1.add(label_6, 10, 195);
		label_6.setSize("94px", "18px");
		
		final TextBox textBox_6 = new TextBox();
		
		final ListBox listBox = new ListBox();
		absolutePanel_1.add(listBox, 136, 191);
		listBox.setSize("288px", "18px");
		 
		listBox.addClickHandler(new ClickHandler() {
		      @Override
		      public void onClick(ClickEvent event) {
		    	  //idForn = listBox.getValue(listBox.getSelectedIndex());
		    	//textBox_6.setText(listBox.getValue(listBox.getSelectedIndex()) );
		      }
		});

		//MONTAGEM DO COMBO FORNECEDOR
		FornecedoresReqAsync rpcServiceForn = (FornecedoresReqAsync) GWT.create(FornecedoresReq.class);
	    ServiceDefTarget target = (ServiceDefTarget) rpcServiceForn;
	    String moduleRelativeURL = GWT.getModuleBaseURL() + "FornecedoresBD";
	    target.setServiceEntryPoint(moduleRelativeURL);
	    
	    
    	rpcServiceForn.consultaFornecedores(new AsyncCallback<List<FornecedoresED>>(){
		      public void onFailure(Throwable caught) {
		        Window.alert("Falha na montagem da combo Fornecedores!");        
		      }

			@Override
			public void onSuccess(List<FornecedoresED> listaFornecedores) {
				// TODO Auto-generated method stub
				for(int i=0;i<listaFornecedores.size();i++){  
					listBox.addItem(listaFornecedores.get(i).getNome(), (listaFornecedores.get(i).getIdFornecedor()) + "");
					listBox.addItem(listaFornecedores.get(i).getNome(), (listaFornecedores.get(i).getIdFornecedor()) + "");
				}
			}
	    });
		
		
		absolutePanel_1.add(textBox_6, 136, 219);
		textBox_6.setSize("84px", "10px");
		
		//BOTAO SALVAR
		Button btnNewButton = new Button("New button", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	  	MedicamentosReqAsync rpcService = (MedicamentosReqAsync) GWT.create(MedicamentosReq.class);
		    	    ServiceDefTarget target = (ServiceDefTarget) rpcService;
		    	    String moduleRelativeURL = GWT.getModuleBaseURL() + "MedicamentosBD";
		    	    target.setServiceEntryPoint(moduleRelativeURL);
		    	    
	    	    	rpcService.insereMedicamentos(textBox.getText(), textBox_1.getText(), textBox_2.getText(), textBox_3.getText(), textBox_4.getText(), listBox_.getValue(listBox_.getSelectedIndex()), listBox.getValue(listBox.getSelectedIndex()),textBox_6.getText(),new AsyncCallback<String>(){
	  		        public void onFailure(Throwable caught) {
	  		          Window.alert("Falha ao cadastrar Medicamento!");        
	  		        }
					@Override
					public void onSuccess(String result) {
						if (result.indexOf("OK") > 0){
							textBox_6.setText(result.substring(0, result.indexOf("OK")));
							Window.alert("Medicamento Cadastrado com sucesso!" ); 
						}else{
							Window.alert("ERRO:" + result );
						}
					}
		  		    });
			      }
		     }
		);
		btnNewButton.setText("Salvar");
		absolutePanel_1.add(btnNewButton, 136, 247);
		
		//BOTÃO LIMPAR
		Button btnNovo = new Button("New button", new ClickHandler() {
		      public void onClick(ClickEvent event) {
		    	  	textBox.setText("");
		    	  	textBox_1.setText("");
		    	  	textBox_2.setText("");
		    	  	textBox_3.setText("");
		    	  	textBox_4.setText("");
		    	  	textBox_6.setText("");
		    	  	listBox.setItemSelected(0, true);
		    	  	listBox_.setItemSelected(0, true);
		      }
	     }
		);
		btnNovo.setText("Limpar");
		absolutePanel_1.add(btnNovo, 195, 247);
		
		Button btnExcluir = new Button("Excluir");
		absolutePanel_1.add(btnExcluir, 256, 247);
		textBox_6.setVisible(false);
		
		
		
		
		
		AbsolutePanel absolutePanel_2 = new AbsolutePanel();
		fornecedorTabLayoutPanel.add(absolutePanel_2, "Cota\u00E7\u00F5es", false);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		fornecedorTabLayoutPanel.add(absolutePanel_3, "Solicita\u00E7\u00E3o de Compra", false);
		
		fornecedorTabLayoutPanel.selectTab(1);
		
		AbsolutePanel absolutePanel_4 = new AbsolutePanel();
		fornecedorTabLayoutPanel.add(absolutePanel_4, "Hist\u00F3rico de Pre\u00E7os", false);
		absolutePanel_4.setSize("631px", "355px");
		
		Button button = new Button("New button", new ClickHandler() {
		      public void onClick(ClickEvent event) {
			        //Window.alert("How high?");
		    	  	MedicamentosReqAsync rpcService = (MedicamentosReqAsync) GWT.create(MedicamentosReq.class);
		    	    ServiceDefTarget target = (ServiceDefTarget) rpcService;
		    	    String moduleRelativeURL = GWT.getModuleBaseURL() + "MedicamentosBD";
		    	    target.setServiceEntryPoint(moduleRelativeURL);
		    	    
		    	    
	    	    	rpcService.consultaMedicamentos(new AsyncCallback<MedicamentosED>(){
		  		      public void onFailure(Throwable caught) {
		  		        Window.alert("PORRA FUDEU!");        
		  		      }

						@Override
						public void onSuccess(MedicamentosED result) {
							// TODO Auto-generated method stub
							 Window.alert("COMUNICO PORRA!!!!!!" ); 
							 //textBox_1.setText(result.getNome());
							 //textBox_2.setText(result.getLocalizacao());
						}
			  		    });
		    	    
			      }
			    }
		/*DBConnectionAsync rpcService = (DBConnectionAsync) GWT.create(DBConnection.class);
	    ServiceDefTarget target = (ServiceDefTarget) rpcService;
	    String moduleRelativeURL = GWT.getModuleBaseURL() + "MySQLConnection";
	    target.setServiceEntryPoint(moduleRelativeURL);*/
				
		
		
				);
		fornecedorTabLayoutPanel.add(button, "New Widget", false);
		rootPanel.add(fornecedorTabLayoutPanel, 11, 155);
		fornecedorTabLayoutPanel.setSize("633px", "375px");
	}
	
	private static String[][] getStates() {  
        return new String[][]{  
                new String[]{"AL", "Alabama", "The Heart of Dixie"},  
                new String[]{"AK", "Alaska", "The Land of the Midnight Sun"},   
        };  
    }  
}
