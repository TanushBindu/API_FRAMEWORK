package Resuable_methods;
import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
public class Request_and_Response_Spec_builder extends Utiles
{
	public static ResponseSpecification Response_spec()
	{
		ResponseSpecBuilder res_sp = new ResponseSpecBuilder();
		ResponseSpecification r2 = res_sp.expectContentType(ContentType.JSON).build();
		return r2;
	}
	public static RequestSpecification Request_spec() throws IOException
	{
		RequestSpecBuilder req_sp = new RequestSpecBuilder();
		RequestSpecification r1 = req_sp.setBaseUri(Utiles.property_file_value()).setContentType(ContentType.JSON).build();
		return r1;
	}
	
	public static RequestSpecification Request_spec_for_post_put() throws IOException
	{
		RequestSpecBuilder req_sp = new RequestSpecBuilder();
		RequestSpecification r1 = req_sp.setBaseUri(Utiles.property_file_value()).setContentType(ContentType.JSON).setBody(Body_data.getCreate_single_user()).build();
		return r1;
	}
	
	public static RequestSpecification Request_spec_for_delete() throws IOException
	{
		RequestSpecBuilder req_sp = new RequestSpecBuilder();
		RequestSpecification r1 = req_sp.setBaseUri(Utiles.property_file_value()).build();
		return r1;
	}
}
