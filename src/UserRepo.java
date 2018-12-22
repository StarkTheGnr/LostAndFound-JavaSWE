public class UserRepo
{
	public static boolean SaveUser(User user)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		boolean found = false;
		for(int i = 0; i < handler.userDB.size(); i++)
		{
			if(handler.userDB.get(i).username.Equals(user.username))
			{
				handler.userDB.get(i).username = user.username;
				handler.userDB.get(i).password = user.password;
				handler.userDB.get(i).imgLocation = user.imgLocation;
				handler.userDB.get(i).description = user.description;
				
				found = true;
			}
		}
		
		if(!found)
			handler.userDB.add(user);
		
		return true;
	}
	public static boolean SaveUser(User user, User newUser)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		boolean found = false;
		for(int i = 0; i < handler.userDB.size(); i++)
		{
			if(handler.userDB.get(i).username.Equals(user.username))
			{
				handler.userDB.get(i).username = newUser.username;
				handler.userDB.get(i).password = newUser.password;
				
				found = true;
			}
		}
		
		if(!found)
			handler.userDB.add(newUser);
		
		return true;
	}
	
	public static User LoadItem(String username)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		for(int i = 0; i < handler.userDB.size(); i++)
		{
			if(handler.userDB.get(i).username.Equals(username))
			{
				return handler.userDB.get(i);
			}
		}
		
		return null;
	}
	
	public static boolean CheckIfReg(String username, String password)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		for(int i = 0; i < handler.userDB.size(); i++)
		{
			if(handler.userDB.get(i).username.Equals(username) && handler.userDB.get(i).password.Equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
