package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostmanEchoTest {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Test data")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Test data"))
        ;
    }
}
