
public class DatabaseHandler
{
	public static DatabaseHandler db;
	
	public User[] userDB;
	public Item[] itemDB;
	public Message[] msgDB;
	public Conversation[] convDB;
	
	private DatabaseHandler()
	{
		
	}
	
	public static DatabaseHandler getInstance()
	{
		if(db != null)
			return db;
		else
			return db = new DatabaseHandler();
	}
}
