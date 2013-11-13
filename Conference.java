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



}
