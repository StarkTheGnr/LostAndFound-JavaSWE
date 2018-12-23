
public class LoginException extends Exception
{
	String message;
	
	public LoginException(String s)
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
