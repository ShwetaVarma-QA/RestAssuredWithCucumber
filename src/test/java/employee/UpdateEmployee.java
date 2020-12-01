package employee;

import cucumber.methods.PostCall;
import cucumber.methods.PutCall;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateEmployee {


    @Given("a employee record is already added")
    public void createRecord() {
        PostCall.postCallMethod(200);
    }

    @When("the update endpoint is used")
    public void setEndpoint() { }

    @Then("the employee with id {string} is updated and response status code {int} is returned")
    public void verifyUpdate(String id, int code) {
        PutCall.putCallMethod(id, code);
    }
}
