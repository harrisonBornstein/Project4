import java.util.List;


public class Issue {

	private String month;
	private String year;
	private List<Scholar> editors;
	private List<Scholar> reviewers;
	private List<JournalArticle> articles;
	
	public Issue()
	{
		this.month = null;
		this.year = null;
		this.editors = null;
		this.reviewers = null;
		this.articles = null;
	}
	
	public Issue(String month, String year, List<Scholar> editors, List<Scholar> reviewers, List<JournalArticle> articles)
	{
		this.month = month;
		this.year = year;
		this.editors = editors;
		this.reviewers = reviewers;
		this.articles = articles;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public void setMonth(String month)
	{
		this.month = month;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public void setYear(String year)
	{
		this.year = year;
	}
	
	public List<Scholar> getEditors()
	{
		return editors;
	}
	
	public void setEditors(List<Scholar> editors)
	{
		this.editors = editors;
	}
	
	public void addToEditors(Scholar editor)
	{
		editors.add(editor);
	}
	
	public List<Scholar> getReviewers()
	{
		return reviewers;
	}
	
	public void setReviewers(List<Scholar> reviewers)
	{
		this.reviewers = reviewers;
	}
	
	public void addToReviewers(Scholar reviewer)
	{
		reviewers.add(reviewer);
	}
	
	public List<JournalArticle> getArticles()
	{
		return articles;
	}
	
	public void setArticles(List<JournalArticle> articles)
	{
		this.articles = articles;
	}
	
	

}
