package view_classes;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;

public class AdminPendingPanel extends JPanel{
	private JTable adminPendingTable;

	public AdminPendingPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel button_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) button_panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		add(button_panel, BorderLayout.SOUTH);
		
		JButton btnApproveSelected = new JButton("Approve");
		button_panel.add(btnApproveSelected);
		
		JButton btnNewButton = new JButton("Reject");
		button_panel.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		button_panel.add(btnEdit);
		
		adminPendingTable = new JTable();
		add(adminPendingTable, BorderLayout.CENTER);
		// TODO Auto-generated constructor stub
	}

}
