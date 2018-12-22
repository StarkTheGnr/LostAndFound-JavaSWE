
public class ConversationRepo
{
	public static Conversation LoadConversation(String from, String to)
	{
		DatabaseHandler handler = DatabaseHandler.getInstance();
		
		Conversation result = new Conversation();
		
		for(int i = 0; i < handler.msgDB.size(); i++)
		{
			if((handler.msgDB.get(i).from.Equals(from) || handler.msgDB.get(i).from.Equals(to)) && (handler.msgDB.get(i).to.Equals(from) || handler.msgDB.get(i).to.Equals(to)))
			{
				result.Messages.add(handler.msgDB.get(i));
			}
		}
		
		return result;
	}
}
