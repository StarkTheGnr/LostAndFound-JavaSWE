public class ServerFunctions
{
	public static ServerFunctions instance;
	
	private ServerFunctions() {}
	
	public static ServerFunctions getInstance()
	{
		if(instance != null)
			return instance;
		else
			return instance = new ServerFunctions();
	}
	
	public boolean Validate(String username, String password) throws LoginException
	{
		if(username.length() > 18 || username.length() < 3 || password.length() > 18 || password.length() < 3)
			throw new LoginException("Login information invalid!");	
		
		return true;
	}
	
	public boolean Update(String newUN, String oldUN, String newPW, String oldPW)
	{
		return UserRepo.SaveUser(new User(oldUN, oldPW), new User(newUN, newPW));
	}
	
	public boolean Upload(User user)
	{
		return UserRepo.SaveUser(user);
	}
	
	public boolean AuthenticateForm(String name, Location location, String proof)
	{
		if(name.length() == 0 || name.length() > 50 || location == null || proof.equals(""))
			return false;
		
		return true;
	}
	
	public boolean SaveItem(Item item)
	{
		return ItemRepo.SaveItem(item);
	}
	public boolean Accept(Item item)
	{
		return ItemRepo.RemoveItem(item.id);
	}
	public boolean Decline(Item item)
	{
		return true;
	}
	public int CreateConversation(Item item, User u)
	{
		return Viewer.CreateConversation(item.getFoundBy(), u);
	}
	
}
