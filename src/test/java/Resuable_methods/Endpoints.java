package Resuable_methods;

public enum Endpoints 
{
	list_of_user("/api/users?page=2"),
	single_user("/api/users/2"),
	create_single_user("/api/users");
	String end;
	Endpoints(String end)
	{
		this.end = end;
	}
	
	public String get_End()
	{
		return end;
	}
}
