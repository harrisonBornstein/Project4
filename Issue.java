import java.util.List;


public class Issue {

	private String month;
	private String year;
	private List<Scholar> editors;
	private List<Scholar> reviewers;
	private List<JournalArticle> articles;
	
	/**
	 * null Constructor
	 */
	public Issue()
	{
		this.month = null;
		this.year = null;
		this.editors = null;
		this.reviewers = null;
		this.articles = null;
	}
	
	/**
	 * Constructor
	 * @param month
	 * @param year
	 * @param editors
	 * @param reviewers
	 * @param articles
	 */
	public Issue(String month, String year, List<Scholar> editors, List<Scholar> reviewers, List<JournalArticle> articles)
	{
		this.month = month;
		this.year = year;
		this.editors = editors;
		this.reviewers = reviewers;
		this.articles = articles;
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
	public String getYear()
	{
		return year;
	}
	
	/**
	 * setter
	 * @param year
	 */
	public void setYear(String year)
	{
		this.year = year;
	}
	
	/**
	 * getter
	 * @return
	 */
	public List<Scholar> getEditors()
	{
		return editors;
	}
	
	/**
	 * setter
	 * @param editors
	 */
	public void setEditors(List<Scholar> editors)
	{
		this.editors = editors;
	}
	
	/**
	 * adds param editor to list of editors
	 * @param editor
	 */
	public void addToEditors(Scholar editor)
	{
		editors.add(editor);
	}
	
	/**
	 * getter
	 * @return
	 */
	public List<Scholar> getReviewers()
	{
		return reviewers;
	}
	
	/**
	 * setter
	 * @param reviewers
	 */
	public void setReviewers(List<Scholar> reviewers)
	{
		this.reviewers = reviewers;
	}
	
	/**
	 * adds param reviewer to reviewers
	 * @param reviewer
	 */
	public void addToReviewers(Scholar reviewer)
	{
		reviewers.add(reviewer);
	}
	
	/**
	 * getter
	 * @return
	 */
	public List<JournalArticle> getArticles()
	{
		return articles;
	}
	
	/**
	 * setter
	 * @param articles
	 */
	public void setArticles(List<JournalArticle> articles)
	{
		this.articles = articles;
	}
	
	

}
