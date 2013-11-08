import java.util.List;


public class Journal extends Effort{
	
	private String organization;
	private Location location;
	private List<Volume> volumes;
	
	public Journal()
	{
		this.organization = null;
		this.location = null;
		this.volumes = null;
	}
	
	public Journal(String organization, Location location, List<Volume> volumes)
	{
		this.organization = organization;
		this.location = location;
		this.volumes = volumes;
	}
	
	public String getOrganization()
	{
		return organization;
	}
	
	public void setOrganization(String organization)
	{
		this.organization = organization;
	}
	
	public Location getLocation()
	{
		return location;
	}
	
	public void setLocation(Location location)
	{
		this.location = location;
	}
	
	public void setVolumes(List<Volume> volumes)
	{
		this.volumes = volumes;
	}
	
	public List<Volume> getVolumes()
	{
		return volumes;
	}
	
	public void addToVolmes(Volume volume)
	{
		this.volumes.add(volume);
	}
	
}
