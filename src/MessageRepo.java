
public class MessageRepo
{
	public static boolean SaveMessage(Message msg)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		handler.msgDB.add(msg);
		
		return true;
	}
	
	public static Message LoadItem(int id)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		for(int i = 0; i < handler.msgDB.size(); i++)
		{
			if(handler.msgDB.get(i).id == id)
			{
				return handler.msgDB.get(i);
			}
		}
		
		return null;
	}
	
	public static boolean RemoveItem(int id)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		for(int i = 0; i < handler.msgDB.size(); i++)
		{
			if(handler.msgDB.get(i).id == id)
			{
				handler.msgDB.remove(i);
				return true;
			}
		}
		return false;
	}
}
