package cucumber.methods;

import cucumber.*;

import static io.restassured.RestAssured.given;

public class GetCall {

    public static void callGetWithQueryParam(String employeeId, int statusCode){
        given()
                .when()
                .get(RetriveUrl.retriveTheUrl("getEmployeeUrl")+employeeId)
                .then()
                .assertThat().statusCode(statusCode)
                .assertThat().contentType("application/json");

        //  System.out.println(" time " + get(URL).timeIn(TimeUnit.MILLISECONDS));
    }

    public static void callGet(int statusCode){
        given()
                .when()
                .get(RetriveUrl.retriveTheUrl("getAllEmployee"))
                .then()
                .assertThat().statusCode(statusCode)
                .assertThat().contentType("application/json");
    }
}
