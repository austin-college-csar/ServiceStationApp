package view_classes;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class MainFrame extends JFrame {
	
	private AdminPanel adminPanel;
	private ReportPanel reportPanel;
	private PendingPanel pendingPanel;

	public MainFrame(){
		
		/*
		 * Here I change the theme being used from the unpleasant Java theme
		 */
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Service Station App");
		setSize(new Dimension(645,480));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("Export");
		mnFile.add(mntmNew);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnFile.add(mntmLogOut);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		pendingPanel = new PendingPanel();
		reportPanel = new ReportPanel();
		adminPanel = new AdminPanel();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.addTab("Pending", pendingPanel);
		tabbedPane.addTab("Reports", reportPanel);
		tabbedPane.addTab("Admin", adminPanel);
		
		
		setVisible(true);
	}
	
	/**
	 * This method is called whenever the changes are made in the foremost panel
	 */
	public void refresh(){
		
	}
	
	
	
	
	public static void main(String[] args){
		new MainFrame();
	}
	
}
