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
	public ConPaper(List<Scholar> authors, String paperTitle, String pages, String url, Conference conference, String type)
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
	/**
	 * 
	 * @return List<String> of the authors of the Paper
	 */
	public List<Scholar> getAuthors()
	{
		return this.authors;
	}
	
	/**
	 * 
	 * @return a String containing the Paper's title
	 */
	public String getPaperTitle()
	{
		return this.paperTitle;
	}
	
	/**
	 * 
	 * @return a String containing the Serial title the Paper was in
	 */
	public String getSerialTitle()
	{
		return this.serialTitle;
	}
	
	/**
	 * 
	 * @return a String containing the date the Paper was published
	 */
	public String getDate()
	{
		return this.date;
	}
	
	/**
	 * 
	 * @return a String containing the Paper's url
	 */
	public String getUrl()
	{
		return this.url;
	}
	
	/**
	 * 
	 * @param newAuthors List<String> to be set as the Paper's authors
	 */
	public void setAuthors(List<Scholar> newAuthors)
	{
		this.authors = newAuthors;
	}
	
	/**
	 * 
	 * @param newPaperTitle String to be set as the Paper's title
	 */
	public void setPaperTitle(String newPaperTitle)
	{
		this.paperTitle = newPaperTitle;
	}
	
	/**
	 * 
	 * @param newSerialTitle String to be set as the serial's title that the Paper was published in
	 */
	public void setSerialTitle(String newSerialTitle)
	{
		this.serialTitle = newSerialTitle;
	}
	
	/**
	 * 
	 * @param newDate String to be set as the date the Paper was published
	 */
	public void setDate(String newDate)
	{
		this.date = newDate;
	}
	
	/**
	 * 
	 * @param newUrl String to be set as the url of the Paper
	 */
	public void setUrl(String newUrl)
	{
		this.url = newUrl;
	}
	
	
	
	
}
