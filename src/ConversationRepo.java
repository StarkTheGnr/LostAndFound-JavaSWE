
public class ConversationRepo
{
	public static Conversation LoadConversation(String from, String to)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		Conversation result = new Conversation();
		
		for(int i = 0; i < handler.msgDB.size(); i++)
		{
			if((handler.msgDB.get(i).from.equals(from) || handler.msgDB.get(i).from.equals(to)) && (handler.msgDB.get(i).to.equals(from) || handler.msgDB.get(i).to.equals(to)))
			{
				result.messages.add(handler.msgDB.get(i));
			}
		}
		
		return result;
	}
}
