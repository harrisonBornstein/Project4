import java.util.List;


public class Scholar {

	private String fullName;
	private String secondaryName;
	private String primaryName;
	private List<String> institutions;
	private List<String> researchAreas;
	private List<Paper> papers;
	private List<Effort> efforts;
	
	public Scholar()
	{
		this.fullName = null;
		this.secondaryName = null;
		this.primaryName = null;
		this.institutions = null;
		this.researchAreas = null;
		this.papers = null;
		this.efforts = null;
	}
	
	public Scholar(String fullName, String secondarName, String primaryName, List<String> institutions, List<String> researchAreas, List<Paper> papers, List<Effort> efforts)
	{
		this.fullName = fullName;
		this.secondaryName = secondaryName;
		this.primaryName = primaryName;
		this.institutions = institutions;
		this.researchAreas = researchAreas;
		this.papers = papers;
		this.efforts = efforts;
	}
	
	public String getFullName()
	{
		return fullName;
	}
	
	public String getSecondaryName()
	{
		return secondaryName;
	}
	
	public String getPrimaryName()
	{
		return primaryName;
	}
	
	public List<String> getInstitutions()
	{
		return institutions;
	}
	
	public List<String> getResearchAreas()
	{
		return researchAreas;
	}
	
	public List<Paper> getPapers()
	{
		return papers;
	}
	
	public List<Effort> getEfforts()
	{
		return efforts;
	}
	
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}
	
	public void setSecondaryName(String secondaryName)
	{
		this.secondaryName = secondaryName;
	}
	
	public void setPrimaryName(String primaryName)
	{
		this.primaryName = primaryName;
	}
	
	public void setInstitutions(List<String> institutions)
	{
		this.institutions = institutions;
	}
	
	public void setResearchAreas(List<String> researchAreas)
	{
		this.researchAreas = researchAreas;
	}
	
	public void setPapers(List<Paper> papers)
	{
		this.papers = papers;
	}
	
	public void setEfforts(List<Effort> efforts)
	{
		this.efforts = efforts;
	}
	
	public void addToEfforts(Effort effort)
	{
		this.efforts.add(effort);
	}
	
	public void addToInstitutions(String institution)
	{
		this.institutions.add(institution);
	}
	
	public void addToResearchAreas(String researchArea)
	{
		this.researchAreas.add(researchArea);
	}
	
	public void addToPapers(Paper paper)
	{
		this.papers.add(paper);
	}
	
	
}
