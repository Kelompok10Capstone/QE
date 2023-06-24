package starter.api.AllRole.InternetWIFI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetInternetById {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";

    //======================================= Get Internet By ID 01 =================================================
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
        return endpoint + "/wifi/95ee7218-f502-475f-9364-d1e79c121c23";
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
        restAssuredThat(response -> response.body("metadata.message", equalTo("Successfully get WiFi")));
    }
    //============================================= Get Internet By ID 02 ==========================================
    @Step("User set api invalid endpoint")
    public String setapiinvalidendpoint() {
        return endpoint + "/wifi/95ee7218-f502-475f-9364-d1e79c121c24";
    }
    @Step("User send HTTP request")
    public void sendinvalidHTTPrequest() {
        SerenityRest.
                given().
                header("Authorization", "Bearer " + token).
                get(setapiinvalidendpoint());
    }


    @Step("User received valid HTTP response code 404")
    public void receivedinvalidHTTPresponsecodenotfound() {

        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("User received message")
    public void ReceivedValidDataMessagenotfound() {
        restAssuredThat(response -> response.body("message", equalTo("wifi not found")));
    }
    //============================================= Get Internet By ID 03 ==========================================
    @Step("User set api endpoint without id")
    public String setapiendpointwithoutid() {
        return endpoint + "/wifi";
    }
    @Step("User send HTTP request")
    public void sendHTTPrequestwithoutid() {
        SerenityRest.
                given().
                header("Authorization", "Bearer " + token).
                get(setapiendpointwithoutid());
    }
    @Step("User received message not found")
    public void ReceivedValidDataMessagenotfoundwithoutid() {
        restAssuredThat(response -> response.body("message", equalTo("Not Found")));
    }
    //============================================= Get Internet By ID 04 ==========================================
    @Step("User received valid HTTP response code 404")
    public void receivedinvalidHTTPresponsenotlogin() {

        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("User received message")
    public void ReceivedValidDataMessagenotlogin() {
        restAssuredThat(response -> response.body("message", equalTo("missing or malformed jwt")));
    }
}