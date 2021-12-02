import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class BasicJava {

    public static void main (String[] args){


            RestAssured.baseURI = "http://localhost:8080";
            given().header("Content-Type", "application/json")
                    .when().get("/api/v1/user/61555685adf66f74bce00a61")
                    .then().log().all().assertThat().statusCode(200).body("firstName", equalTo("Gabriel"));


    }
}
