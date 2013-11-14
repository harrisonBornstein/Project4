import java.util.List;


public class Conference extends Effort {
	
	private String organization;
	private List<Meeting> meetings;
	private String type;
	
	public Conference()
	{
		this.organization = null;
		this.meetings = null;
	}
	
	/**
	 * Constructor
	 * @param organization
	 * @param meetings
	 */
	public Conference(String organization, List<Meeting> meetings)
	{
		this.organization = organization;
		this.meetings = meetings;
		this.type = "Conference";
	}
	
	/**
	 * Setter
	 * @param meetings
	 */
	public void setMeetings(List<Meeting> meetings)
	{
		this.meetings = meetings;
	}
	
	/**
	 * getter
	 * @return
	 */
	public List<Meeting> getMeetings()
	{
		return meetings;
	}
	
	/**
	 * 
	 * @param meeting Adds meeting to the list of meetings
	 */
	public void addToMeetings(Meeting meeting)
	{
		this.meetings.add(meeting);
	}

	/**
	 * getter
	 * @return
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * setter
	 * @param newType
	 */
	public void setType(String newType)
	{
		this.type = newType;
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getOrganization()
	{
		return organization;
	}
	
	/**
	 * setter
	 * @param org
	 */
	public void setOrganization(String org)
	{
		this.organization = org;
	}



}
