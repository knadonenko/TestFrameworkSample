package apiclient;

import dto.BaseRequest;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.ApiConstants;

import static io.restassured.RestAssured.given;
import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;

public class ApiClient {

    public <T> T getSpecification(String endPoint, Class<T> clazz) {
        return given().spec(getRequestSpec())
                .when().get(endPoint)
                .then().spec(getResponseSpec(SC_OK))
                .extract().body().as(clazz);

    }

    public <T> T postSpecification(String endpoint, BaseRequest request, Class<T> response) {
        return given().spec(getRequestSpec())
                .body(request).when().log().all().post(endpoint)
                .then().spec(getResponseSpec(SC_CREATED))
                .log().all()
                .extract().body().as(response);
    }

    private RequestSpecification getRequestSpec() {
        return new RequestSpecBuilder()
                .setBaseUri(ApiConstants.BASE_URL).setContentType(ContentType.JSON).build();
    }

    private ResponseSpecification getResponseSpec(int statusCode) {
        return new ResponseSpecBuilder()
                .expectStatusCode(statusCode)
                .build();
    }

}
