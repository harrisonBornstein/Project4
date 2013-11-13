
public abstract class Effort {
	
	private String organization;
	private String type = "";

	public String getType()
	{
		return type;
	}
	
	public void setType(String newType)
	{
		this.type = newType;
	}
	
	public String getOrganization()
	{
		return organization;
	}
	
	public void setOrganization(String org)
	{
		this.organization = org;
	}

}
