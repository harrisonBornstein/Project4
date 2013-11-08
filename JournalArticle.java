
public class JournalArticle {

	private Journal journal;
	private String type;
	
	public JournalArticle()
	{
		this.journal = null;
		this.type = null;
	}
	
	public JournalArticle(Journal journal, String type)
	{
		this.journal = journal;
		this.type = type;
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
