public class User
{
	private String userName;
	private String password;
	private String imageLocation;
	private String description;

	public void setUserName(String UN)
	{
		userName = UN;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setpassword(String pass)
	{
		password = pass;
	}

	public String getPassword()
	{
		return password;
	}

	public void setimageLocation(String imageLoc)
	{
		imageLocation = imageLoc;
	}

	public String getimageLocation()
	{
		return imageLocation;
	}

	public void setDescription(String disc)
	{
		description = disc;
	}

	public String getDescription()
	{
		return description;
	}

}
