package database;

import java.util.List;

public interface ActivityDAO {
	
	public List fetchAll();
	public Activity findById(String id);
	

}
