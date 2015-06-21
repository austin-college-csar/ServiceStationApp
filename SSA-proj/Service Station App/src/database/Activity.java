package database;

public class Activity {
	
	private String eventName;
	private String dateSubmitted;
	private String activityDate;
	private String location;
	private float hoursServed;
	private String acGroup;
	private String description;
	private String studentId;

	public Activity() {
		eventName = null;
		dateSubmitted = null;
		activityDate = null;
		
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

}
