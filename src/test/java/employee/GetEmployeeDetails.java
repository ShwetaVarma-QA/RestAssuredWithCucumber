package employee;

import cucumber.methods.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetEmployeeDetails {
    @Given("We have a employees added")
    public void getTheResponse() {
        System.out.println("api api");
    }

    @When("the get endpoint is used")
    public void response() {
        System.out.println("Got api");
    }

    @Then("details of employee with status code is received")
    public void responseVerify() {
        GetCall.callGetWithQueryParam("1", 200);
    }

    @Then("details of employees with status code {int} is received")
    public void fetchDetails(int code){
        GetCall.callGet(200);
    }

    @Then("details of employee with id {string} and status code {int} is received")
    public void singleEmployee(String id, int code){
        GetCall.callGetWithQueryParam(id,code);
    }

    @Then("status code {int} is received")
    public void noRecord(int code){
        GetCall.callGetWithQueryParam("",code);
    }
}

