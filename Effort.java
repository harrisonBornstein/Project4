import java.io.Serializable;


public abstract class Effort implements Serializable  {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2454844493358322483L;
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
