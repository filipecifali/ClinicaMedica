package br.com.engswb.clinica.client.financeiro;

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

public class TelaConvenios implements EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		
		TabLayoutPanel tabLayoutPanel = new TabLayoutPanel(1.5, Unit.EM);
		tabLayoutPanel.setAnimationDuration(30);
		tabLayoutPanel.setAnimationVertical(true);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel, "TelaConvenios", false);
		
		TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 54, 11);
		textBox.setSize("144px", "5px");
		
		Grid grid = new Grid(1, 1);
		absolutePanel.add(grid, 10, 55);
		grid.setSize("611px", "290px");
		
		Label lblNewLabel = new Label("Nome:");
		absolutePanel.add(lblNewLabel, 10, 11);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		tabLayoutPanel.add(absolutePanel_1, "Relatorios", false);
		absolutePanel_1.setHeight("363px");
		
		//Label lblNewLabel_1 = new Label("Nome:");
		//absolutePanel_1.add(lblNewLabel_1);
		
		//TextBox textBox_1 = new TextBox();
		//absolutePanel_1.add(textBox_1);
				
		//tabLayoutPanel.selectTab(1);		
	
		rootPanel.add(tabLayoutPanel, 11, 158);
		tabLayoutPanel.setSize("633px", "375px");
		

	}
}
