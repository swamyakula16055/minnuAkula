package APITesting;

import org.apache.commons.collections.map.HashedMap;
import org.testng.annotations.Test;

import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HttpRequest {

    int id;

    @Test(priority = 1)
    public void getUsers() {
        given()
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page", equalTo(2))
                .log().all();

    }

    @Test(priority = 2)
    public void createUser() {
        HashedMap data = new HashedMap();
        data.put("name", "swamy");
        data.put("job", "testEngineer");

        id = given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("https://reqres.in/api/users")
                .jsonPath().getInt("id");
//                .then()
//                .statusCode(201)
//                .log().all();


    }

    @Test(priority = 3, dependsOnMethods = {"createUser"})
    public void updateUser() {

        HashedMap data = new HashedMap();
        data.put("name", "shiva");
        data.put("job", "automation");

        given()
                .contentType("application/json")
                .body(data)

                .when()
                .put("https://reqres.in/api/users/" + id)

                .then()
                .statusCode(200)
                .log().all();

    }


    @Test(priority = 4)
    public void deleteUser() {

        given()
                .when()
                .delete("https://reqres.in/api/users/" + id)

                .then()
                .statusCode(204)
                .log().all();

    }


}