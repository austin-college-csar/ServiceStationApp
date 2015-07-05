import java.util.ArrayList;

import database.Activity;
import database.ActivityDAOImpl;

/**
 * 
 * @author Timothy
 *
 *         This class will serve as model and controller for the program. It
 *         will hold all activity objects parsed from the database. It also acts
 *         as a go between for the GUI and the DAO objects
 */
public class ReportMgr {
	
	private ArrayList<Activity> activities;
	private ArrayList<Activity> pending;
	private ActivityDAOImpl activityDao;

	public ReportMgr() {
		
		
	}

	
	private void getActivities() {
		
	}
}
