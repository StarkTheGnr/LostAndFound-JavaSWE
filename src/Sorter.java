import java.util.ArrayList;

public class Sorter
{
	int type;
	
	public ArrayList<Item> SortByCategory(ArrayList<Item> items, String cat)
	{
		ArrayList<Item> result = new ArrayList<Item>();
		
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i).getCategory().equals(cat))
				result.add(items.get(i));
		}
		
		return result;
	}
	
	public ArrayList<Item> SearchByLocation(ArrayList<Item> items, Location loc)
	{
		ArrayList<Item> result = new ArrayList<Item>();
		
		for(int i = 0; i < items.size(); i++)
		{
			Location itemLoc = items.get(i).getLocation();
			if(Math.abs(itemLoc.longitude - loc.longitude) < 2 && Math.abs(itemLoc.latitude - loc.latitude) < 2 && Math.abs(itemLoc.altitude - loc.altitude) < 2)
				result.add(items.get(i));
		}
		
		return result;
	}
	
	public ArrayList<Item> SearchByTitle(ArrayList<Item> items, String title)
	{
		ArrayList<Item> result = new ArrayList<Item>();
		
		for(int i = 0; i < items.size(); i++)
		{
			if(items.get(i).getDescription().contains(title))
				result.add(items.get(i));
		}
		
		return result;
	}
}
