import java.util.ArrayList;
import java.util.List;


public class ConPaper extends Paper{
	
	private Conference conference;
	private String type;
	private List<Scholar> authors;
	private String paperTitle;
	private String serialTitle;
	private String pages;
	private String url;
	private String date;
	
	
	/**
	 * Constructor
	 */
	public ConPaper()
	{
		this.authors = null;
		this.conference = null;
		this.type = null;
	}
	
	/**
	 * Constructor
	 * 
	 * @param con
	 * @param type
	 */
	public ConPaper(ArrayList<Scholar> authors, String paperTitle, String pages, String url, Conference conference, String type)
	{
		this.paperTitle = paperTitle;
		this.pages = pages;
		this.authors = authors;
		this.conference = conference;
		this.type = type;
		this.url = url;
	}
	
	/**
	 * setter
	 * @param con
	 */
	public void setCon(Conference con)
	{
		this.conference = con;
	}
	
	/**
	 * getter
	 * @return
	 */
	public Conference getCon()
	{
		return conference;
	}
	
	/**
	 *setter 
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
	/**
	 * getter
	 */
	public String getType()
	{
		return type;
	}
	
	
}
