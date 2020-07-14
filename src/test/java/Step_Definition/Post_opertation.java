package Step_Definition;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import Resuable_methods.Endpoints;
import Resuable_methods.Request_and_Response_Spec_builder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Post_opertation 
{
	private RequestSpecification a1;
	private Response res;
	@Given("^user enter the ReqRes baseURI,Content Type and body$")
    public void user_enter_the_reqres_baseuricontent_type_and_body() throws Throwable 
	{
		a1 = given().spec(Request_and_Response_Spec_builder.Request_spec_for_post_put());
    }
    @When("^user enters the create Single user endpoind with POST http request$")
    public void user_enters_the_create_single_user_endpoind_with_post_http_request() throws Throwable 
    {
    	String a = Endpoints.valueOf("create_single_user").get_End();
    	res = a1.when().post(a).then()
    	    	.spec(Request_and_Response_Spec_builder.Response_spec()).extract().response();
    }
    @Then("^user should get the 201$")
    public void user_should_get_the_201() throws Throwable 
    {
    	assertEquals(201, res.statusCode());
    	assertNotEquals(401, res.getStatusCode());
    	System.out.println(res.asString());
    	System.out.println("**************Scenario one Excituion over*************");
    }
}