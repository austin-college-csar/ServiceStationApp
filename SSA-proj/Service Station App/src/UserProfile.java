/**
 * This class stores the basic user information for login to the database, as well as permission type. The username is also the id used to uniquely identify a student in the database
 * @author Timothy
 *
 */
public class UserProfile {
	
	String username;
	String password;
	String userType;
	
	/**
	 * 
	 * @param username
	 * @param pass
	 * @param type
	 */
	public UserProfile(String username, String pass, String type) {
		this.username = username;
		this.password = pass;
		this.userType = type;
	}

	
	
	public static void main (String[] args) {
		int max =9;
		for ( int i = 1; i <= max; i++ ) {
		    for ( int j = 1; j <= max; j++ ) {
		      System.out.print ( String.format ( "%4d", j * i ));
		    }
		  System.out.println();
		  }
	}
}
