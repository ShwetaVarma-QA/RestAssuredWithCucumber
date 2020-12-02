package cucumber.methods;

import cucumber.*;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class GetCall {

    public static void callGetWithQueryParam(String employeeId, int statusCode) {
        given()
                .when()
                .get(RetriveUrl.retriveTheUrl("getEmployeeUrl") + employeeId)
                .then()
                .assertThat().statusCode(statusCode)
                .assertThat().contentType("application/json")
                .assertThat().time(lessThan(5000L), TimeUnit.MILLISECONDS);

         System.out.println(" time " + get(RetriveUrl.retriveTheUrl("getEmployeeUrl") + employeeId).timeIn(TimeUnit.MILLISECONDS));
    }

    public static void callGet(int statusCode) {
        given()
                .when()
                .get(RetriveUrl.retriveTheUrl("getAllEmployee"))
                .then()
                .assertThat().statusCode(statusCode)
                .assertThat().contentType("application/json")
                .assertThat().time(lessThan(5000L), TimeUnit.MILLISECONDS);
        System.out.println("time for get call : " + get(RetriveUrl.retriveTheUrl("getAllEmployee")).timeIn(TimeUnit.MILLISECONDS));
    }
}
