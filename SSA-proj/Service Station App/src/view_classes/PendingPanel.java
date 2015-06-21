package view_classes;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;

public class PendingPanel extends JPanel {
	private JTable pendingHoursTable;

	public PendingPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel button_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) button_panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		add(button_panel, BorderLayout.SOUTH);
		
		JButton addHoursButton = new JButton("Add New Hours");
		button_panel.add(addHoursButton);
		
		JButton requestEditButton = new JButton("Request Edit");
		button_panel.add(requestEditButton);
		
		pendingHoursTable = new JTable();
		add(pendingHoursTable, BorderLayout.CENTER);
		// TODO Auto-generated constructor stub
	}

	public PendingPanel(LayoutManager arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	

}
