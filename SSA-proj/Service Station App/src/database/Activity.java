package database;

/**
 * 
 * @author Timothy
 * 
 *         This class contains the data for a volunteer activity by a student.
 */
public class Activity {

	private String eventName;
	private String dateSubmitted;
	private String activityDate;
	private String location; // location is the organization that the student
								// volunteered for
	private float hoursServed;
	private String acGroup;
	private String description;
	private String studentId;
	private boolean pending;

	/**
	 * No argument default constructor sets all String values to null, all
	 * numeric values to 0 and all boolean to false
	 */
	public Activity() {
		this(null, null, null, null, 0, null, null, null, false);
	}

	/**
	 * Main Constructor. All variables must be defines with this constructor. If
	 * data is not available for any String variable, use null.
	 * 
	 * @param eventName
	 * @param dateSubmitted
	 * @param activityDate
	 * @param location
	 * @param hoursServed
	 * @param acGroup
	 * @param description
	 * @param studentId
	 * @param pending
	 */
	public Activity(String eventName, String dateSubmitted,
			String activityDate, String location, float hoursServed,
			String acGroup, String description, String studentId,
			boolean pending) {
		this.eventName = eventName;
		this.dateSubmitted = dateSubmitted;
		this.activityDate = activityDate;
		this.location = location;
		this.hoursServed = hoursServed;
		this.acGroup = acGroup;
		this.description = description;
		this.studentId = studentId;
		this.pending = pending;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDateSubmitted() {
		return dateSubmitted;
	}

	public void setDateSubmitted(String dateSubmitted) {
		this.dateSubmitted = dateSubmitted;
	}

	public String getActivityDate() {
		return activityDate;
	}

	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getHoursServed() {
		return hoursServed;
	}

	public void setHoursServed(float hoursServed) {
		this.hoursServed = hoursServed;
	}

	public String getAcGroup() {
		return acGroup;
	}

	public void setAcGroup(String acGroup) {
		this.acGroup = acGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public boolean isPending() {
		return pending;
	}

}
