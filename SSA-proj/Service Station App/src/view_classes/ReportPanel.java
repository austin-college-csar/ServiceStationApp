package view_classes;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTable;

/**
 * 
 * @author Timothy
 *
 * Report panel shows an aggregate table of student volunteer data by default, but can be filtered to specific data
 */
public class ReportPanel extends JPanel{
	private JTable reportTable;

	public ReportPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel button_panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) button_panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		add(button_panel, BorderLayout.SOUTH);
		
		JButton btnFilterBy = new JButton("Filter by...");
		button_panel.add(btnFilterBy);
		
		JButton btnRequestLetterhead = new JButton("Request Letterhead");
		button_panel.add(btnRequestLetterhead);
		
		JButton btnRequestEdit = new JButton("Request Edit");
		button_panel.add(btnRequestEdit);
		
		JButton btnExportAsPdf = new JButton("Export as PDF");
		button_panel.add(btnExportAsPdf);
		
		reportTable = new JTable();
		add(reportTable, BorderLayout.CENTER);
		// TODO Auto-generated constructor stub
	}

}
