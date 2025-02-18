package framework.stepDefinition;

// package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.testng.Assert;

public class APISteps {
    private Response response;

    @Given("I set up the API request")
    public void i_set_up_the_api_request() {
        baseURI = "https://reqres.in/api";
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request(String endpoint) {
        response = given().when().get(endpoint);
    }

    @Then("The response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
        Assert.assertEquals(response.getStatusCode(), statusCode.intValue());
    }
    
}
