package starter.api.auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginUser {

    public String endpoints = "http://34.101.78.228:2424/api/v1/login ";
    public String token = "";
    //=======================================================================================
    @Step("I set login api endpoint for login feature")
    public String iSetLoginApiEndpoints() {
        return endpoints ;
    }

    @Step("I send login HTTP request")
    public void iSendPOSTHTTPRequest() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"user2@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetLoginApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("I received valid HTTP response code {int} for login")
    public void iReceiveValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for login")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("User Login successfully")));
    }
    //========================================= Login-02 =========================================================
    @Step("I send login HTTP request with invalid data for login feature")
    public void iSendPOSTHTTPRequestwithinvaliddataforloginfeature() {
        String body = "{\n" +
                "    \"password\": \"12345679\",\n" +
                "    \"email\": \"user2@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetLoginApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("I received invalid HTTP response code 400 for login")
    public void iReceiveInvalidHTTPResponse() {

        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("I received error message : invalid email or password")
    public void iReceiveerrormessageinvalidemailorpasword() {
        restAssuredThat(response -> response.body("message", equalTo("invalid email or password")));
    }
    //========================================= Login-03 =========================================================
    @Step("I send login HTTP request with invalid email not registered")
    public void iSendPOSTHTTPRequestwithinvalidemailnotregistered() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"user20@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetLoginApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("I received error message : user not found")
    public void iReceiveerrormessageusernotfound() {
        restAssuredThat(response -> response.body("message", equalTo("user not found")));
    }
    //========================================= Login-04 =========================================================
    @Step("I send login HTTP request with no input email")
    public void iSendPOSTHTTPRequestwithnoinputemail() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetLoginApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("I received error message : email field is required")
    public void iReceiveerrormessageemailfieldisrequired() {
        restAssuredThat(response -> response.body("message", equalTo("email field is required")));
    }
    //========================================= Login-05 =========================================================
    @Step("I send login HTTP request with no input password")
    public void iSendPOSTHTTPRequestwithnoinputpassword() {
        String body = "{\n" +
                "    \"password\": \"\",\n" +
                "    \"email\": \"user2@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetLoginApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("I received error message : password field is required")
    public void iReceiveerrormessagepasswordfieldisrequired() {
        restAssuredThat(response -> response.body("message", equalTo("password field is required")));
    }
}