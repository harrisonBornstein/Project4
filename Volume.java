import java.util.List;


public class Volume {

	private List<Issue> issues;
	
	public Volume()
	{
		issues = null;
	}
	
	public Volume(List<Issue> issues)
	{
		this.issues = issues;
	}
	
	public List<Issue> getIssues()
	{
		return issues;
	}
	
	public void setIssues(List<Issue> issues)
	{
		this.issues = issues;
	}
	
	public void addToIssues(Issue issue)
	{
		this.issues.add(issue);
	}


}
