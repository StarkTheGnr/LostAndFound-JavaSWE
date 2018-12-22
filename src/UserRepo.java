public class UserRepo
{
	public static boolean SaveUser(User user)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();

		boolean found = false;
		for (int i = 0; i < handler.userDB.size(); i++)
		{
			if (handler.userDB.get(i).getUsername().equals(user.getUsername()))
			{
				handler.userDB.get(i).setUsername(user.getUsername());
				handler.userDB.get(i).setPassword(user.getPassword());
				handler.userDB.get(i).setimageLocation(user.getimageLocation());
				handler.userDB.get(i).setDescription(user.getDescription());

				found = true;
			}
		}

		if (!found)
			handler.userDB.add(user);

		return true;
	}

	public static boolean SaveUser(User user, User newUser)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();

		for (int i = 0; i < handler.userDB.size(); i++)
		{
			if (handler.userDB.get(i).getUsername().equals(user.getUsername()))
			{
				handler.userDB.get(i).setUsername(newUser.getUsername());
				handler.userDB.get(i).setPassword(newUser.getPassword());

				break;
			}
		}

		return true;
	}

	public static User LoadItem(String username)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();

		for (int i = 0; i < handler.userDB.size(); i++)
		{
			if (handler.userDB.get(i).getUsername().equals(username))
			{
				return handler.userDB.get(i);
			}
		}

		return null;
	}

	public static boolean CheckIfReg(String username, String password)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();

		for (int i = 0; i < handler.userDB.size(); i++)
		{
			if (handler.userDB.get(i).getUsername().equals(username) && handler.userDB.get(i).getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
