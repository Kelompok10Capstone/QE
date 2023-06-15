package starter.api.auth;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class LoginUser {
    protected String email ="user2@gmail.com";
    protected Integer password =12345678;
    public String endpoints = "https://be-golang.kucinghitam.tech/api/v1/login ";
    public String token = "";
    //=======================================================================================
    @Step("I set login api endpoint for login feature")
    public String iSetLoginApiEndpoints() {
        return endpoints ;
    }

    @Step("I send login HTTP request")
    public void iSendPOSTHTTPRequest() {
        String body = "{\n" +
                " \"email\":" + email + ", \n" +
                " \"password\":" + password + ", \n" +
                "}";
        JSONObject requestBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/JSON").body(requestBody.toString()).post(iSetLoginApiEndpoints());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("I received valid HTTP response code {int} for login")
    public void iReceiveValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I received valid data for login")
    public void iReceiveValidData() {
        restAssuredThat(response -> response.body("data.metadata.message", equalTo("User Login successfully")));
    }
}