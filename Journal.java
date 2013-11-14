import java.util.List;


public class Journal extends Effort{
	
	private String organization;
	private Location location;
	private List<Volume> volumes;
	private String type = "Journal";
	
	/**
	 * null constructor
	 */
	public Journal()
	{
		this.organization = null;
		this.location = null;
		this.volumes = null;
	}
	
	/**
	 * Constructor
	 * @param organization
	 * @param location
	 * @param volumes
	 */
	public Journal(String organization, Location location, List<Volume> volumes)
	{
		this.organization = organization;
		this.location = location;
		this.volumes = volumes;
		this.type = "Journal";
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
	 */
	public void setOrganization(String organization)
	{
		this.organization = organization;
	}
	
	/**
	 * getter
	 * @return
	 */
	public Location getLocation()
	{
		return location;
	}
	
	/**
	 * setter
	 * @param location
	 */
	public void setLocation(Location location)
	{
		this.location = location;
	}
	
	/**
	 * setter
	 * @param volumes
	 */
	public void setVolumes(List<Volume> volumes)
	{
		this.volumes = volumes;
	}
	
	/**
	 * getter
	 * @return
	 */
	public List<Volume> getVolumes()
	{
		return volumes;
	}
	
	/**
	 * adds param volumes to list of volumes
	 * @param volume
	 */
	public void addToVolmes(Volume volume)
	{
		this.volumes.add(volume);
	}
	
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
	

	
}
