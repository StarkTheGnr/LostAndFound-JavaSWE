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
}
