package br.com.engswb.clinica.client.estoque;

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

public class MenuPrincipal1 implements EntryPoint {
    
    public void onModuleLoad() {
    	
    	MenuBar grupo1 = new MenuBar(true);
    	MenuBar grupo2 = new MenuBar(true);
    	MenuBar grupo3 = new MenuBar(true);
    	MenuBar estoque = new MenuBar(true);
    	AbsolutePanel absolutePanel = new AbsolutePanel();
    	
    	//Comandos de Itens do Menu Estoque
    	Command comandoMedicamentos = new Command(){
    		public void execute(){
    			Medicamentos med = new Medicamentos();    		    
    		    //RootPanel.();
    			med.onModuleLoad();
    			//absolutePanel.add(med, 30, 30);
    		    //med.
    		}
    	};
    	
    	//Comandos de Itens do Menu Estoque
    	Command fornecedoresCommand = new Command(){
    		public void execute(){
    			Fornecedores fornecedor = new Fornecedores();    		    
    		    //RootPanel.();
    			fornecedor.onModuleLoad();
    			//absolutePanel.add(med, 30, 30);
    		    //med.
    		}
    	};
    	
    	
    	
    	 //DESENVOLVENDO O MENU BAR
        MenuBar barraMenu = new MenuBar();
        //BARRA DE MENU, ITEM PRINCIPAL GRUPO1
        barraMenu.addItem("Grupo1",grupo1);
        //BARRA DE MENU, ITEM PRINCIPAL GRUPO2
        barraMenu.addItem("Grupo2",grupo2);
        //BARRA DE MENU, ITEM PRINCIPAL GRUPO3
        barraMenu.addItem("Grupo3",grupo3);
        //BARRA DE MENU, ITEM PRINCIPAL ESTOQUE
        barraMenu.addItem("Estoque",estoque);
        //Itens do Menu Estoque
    	estoque.addItem("Medicamentos",comandoMedicamentos);
    	estoque.addItem("Fornecedores",fornecedoresCommand);
    	
    	MenuItem mntmNewItem = new MenuItem("M\u00E9dicos", false, (Command) null);
    	estoque.addItem(mntmNewItem);
    	
    	MenuItem mntmNewItem_1 = new MenuItem("Salas", false, (Command) null);
    	estoque.addItem(mntmNewItem_1);
    	
//    	MenuItem mntmNewItem_2 = new MenuItem("Fornecedores", false, (Command) null);
//    	estoque.addItem(mntmNewItem_2);
    	
    	MenuItem mntmNewItem_3 = new MenuItem("Relat\u00F3rios de Estoque", false, (Command) null);
    	estoque.addItem(mntmNewItem_3);
    	//estoque.addItem("Medicos",comandoMedicos);
    	//estoque.addItem("Salas",comandoSalas);
    	//estoque.addItem("Fornecedores",comandoFornecedores);
    	//estoque.addItem("Relatórios",comandoRelatorios);
        
    	absolutePanel.add(barraMenu,1,1);
    	
        
        
        
        
        
        
        RootPanel rootPanel = RootPanel.get();
        rootPanel.setSize("697", "658");
        rootPanel.add(absolutePanel, 10, 119);
        absolutePanel.setSize("657px", "458px");
        //RootPanel.get().add(bt);    
    }    
}
