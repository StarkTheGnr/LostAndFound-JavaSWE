
public class ItemService {
	Item item = new Item();
	
	ItemService(Item i)
	{
		item = i;
	}
	public boolean EditItem(Item item)
	{
		if(ItemRepo.RemoveItem(item.id) &&ItemRepo.SaveItem(item))
			return true;
		else
			return false;
	}
	public Item CreatItem(String desc, 	String img, Location loc, String cat, User u)
	{
		Item temp = new Item();
		temp.setDescription(desc);
		temp.setImage(img);
		temp.setLocation(loc);
		temp.setUser(u);
		return temp;
	}
	public void Applyform(User u)
	{
		CreatConversation(this.item.getFoundBy(), u);
	}

}
