import java.util.ArrayList;

public class ItemRepo
{
	public static boolean SaveItem(Item item)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		handler.itemDB.add(item);
		
		return true;
	}
	
	public static Item LoadItem(int id)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		for(int i = 0; i < handler.itemDB.size(); i++)
		{
			if(handler.itemDB.get(i).id == id)
			{
				return handler.itemDB.get(i);
			}
		}
		
		return null;
	}
	
	public static boolean RemoveItem(int id)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		for(int i = 0; i < handler.itemDB.size(); i++)
		{
			if(handler.itemDB.get(i).id == id)
			{
				handler.itemDB.remove(i);
				return true;
			}
		}
		return false;
	}
	public static ArrayList<Item> LoadAllItems()
	{
		 return DatabaseHandler.getInstance().itemDB;
	}
}
