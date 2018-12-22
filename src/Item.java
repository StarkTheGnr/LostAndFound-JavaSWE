package Entities;

public class Item {
	private String category ;
	private String disc ;
	private String image ;
	private Location location ;
	private User foundBy ;
	
	
	public void setCategory(String cat)
	{
		category = cat ;
	}
	public String getCategory()
	{
		return category ;
	}
	
	public void setDiscribtion(String discr)
	{
		disc = discr  ;
	}
	public String setDiscribtion()
	{
		return disc ;
	}
	public void setImage(String img)
	{
		image = img ;
	}
	public String getImage()
	{
		return image ;
	}
	public void setLocation(Location loc)
	{
		location = loc ;
	}
	public String getLocation()
	{
		return location ;
	}
	public void setFoundBy(User user)
	{
		foundBy = user ;
	}
	public String getFoundBy()
	{
		return foundBy ;
	}
}
