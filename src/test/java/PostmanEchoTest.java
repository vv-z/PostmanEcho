import static io.restassured.RestAssured.basePath;
import static org.junit.jupiter.api.Assertions.*;

import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import java.net.http.HttpResponse;

import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

class PostmanEchoTest {
    private HttpResponse<Object> ValidatableResponse;
    private Object expectedStatusCode;

    @Test
    void shouldReturnSendData() {
        given()

                .baseUri("https://postman-echo.com")
                .body("25.06.2023")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("25.06.2023"));


    }


}