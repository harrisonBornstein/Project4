import java.util.List;


public class Conference extends Effort {
	
	private String organization;
	private List<Meeting> meetings;
	private String type;
	
	
	public Conference(String organization, List<Meeting> meetings)
	{
		this.organization = organization;
		this.meetings = meetings;
		this.type = "Conference";
		
	}
	
	public void setMeetings(List<Meeting> meetings)
	{
		this.meetings = meetings;
	}
	
	public List<Meeting> getMeetings()
	{
		return meetings;
	}
	
	public void addToMeetings(Meeting meeting)
	{
		this.meetings.add(meeting);
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String newType)
	{
		this.type = newType;
	}
	
	public String getOrganization()
	{
		return organization;
	}
	
	public void setOrganization(String org)
	{
		this.organization = org;
	}



}
