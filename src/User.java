public class User
{
	private String username;
	private String password;
	private String imageLocation;
	private String description;
	
	public User(String user, String pw)
	{
		username = user;
		password = pw;
	}
	public User() {}

	public void setUsername(String UN)
	{
		username = UN;
	}

	public String getUsername()
	{
		return username;
	}

	public void setPassword(String pass)
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
