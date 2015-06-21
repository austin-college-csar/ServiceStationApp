package view_classes;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;

public class AdminPanel extends JPanel{
	
	private AdminPendingPanel pendingPanel;
	private AdminReportsPanel reportPanel;
	private AdminStatsPanel statsPanel;

	public AdminPanel() {
		setLayout(new BorderLayout(0, 0));
		
		pendingPanel = new AdminPendingPanel();
		reportPanel = new AdminReportsPanel();
		statsPanel = new AdminStatsPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("Pending", pendingPanel);
		tabbedPane.addTab("Reports", reportPanel);
		tabbedPane.addTab("Statistics", statsPanel);
		
	}

}
