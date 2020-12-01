package employee;

import cucumber.methods.PostCall;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateEmployeeRecord {

    @Given("the valid json is passed")
    public void getTheResponse() {
        System.out.println("");
    }

    @When("the create endpoint is used")
    public void response() {
        System.out.println("");
    }

    @Then("response status code {int} is returned")
    public void responseVerify(int code) {
        PostCall.postCallMethod(code);
    }
}

