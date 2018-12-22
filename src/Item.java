public class Item
{
	private String category;
	private String desc;
	private String image;
	private Location location;
	private User foundBy;

	public void setCategory(String cat)
	{
		category = cat;
	}

	public String getCategory()
	{
		return category;
	}

	public void setDescription(String descr)
	{
		desc = descr;
	}

	public String setDescription()
	{
		return desc;
	}

	public void setImage(String img)
	{
		image = img;
	}

	public String getImage()
	{
		return image;
	}

	public void setLocation(Location loc)
	{
		location = loc;
	}

	public Location getLocation()
	{
		return location;
	}

	public void setFoundBy(User user)
	{
		foundBy = user;
	}

	public User getFoundBy()
	{
		return foundBy;
	}
}
