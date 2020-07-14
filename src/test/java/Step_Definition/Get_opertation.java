package Step_Definition;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import POJO.Single_user;
import Resuable_methods.Endpoints;
import Resuable_methods.Request_and_Response_Spec_builder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Get_opertation
{
    private static RequestSpecification a1;
	private static Response res;
	public Single_user a2;
	@Given("^user enter the ReqRes baseURI and Content Type$")
    public void user_enter_the_reqres_baseuri_and_content_type() throws Throwable
    {
       a1 = given().spec(Request_and_Response_Spec_builder.Request_spec());
    }
	@When("user enters the List of user endpoind with GET http request")
	public void user_enters_the_list_of_user_endpoind_with_get_http_request()
    {
		String a = Endpoints.valueOf("list_of_user").get_End();
    	res = a1.when().get(a).then()
    	.spec(Request_and_Response_Spec_builder.Response_spec()).extract().response();
    }
	
	@When("^user enters the Single user endpoind with GET http request$")
    public void user_enters_the_single_user_endpoind_with_get_http_request() throws Throwable 
    {
		String a = Endpoints.valueOf("single_user").get_End();
		res = a1.when().get(a).then()
		    	.spec(Request_and_Response_Spec_builder.Response_spec()).extract().response();
		a2 = res.as(Single_user.class);
    }
	@Then("^user should get the 200$")
    public void user_should_get_the_200() throws Throwable 
    {
    	assertEquals(200, res.statusCode());
    	assertNotEquals(401, res.getStatusCode());
    	System.out.println(res.asString());
    	System.out.println("**************Scenario one Excituion over*************");
    }
}
