package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIDefinition {

    @Given("I create a Rest Api call having specification")
    public void i_create_a_rest_api_call_having_specification() {
       System.out.println("Step1");
    }

    @Then("Send {string} request")
    public void send_request(String string) {
        System.out.println("Step2");
    }

    @Given("Do some background")
    public void doSomeBackground() {
        System.out.println("Background");
    }
}
