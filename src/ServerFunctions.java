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
	
	public boolean Validate(String username, String password)
	{
		if(username.length() > 18 || username.length() < 3 || password.length() > 18 || password.length() < 3)
			return false;
		
		if(!UserRepo.CheckIfReg(username, password))
			return false;
		
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
		ItemRepo.SaveItem(item);
	}
	public boolean Accept(Item item)
	{
		ItemRepo.RemoveItem(item.id);
		return Viwer.EndConversation();
	}
	public boolean Decline(Item item)
	{
		return Viwer.EndConversation();
	}
	public void CreatConversation(Item item, User u)
	{
		Viwer.CreatConversation(item.getFoundby(), u);
	}
	
}
