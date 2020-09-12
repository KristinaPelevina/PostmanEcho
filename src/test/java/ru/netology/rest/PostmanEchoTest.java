package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

class PostmanEchoTest {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Test data")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Test data"))
        ;
    }
}
