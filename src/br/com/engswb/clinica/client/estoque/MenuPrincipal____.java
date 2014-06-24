package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;

public class MenuPrincipal____ implements EntryPoint {

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		
	}
	
}
/*package br.com.engswb.clinica.client.estoque;


import java.sql.SQLException;
import br.com.engswb.clinica.shared.Fornecedor;
import br.com.engswb.clinica.client.financeiro.TelaCheques;
import br.com.engswb.clinica.client.financeiro.TelaConvenios;
import br.com.engswb.clinica.client.financeiro.TelaMovimentos;
import br.com.engswb.clinica.client.financeiro.TelaOpPagamento;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.sun.java.swing.plaf.windows.resources.windows;
import com.google.gwt.user.client.ui.MenuItem;
import java.sql.SQLException;


public class MenuPrincipal implements EntryPoint {
    
    public void onModuleLoad() {
    	
		
    	DBConnectionAsync rpcService = (DBConnectionAsync) GWT.create(DBConnection.class);
	    ServiceDefTarget target = (ServiceDefTarget) rpcService;
	    String moduleRelativeURL = GWT.getModuleBaseURL() + "MySQLConnection";
	    target.setServiceEntryPoint(moduleRelativeURL);
	    
	    try {
			rpcService.retornaFornecedor(new AsyncCallback<Fornecedor>(){
			    public void onFailure(Throwable caught) {
			      Window.alert("You got to help me. I don't know what to do. I can't make decisions. I'm a president!");        
			    }

			    public void onSuccess(Fornecedor result) {
			      Window.alert("Hey I'm a user with id " + result.getNome());        
			    }
			  });
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
       	MenuBar grupo1     = new MenuBar(true);
    	MenuBar grupo2     = new MenuBar(true);
    	MenuBar financeiro = new MenuBar(true);
    	MenuBar estoque    = new MenuBar(true);
    	AbsolutePanel absolutePanel = new AbsolutePanel();
    	
    	
    	 MenuBar barraMenu = new MenuBar();     
         barraMenu.addItem("Grupo1",grupo1);    
         barraMenu.addItem("Atendimento",grupo2);      
         barraMenu.addItem("Financeiro",financeiro);    
         barraMenu.addItem("Estoque",estoque);
    	
    	Command comandoMedicamentos = new Command(){
    		public void execute(){
    			Medicamentos med = new Medicamentos();    		    
    		    med.onModuleLoad();
    		}
    	};
    	
    	MenuItem mntmAgendarConsulta = new MenuItem("Agendar Consulta", false, new Command() {
        	public void execute() {
        		
    			AgendaConsulta agenda = new AgendaConsulta();    		    
    		    agenda.onModuleLoad();
    		}
        });
    	
    	Command comandoMovimentos = new Command(){
    		public void execute(){
    			TelaMovimentos mov = new TelaMovimentos();    		    
    		    mov.onModuleLoad();
    		}
    	};    	
    	Command comandoCheques = new Command(){
    		public void execute(){
    			TelaCheques che = new TelaCheques();    		    
    		    che.onModuleLoad();
    		}
    	};    	
    	Command comandoOpPagamento = new Command(){
    		public void execute(){
    			TelaOpPagamento opPag = new TelaOpPagamento();   		    
    			opPag.onModuleLoad();
    		}
    	};    	
    	Command comandoConvenios = new Command(){
    		public void execute(){
    			TelaConvenios con = new TelaConvenios();    		    
    		    con.onModuleLoad();
    		}
    	};    		
    	  	
    	 //Itens do Menu Financeito
    	financeiro.addItem("TelaMovimentos",comandoMovimentos);
    	financeiro.addItem("TelaCheques",comandoCheques);
    	financeiro.addItem("Opcoes de Pagamento",comandoOpPagamento);
    	financeiro.addItem("TelaConvenios",comandoConvenios);
    	

    	MenuItem menuVerProntuario = new MenuItem("Consultar Prontuario", false, (Command) null);    	   	
        mntmAgendarConsulta.setHTML("Agendar Consulta");
        menuVerProntuario.setHTML("Consultar Prontuario");
        
        estoque.addItem("Medicamentos",comandoMedicamentos);    	
    	MenuItem mntmNewItem = new MenuItem("M\u00E9dicos", false, (Command) null);
    	estoque.addItem(mntmNewItem);
    	
    	MenuItem mntmNewItem_1 = new MenuItem("Salas", false, (Command) null);
    	estoque.addItem(mntmNewItem_1);
    	
    	MenuItem mntmNewItem_2 = new MenuItem("Fornecedores", false, (Command) null);
    	estoque.addItem(mntmNewItem_2);
    	
    	MenuItem mntmNewItem_3 = new MenuItem("Relat\u00F3rios de Estoque", false, (Command) null);
    	estoque.addItem(mntmNewItem_3);
    	        
    	absolutePanel.add(barraMenu,1,1);    	 
        
        RootPanel rootPanel = RootPanel.get();
        rootPanel.setSize("697", "658");
        rootPanel.add(absolutePanel, 10, 119);
        absolutePanel.setSize("657px", "458px");
   
    }    
}
*/