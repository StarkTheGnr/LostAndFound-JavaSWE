import java.util.ArrayList;

public class Conversation 
{
	ArrayList<Message> messages = new ArrayList<Message>();
	User owner;
	User finder;
	
	public boolean Accept()
	{
		return true;
	}
	public boolean Decline()
	{
		return true;
	}

}
