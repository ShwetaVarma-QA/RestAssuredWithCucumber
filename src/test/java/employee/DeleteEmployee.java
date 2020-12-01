package employee;

import cucumber.methods.DeleteCall;
import cucumber.methods.PostCall;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteEmployee {

    @Given("a employee record is added")
    public void insertEmployee(){
        PostCall.postCallMethod(200);
    }

    @When("the delete endpoint is used")
    public void deleteEndpoint(){ }

    @Then("the employee id {string} is deleted and response status code {int} is returned")
    public void verifyStatus(String id,int code){
        DeleteCall.deleteCallResponse(id,code);
    }

    @Given("a employee record is not added")
    public void noUserAdded(){}

}
