package cucumber.methods;

import cucumber.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PostCall {
    public static void postCallMethod(int statusCode) {

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("./src/test/resources/payload/employee.json"));
            JSONObject ans = (JSONObject) obj;

            given()
                    .contentType("application/json")
                    .body(ans)
                    .when()
                    .post(RetriveUrl.retriveTheUrl("createUrl"))
                    .then()
                    .assertThat().statusCode(statusCode)
                    .assertThat().contentType("application/json")
                    .assertThat().time(lessThan(5000L), TimeUnit.MILLISECONDS);

        } catch (Exception e) {
        }
    }
}
