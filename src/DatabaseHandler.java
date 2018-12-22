import java.util.ArrayList;

public class DatabaseHandler
{
	public static DatabaseHandler db;
	
	public ArrayList<User> userDB = new ArrayList<User>();
	public ArrayList<Item> itemDB = new ArrayList<Item>();
	public ArrayList<Message> msgDB = new ArrayList<Message>();
	
	private DatabaseHandler()
	{
		
	}
	
	public boolean Connect(String connectionString)
	{
		//Connect to database
		return true;
	}
	
	public static DatabaseHandler getInstance()
	{
		if(db != null)
			return db;
		else
			return db = new DatabaseHandler();
	}
}
