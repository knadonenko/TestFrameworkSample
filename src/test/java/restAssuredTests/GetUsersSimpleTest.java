package restAssuredTests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ApiConstants.BASE_URL;

public class GetUsersSimpleTest {

    @Test
    public void getUsersTest() {
        String firstName = given().contentType(ContentType.JSON)
                .when()
                .get(BASE_URL + "/users")
                .then().log().all()
                .extract().body().jsonPath().get("data[0].first_name");

        assertEquals("George", firstName);
    }

}
