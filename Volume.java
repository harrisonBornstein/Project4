import java.util.List;


public class Volume {

	private List<Issue> issues;
	
	/**
	 * null Constructor
	 */
	public Volume()
	{
		issues = null;
	}
	
	/**
	 * Constructor
	 * @param issues
	 */
	public Volume(List<Issue> issues)
	{
		this.issues = issues;
	}
	
	/**
	 * getter
	 * @return List<Issue>
	 */
	public List<Issue> getIssues()
	{
		return issues;
	}
	
	/**
	 * setter
	 * @param issues
	 */
	public void setIssues(List<Issue> issues)
	{
		this.issues = issues;
	}
	
	/**
	 * adds issue to issues
	 * @param issue
	 */
	public void addToIssues(Issue issue)
	{
		this.issues.add(issue);
	}


}
