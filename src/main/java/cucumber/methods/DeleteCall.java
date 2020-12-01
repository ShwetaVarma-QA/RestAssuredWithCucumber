package cucumber.methods;

import cucumber.*;
import static io.restassured.RestAssured.given;

public class DeleteCall {
    public static void deleteCallResponse(String id, int statuscode) {
        given()
                .when()
                .delete(((RetriveUrl.retriveTheUrl("deleteUrl"))+id))
                .then()
                .assertThat().statusCode(statuscode);
    }
}
