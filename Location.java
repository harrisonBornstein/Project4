
public class Location {
	
	private String city;
	private String state;
	private String country;
	
	public Location()
	{
		this.city = null;
		this.state =null;
		this.country = null;
	}
	
	public Location(String country, String state, String city)
	{
		this.city = city;
		this.state =state;
		this.country = country;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public String getState()
	{
		return state;
	}
	
	public void setCountry(String country)
	{
		this.country = country;
	}
	
	public String getCountry()
	{
		return country;
	}

}
