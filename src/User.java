package Entities;

public class User {
	private String userName ;
	private String password ;
	private String imageLocation ;
	private String dscribtion ;
	
	
	public void setUserName(String UN)
	{
		userName = UN ;
	}
	public String getUserName()
	{
		return userName ;
	}
	
	public void setpassword(String pass)
	{
		password = pass ;
	}
	public String getPassword()
	{
		return password ;
	}
	
	public void setimageLocation(String imageLoc)
	{
		imageLocation = imageLoc ;
	}
	public String getimageLocation()
	{
		return imageLocation ;
	}
	
	public void setdscribtion(String disc)
	{
		dscribtion = disc ;
	}
	public String getdscribtion()
	{
		return dscribtion ;
	}
	

}
