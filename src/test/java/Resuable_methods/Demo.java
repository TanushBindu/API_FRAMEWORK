package Resuable_methods;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class Demo 
{
	public static void main(String[] args) 
	{
		Response res = given().spec(Request_and_Response_Spec_builder.Request_spec()).when().get("/api/users?page=2")
		.then().spec(Request_and_Response_Spec_builder.Response_spec()).extract().response();
		System.out.println(res.asString());
	}
}
