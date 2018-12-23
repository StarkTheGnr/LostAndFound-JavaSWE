
public class SQLException extends Exception
{
	String message;
	
	public SQLException(String s)
	{
		message = s;
	}
	
	public void SetMessage(String s)
	{
		message = s;
	}
	
	public String GetMessage()
	{
		return message;
	}
}
