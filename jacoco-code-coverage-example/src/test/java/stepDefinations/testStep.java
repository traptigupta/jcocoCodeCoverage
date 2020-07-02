package stepDefinations;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.when;

import java.util.Map;

import static org.hamcrest.Matchers.equalTo;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testStep {
	

	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request=RestAssured.given();
    private String ENDPOINT_TEST = "http://localhost:8082/test";
 
	

	
	@Then("^the status code is (\\d+)$")
	public void the_status_code_is(int statusCode) throws Throwable {
		/*
		 * json = response.then().statusCode(statusCode); int responseCode =
		 * response.getStatusCode(); System.out.println("response: done "+responseCode);
		 * Assert.assertEquals("got status code 200", statusCode, responseCode);
		 */
	  
	}
	
	

	@And("^response includes this \"([^\"]*)\"$")
	public void responseIncludesThis(String responseFields) throws Throwable {
		//System.out.println(""+responseFields);
		 Assert.assertEquals("response check", responseFields, response.prettyPrint());
	}

	


	@Given("^a test method request prepared with (\\d+)$")
	public void aTestMethodRequestPreparedWith(int param) throws Throwable {
		ENDPOINT_TEST = ENDPOINT_TEST +"/"+param;
	}


	@When("^a user retrieves the test method$")
	public void aUserRetrievesTheTestMethod() throws Throwable {
		//throw new PendingException();
		response = request.when().get(ENDPOINT_TEST);
		System.out.println("response: " + response.prettyPrint());
	}




}
