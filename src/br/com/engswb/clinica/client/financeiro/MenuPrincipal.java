package br.com.engswb.clinica.client.financeiro;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.sun.java.swing.plaf.windows.resources.windows;
import com.google.gwt.user.client.ui.MenuItem;

public class MenuPrincipal implements EntryPoint {
    
    public void onModuleLoad() {
    	
    	MenuBar grupo1     = new MenuBar(true);
    	MenuBar grupo2     = new MenuBar(true);
    	MenuBar financeiro = new MenuBar(true);
    	MenuBar estoque    = new MenuBar(true);
    	AbsolutePanel absolutePanel = new AbsolutePanel();
    	
        MenuBar barraMenu = new MenuBar();     
        barraMenu.addItem("Grupo1",grupo1);    
        barraMenu.addItem("Grupo2",grupo2);      
        barraMenu.addItem("Financeiro",financeiro);    
        barraMenu.addItem("Estoque",estoque);
            	
      	Command comandoMovimentos = new Command(){
    		public void execute(){
    			Movimentos mov = new Movimentos();    		    
    		    mov.onModuleLoad();
    		}
    	};    	
    	Command comandoCheques = new Command(){
    		public void execute(){
    			Cheques che = new Cheques();    		    
    		    che.onModuleLoad();
    		}
    	};    	
    	Command comandoOpPagamento = new Command(){
    		public void execute(){
    			OpPagamento opPag = new OpPagamento();   		    
    			opPag.onModuleLoad();
    		}
    	};    	
    	Command comandoConvenios = new Command(){
    		public void execute(){
    			Convenios con = new Convenios();    		    
    		    con.onModuleLoad();
    		}
    	};    		
        
    	 //Itens do Menu Financeito
    	financeiro.addItem("Movimentos",comandoMovimentos);
    	financeiro.addItem("Cheques",comandoCheques);
    	financeiro.addItem("Opcoes de Pagamento",comandoOpPagamento);
    	financeiro.addItem("Convenios",comandoConvenios);
    	
    	
        //Itens do Menu Estoque
    	MenuItem mntmNewItem_0 = new MenuItem("Medicamentos",    false, (Command) null);
    	estoque.addItem(mntmNewItem_0);
    	MenuItem mntmNewItem_1 = new MenuItem("Medicos",         false, (Command) null);
    	estoque.addItem(mntmNewItem_1);    	
    	MenuItem mntmNewItem_2 = new MenuItem("Salas",           false, (Command) null);
    	estoque.addItem(mntmNewItem_2);    	
    	MenuItem mntmNewItem_3 = new MenuItem("Fornecedores",    false, (Command) null);
    	estoque.addItem(mntmNewItem_3);    	
    	MenuItem mntmNewItem_4 = new MenuItem("Rel de Estoque", false, (Command) null);
    	estoque.addItem(mntmNewItem_4);
    	
    	absolutePanel.add(barraMenu,1,1);
    	
        
        
        
        
        
        
        RootPanel rootPanel = RootPanel.get();
        rootPanel.setSize("697", "658");
        rootPanel.add(absolutePanel, 10, 119);
        absolutePanel.setSize("657px", "458px");
        //RootPanel.get().add(bt);    
    }    
}
