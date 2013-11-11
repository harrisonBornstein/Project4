import java.util.ArrayList;
import java.util.List;


public class JournalArticle extends Paper {

	private Journal journal;
	private String type;
	private List<Scholar> authors;
	private String paperTitle;
	private String serialTitle;
	private String pages;
	private String url;
	private String date;
	
	public JournalArticle()
	{
		this.journal = null;
		this.type = null;
	}
	
	public JournalArticle(ArrayList<Scholar> authors, String paperTitle, String pages, String url, Journal journal, String type)
	{
		this.paperTitle = paperTitle;
		this.pages = pages;
		this.authors = authors;
		this.journal = journal;
		this.type = type;
		this.url = url;
	}
	
	public void setJournal(Journal journal)
	{
		this.journal = journal;
	}
	
	public Journal getJournal()
	{
		return journal;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	

}
