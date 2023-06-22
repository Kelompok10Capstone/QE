package starter.api.AllRole.PDAM;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetPdamById {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";

    //========================================================================================
    @Step("User have endpoint auth")
    public String haveendpointauthlogin() {
        return endpoint + "/login";
    }

    @Step("User send endpoint auth login and get token")
    public void sendendpointauthandgettoken() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"melmel@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(haveendpointauthlogin());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("User set api endpoint")
    public String setapiendpoint() {
        return endpoint + "/pdam/f27141e3-5cb2-4131-9852-9e8db25c37b9";
    }

    @Step("User send HTTP request")
    public void sendHTTPrequest() {
        SerenityRest.
                given().
                header("Authorization", "Bearer " + token).
                get(setapiendpoint());
    }


    @Step("User received valid HTTP response code 200")
    public void receivedvalidHTTPresponsecode() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("User received message success")
    public void ReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("Successfully get PDAM")));
    }
}