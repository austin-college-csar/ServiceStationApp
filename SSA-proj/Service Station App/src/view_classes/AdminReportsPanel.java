package view_classes;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;

public class AdminReportsPanel extends JPanel{
	private JTable table;

	public AdminReportsPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel button_panel = new JPanel();
		add(button_panel, BorderLayout.SOUTH);
		
		table = new JTable();
		add(table, BorderLayout.CENTER);
		// TODO Auto-generated constructor stub
	}

}
