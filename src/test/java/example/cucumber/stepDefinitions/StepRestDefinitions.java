package example.cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

public class StepRestDefinitions {

    ResponseEntity<String> response;

    private static final String URL = "http://localhost:8080";
    private TestRestTemplate testRestTemplate = null;

    

    @Given("the client calls api greet")
    public void theClientCallsGreet() throws Exception {
        testRestTemplate = new TestRestTemplate();
        response = testRestTemplate.getForEntity(URL + "/greet", String.class);
    }

    @Then("the client receives status code {int}")
    public void theClientReceivesStatusCode(int statusCode) throws Exception {
        Assertions.assertEquals(response.getStatusCode().value(), statusCode);
    }

    @And("the client receives the message {string}")
    public void theClientReceivesTheMessage(String message) throws Exception {
        Assertions.assertEquals(response.getBody(), message);
    }

}
