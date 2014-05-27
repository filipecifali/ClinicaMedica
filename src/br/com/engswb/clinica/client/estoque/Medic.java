package br.com.engswb.clinica.client.estoque;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
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

public class Medic implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		
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
		
		AbsolutePanel absolutePanel_2 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_2, "Cota\u00E7\u00F5es", false);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_3, "Solicita\u00E7\u00E3o de Compra", false);
		
		AbsolutePanel absolutePanel_4 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_4, "Hist\u00F3rico de Pre\u00E7os", false);
		absolutePanel_4.setSize("631px", "355px");
		rootPanel.add(tabLayoutPanel, 10, 10);
		tabLayoutPanel.setSize("633px", "375px");
	}
}
