package Resuable_methods;

public class Body_data 
{
	private static String create_single_user = "{\r\n" + 
			"    \"name\": \"morpheus\",\r\n" + 
			"    \"job\": \"leader\"\r\n" + 
			"}";
	private static String update_single_user = "{\r\n" + 
			"    \"name\": \"morpheus\",\r\n" + 
			"    \"job\": \"zion resident\"\r\n" + 
			"}";
	
	public static String getCreate_single_user() {
		return create_single_user;
	}

	public static String getUpdate_single_user() {
		return update_single_user;
	}
}
