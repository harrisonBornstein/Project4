import java.util.List;


public class Meeting {

	private String month;
	private String year;
	private Location location;
	private List<Scholar> chairs;
	private List<Scholar> members;
	private List<ConPaper> conPapers;
	
	public Meeting()
	{
		this.month = null;
		this.year = null;
		this.location =null;
		this.chairs = null;
		this.members = null;
		this.conPapers = null;
	}
	
	public Meeting(String year, String month, Location location, List<Scholar> chairs, List<Scholar> members, List<ConPaper> conPapers)
	{
		this.month = month;
		this.year = year;
		this.location =location;
		this.chairs = chairs;
		this.members = members;
		this.conPapers = conPapers;
	}
	
	public void setMonth(String month)
	{
		this.month = month;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public void setYear(String year)
	{
		this.year = year;
	}
	
	public Location getLocation()
	{
		return location;
	}
	
	public void setLocation(Location location)
	{
		this.location = location;
	}
	
	public List<Scholar> getChairs()
	{
		return chairs;
	}
	
	public void setChairs(List<Scholar> chairs)
	{
		this.chairs = chairs;
	}
	
	public List<Scholar> getMembers()
	{
		return chairs;
	}
	
	public void setMembers(List<Scholar> members)
	{
		this.members = members;
	}
	public List<ConPaper> getConPapers()
	{
		return conPapers;
	}
	
	public void setConPaper(List<ConPaper> papers)
	{
		this.conPapers = papers;
	}
	
	public void addToChairs(Scholar chair)
	{
		this.chairs.add(chair);
	}
	
	public void addToMembers(Scholar member)
	{
		this.members.add(member);
	}
	
	public void addToConPapers(ConPaper paper)
	{
		this.conPapers.add(paper);
	}
	
	
	

}
