
public abstract class Effort {
	
	private String organization;
	private String type = "";

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
	 * @param newType
	 */
	public void setType(String newType)
	{
		this.type = newType;
	}
	
	/**
	 * getter
	 * @return
	 */
	public String getOrganization()
	{
		return organization;
	}
	
	/**
	 * setter
	 * @param org
	 */
	public void setOrganization(String org)
	{
		this.organization = org;
	}

}
