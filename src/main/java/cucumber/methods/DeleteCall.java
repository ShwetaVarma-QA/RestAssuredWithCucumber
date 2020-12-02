package cucumber.methods;

import cucumber.*;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class DeleteCall {
    public static void deleteCallResponse(String id, int statuscode) {
        given()
                .when()
                .delete(((RetriveUrl.retriveTheUrl("deleteUrl"))+id))
                .then()
                .assertThat().statusCode(statuscode)
                .assertThat().time(lessThan(5000L), TimeUnit.MILLISECONDS);

    }
}
