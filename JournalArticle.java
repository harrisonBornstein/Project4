import java.util.ArrayList;
import java.util.List;


public class JournalArticle {

	private Journal journal;
	private String type;
	private List<Scholar> authors;
	private String paperTitle;
	private String serialTitle;
	private String pages;
	private String url;
	private String date;
	
	/**
	 * null Constructor
	 */
	public JournalArticle()
	{
		this.journal = null;
		this.type = null;
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
	public JournalArticle(ArrayList<Scholar> authors, String paperTitle, String pages, String url, Journal journal, String type)
	{
		this.paperTitle = paperTitle;
		this.pages = pages;
		this.authors = authors;
		this.journal = journal;
		this.type = type;
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
	 * getter
	 * @return
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * setter
	 * @param type
	 */
	public void setType(String type)
	{
		this.type = type;
	}
	
	

}
