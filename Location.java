import java.io.Serializable;


public class Location  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1455718539615193608L;
	private String city;
	private String state;
	private String country;
	/**
	 * Creates a location
	 */
	public Location()
	{
		this.city = null;
		this.state =null;
		this.country = null;
	}
	/**
	 * Creates a location	
	 * @param country string
	 * @param state string
	 * @param city string
	 */
	public Location(String country, String state, String city)
	{
		this.city = city;
		this.state =state;
		this.country = country;
	}
	/**
	 * getter
	 * @return
	 */
	public String getCity()
	{
		return city;
	}
	/**
	 * setter
	 * @param city string
	 */
	public void setCity(String city)
	{
		this.city = city;
	}
	/**
	 * setter
	 * @param state
	 */
	public void setState(String state)
	{
		this.state = state;
	}
	/**
	 * setter
	 * @return
	 */
	public String getState()
	{
		return state;
	}
	/**
	 * setter
	 * @param country
	 */
	public void setCountry(String country)
	{
		this.country = country;
	}
	/**
	 * getter
	 * @return
	 */
	public String getCountry()
	{
		return country;
	}

}
