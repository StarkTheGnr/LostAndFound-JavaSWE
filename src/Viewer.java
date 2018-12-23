import java.util.ArrayList;
import java.util.Scanner;

public class Viewer
{

	public static Scanner input = new Scanner(System.in);
	static ArrayList<Item>  Items = ItemRepo.LoadAllItems();
	public static User u = new User();

	public static void main(String[] args) {
		ServerFunctions server = ServerFunctions.getInstance();
		// TODO Auto-generated method stub
		while (true)
		{
			System.out.print("Please enter the Username");
			u.setUsername(input.nextLine());
			System.out.print("Please enter the password");
			u.setPassword( input.nextLine());
			try
			{
				if (server.Validate(u.getUsername(), u.getPassword()))
				{
					if(!UserRepo.CheckIfReg(u.getUsername(), u.getPassword()))
					{
						UserRepo.SaveUser(u);
						
					}
					System.out.flush();
					while (true)
					{
						System.out.print("Please enter 1 for showing items and 2 for adding item ");
						int answer = input.nextInt();
						input.nextLine();
						if (answer == 1)
						{
							ShowItems();
							System.out.println("Please enter the item's number");
							int n = input.nextInt();
							input.nextLine();
							if (n > Items.size())
							{
								System.out.println("Invalid input Number");
								
							}
							else
							{
								System.out.println("Please enter 1 to showform and 2 to request item");
								int in = input.nextInt();
								input.nextLine();
								if (in  == 1)
								{
									Form form = new Form();
									System.out.println("Please enter your name");
									form.name = input.nextLine();
									System.out.println("Please enter your location's longitude");
									form.location.longitude = input.nextDouble();
									System.out.println("Please enter your location's latitude");
									form.location.latitude = input.nextDouble();
									System.out.println("Please enter your location's altitude");
									form.location.altitude = input.nextDouble();
									input.nextLine();
									System.out.println("Please enter your proof");
									form.proof = input.nextLine();
									if (server.AuthenticateForm(form.name, form.location, form.proof ))
									{
										 if (server.CreateConversation(Items.get(n), u) == 1)
											  server.Accept(Items.get(n));
										 else
											 server.Decline(Items.get(n)); 
											 
									}
									else
									{
										System.out.println("Invalid form inputs");
									}
									
								}
								else if (in == 2)
								{
									
								}
							}
						}
						else if (answer == 2)
						{
							Item i = new Item();
							System.out.print("please enter item category");
							i.setCategory(input.nextLine());
							System.out.print("please enter item desc");
							i.setDescription(input.nextLine());
							System.out.print("please enter item image link");
							i.setImage(input.nextLine());
							Location l = new Location();
		 					System.out.print("please enter item location longitude");
		 					l.longitude = input.nextDouble();
		 					System.out.print("please enter item location latitude");
		 					l.latitude = input.nextDouble();
		 					System.out.print("please enter item location altitude");
		 					l.altitude = input.nextDouble();
							i.setLocation(l);
							i.setFoundBy(u);
							Items.add(i);
						}
						else
						{
							System.out.print("Invalid input");
						}
					}		
				}
				else
				{
					System.out.println("Invalid input");
					continue;
				}
			}
			catch(LoginException e)
			{
				
			}
		}
		
	}

	public static boolean ShowItems()
	{
		for (int i = 0; i < Items.size(); i++)
		{
			System.out.print("ID: " + Items.get(i).id + " 	");
			System.out.print("Category: " + Items.get(i).getCategory() + " 	");
			System.out.print("Image link: " + Items.get(i).getImage() + " 	");
			System.out.print("Item's user: " + Items.get(i).getFoundBy().getUsername() + " 	");
			System.out.print("Items's loacation latitude: " + Items.get(i).getLocation().latitude + " , longitude : "
					+ Items.get(i).getLocation().longitude + " , altitude : " + Items.get(i).getLocation().altitude
					+ "\n");

		}
		return true;

	}

	public static int CreateConversation(User itemuser, User u)
	{
		String con = "";
		Conversation c = new Conversation();
		c.owner = itemuser;
		c.finder = u;
		while (con.compareTo("end") != 0)
		{
			Message temp = new Message();
			temp.from = u;
			temp.to = itemuser;
			System.out.println("finder");
			temp.body = input.nextLine();
			c.messages.add(temp);
			System.out.println("owner");
			temp.from = itemuser;
			temp.to = u;
			temp.body = input.nextLine();
			c.messages.add(temp);
			System.out.println("Please enter end to end");
			con = input.nextLine();
		}
		System.out.println("Please enter 1 to accept 0 to decline");
		return input.nextInt();

	}

}
