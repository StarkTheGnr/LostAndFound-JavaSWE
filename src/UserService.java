
public class UserService {

	User user = new User();
	ServerFunctions server = ServerFunctions.getInstance();
	
	UserService(User u)
	{
		user = u; 
	}
	
	public boolean Login(String UserName, String Password)
	{
		
		if(server.Validate(UserName, Password))
			return true;
		else 
			return false;
	}
	
	public boolean Update(String username, String password)
	{
		
		if(server.Update(user.getUsername(), username, user.getPassword(), password))
			return true;
		else 
			return false;
	}
	
	public boolean UploadInformation(String img, String desc)
	{
		this.user.setimageLocation(img);
		this.user.setDescription(desc);
		if (server.Upload(this.user))
			return true;
		else 
			return false;
	}
	
}
