
public class ConPaper extends Paper{
	
	private Conference conference;
	private String type;
	
	/**
	 * Constructor
	 */
	public ConPaper()
	{
		this.conference = null;
		this.type = null;
	}
	
	/**
	 * Constructor
	 * 
	 * @param con
	 * @param type
	 */
	public ConPaper(Conference con, String type)
	{
		this.conference = con;
		this.type = type;
	}
	
	
	public void setCon(Conference con)
	{
		this.conference = con;
	}
	
	public Conference getCon()
	{
		return conference;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	
}
