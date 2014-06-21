package br.com.engswb.clinica.client.estoque;

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
import br.com.engswb.clinica.shared.estoque.MedicamentosED;;


public class Medicamentos implements EntryPoint {
	/*rpcService.consultaMedicamentos("president_skroob", "12345", new AsyncCallback<User>(){
	      public void onFailure(Throwable caught) {
	        Window.alert("You got to help me. I don't know what to do. I can't make decisions. I'm a president!");        
	      }

	      public void onSuccess(User result) {
	        Window.alert("Hey I'm a user with id " );        
	      }
	    });*/
	
	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		tabLayoutPanel.setAnimationDuration(30);
		tabLayoutPanel.setAnimationVertical(true);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel, "Pesquisa", false);
		
		TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 54, 11);
		textBox.setSize("144px", "5px");
		
		Grid grid = new Grid(1, 1);
		absolutePanel.add(grid, 10, 55);
		grid.setSize("611px", "290px");
		
		Label lblNewLabel = new Label("Nome:");
		absolutePanel.add(lblNewLabel, 10, 11);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_1, "Medicamento", false);
		absolutePanel_1.setHeight("363px");
		
		Label lblNewLabel_1 = new Label("Nome:");
		absolutePanel_1.add(lblNewLabel_1);
		
		TextBox textBox_1 = new TextBox();
		absolutePanel_1.add(textBox_1);
		
		Label lblNewLabel_2 = new Label("Localiza\u00E7\u00E3o:");
		absolutePanel_1.add(lblNewLabel_2);
		
		TextBox textBox_2 = new TextBox();
		absolutePanel_1.add(textBox_2);
		
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
						}
			  		    });
		    	    
			      }
			    }
		/*DBConnectionAsync rpcService = (DBConnectionAsync) GWT.create(DBConnection.class);
	    ServiceDefTarget target = (ServiceDefTarget) rpcService;
	    String moduleRelativeURL = GWT.getModuleBaseURL() + "MySQLConnection";
	    target.setServiceEntryPoint(moduleRelativeURL);*/
				
		
		
				);
		absolutePanel_1.add(button);
		
		AbsolutePanel absolutePanel_2 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_2, "Cota\u00E7\u00F5es", false);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_3, "Solicita\u00E7\u00E3o de Compra", false);
		
		tabLayoutPanel.selectTab(1);
		
		AbsolutePanel absolutePanel_4 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_4, "Hist\u00F3rico de Pre\u00E7os", false);
		absolutePanel_4.setSize("631px", "355px");
		rootPanel.add(tabLayoutPanel, 11, 155);
		tabLayoutPanel.setSize("633px", "375px");
	}
}
