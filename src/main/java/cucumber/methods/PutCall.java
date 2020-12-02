package cucumber.methods;

import cucumber.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class PutCall {
    public static void putCallMethod(String id, int statusCode) {

        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("./src/test/resources/payload/employee.json"));
            JSONObject ans = (JSONObject) obj;

            given()
                    .contentType("application/json")
                    .body(ans)
                    .when()
                    .put(RetriveUrl.retriveTheUrl("updateUrl")+id)
                    .then()
                    .assertThat().statusCode(statusCode)
                    .assertThat().contentType("application/json")
                    .assertThat().time(lessThan(5000L), TimeUnit.MILLISECONDS);

        } catch (Exception e) {
        }
    }
}
