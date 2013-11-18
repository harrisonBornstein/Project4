import java.util.List;


public class JournalArticle extends Paper {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8269351747538007807L;
	private Journal journal;
	private final String type = "Journal Article";
	private List<Scholar> authors;
	private String paperTitle;
	private String serialTitle;
	private String url;
	private String date;
	private String pages;
	
	/**
	 * null Constructor
	 */
	public JournalArticle()
	{
		this.journal = null;
		
	}
	
	/**
	 * Constructor
	 * @param authors
	 * @param paperTitle
	 * @param pages
	 * @param url
	 * @param journal
	 * @param type
	 */
	public JournalArticle(List<Scholar> authors, String paperTitle, String pages, String url, Journal journal)
	{
		this.paperTitle = paperTitle;
		this.authors = authors;
		this.journal = journal;
		this.pages = pages;
		this.url = url;
	}
	
	/**
	 * setter
	 * @param journal
	 */
	public void setJournal(Journal journal)
	{
		this.journal = journal;
	}
	
	/**
	 * getter
	 * @return
	 */
	public Journal getJournal()
	{
		return journal;
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
	
	/**
	 * getter
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getPages()
	{
		return pages;
	}
	
	
	
	
	

}
