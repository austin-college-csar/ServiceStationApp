package database;

import java.util.List;

public interface ActivityDAO {
	
	public List fetchAll();
	public Activity findById(String id);
	public void insert(Activity a);
	public void update(Activity a);
	public void delete(Activity a);

}
