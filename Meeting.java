import java.io.Serializable;
import java.util.List;


public class Meeting implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 270478599025624685L;
	private String month;
	private String year;
	private Location location;
	private List<Scholar> chairs;
	private List<Scholar> members;
	private List<ConPaper> conPapers;
	/**
	 * creates a meeting
	 */
	public Meeting()
	{
		this.month = null;
		this.year = null;
		this.location =null;
		this.chairs = null;
		this.members = null;
		this.conPapers = null;
	}
	/**
	 * creates a meeting
	 * @param year
	 * @param month
	 * @param location
	 * @param chairs
	 * @param members
	 * @param conPapers
	 */
	public Meeting(String year, String month, Location location, List<Scholar> chairs, List<Scholar> members, List<ConPaper> conPapers)
	{
		this.month = month;
		this.year = year;
		this.location =location;
		this.chairs = chairs;
		this.members = members;
		this.conPapers = conPapers;
	}
	/**
	 * setter
	 * @param month
	 */
	public void setMonth(String month)
	{
		this.month = month;
	}
	/**
	 * getter
	 * @return
	 */
	public String getMonth()
	{
		return month;
	}
	/**
	 * getter
	 * @return
	 */
	public String getYear()
	{
		return year;
	}
	/**
	 * setter
	 * @return
	 */
	public void setYear(String year)
	{
		this.year = year;
	}
	/**
	 * getter
	 * @return
	 */
	public Location getLocation()
	{
		return location;
	}
	/**
	 * setter
	 * @return
	 */
	public void setLocation(Location location)
	{
		this.location = location;
	}
	/**
	 * getter
	 * @return
	 */
	public List<Scholar> getChairs()
	{
		return chairs;
	}
	/**
	 * setter
	 * @return
	 */
	public void setChairs(List<Scholar> chairs)
	{
		this.chairs = chairs;
	}
	/**
	 * getter
	 * @return
	 */
	public List<Scholar> getMembers()
	{
		return chairs;
	}
	/**
	 * setter
	 * @return
	 */
	public void setMembers(List<Scholar> members)
	{
		this.members = members;
	}
	/**
	 * getter
	 * @return
	 */
	public List<ConPaper> getConPapers()
	{
		return conPapers;
	}
	/**
	 * setter
	 * @return
	 */
	public void setConPaper(List<ConPaper> papers)
	{
		this.conPapers = papers;
	}
	/**
	 * adds a scholar to the list of chairs 
	 * @return
	 */
	public void addToChairs(Scholar chair)
	{
		this.chairs.add(chair);
	}
	/**
	 * adds a scholar to the list of members
	 * @param member
	 */
	public void addToMembers(Scholar member)
	{
		this.members.add(member);
	}
	/**
	 * Adds a paper to the list of conPapers
	 * @param paper
	 */
	public void addToConPapers(ConPaper paper)
	{
		this.conPapers.add(paper);
	}
	
	
	

}
