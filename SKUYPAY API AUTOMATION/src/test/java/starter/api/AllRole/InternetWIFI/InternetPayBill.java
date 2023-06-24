package starter.api.AllRole.InternetWIFI;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class InternetPayBill {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";
    //========================================================================================
    @Step ("I have endpoint auth")
    public String haveEndpointAuth(){
        return endpoint + "/login";
    }
    @Step("I send endpoint auth and get token")
    public void sendEndpointAuthandGetToken() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"melmel@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().
                header("Content-Type", "application/json").
                body(reqBody.toString()).
                post(haveEndpointAuth());
        token = lastResponse().
                getBody().
                jsonPath().
                get("data.token");
    }
    @Step("I set api endpoint")
    public String setAPIEndpoint() {
        return endpoint + "/wifi/pay";
    }

    @Step("I send HTTP request")
    public void sendHTTPRequest() {
        String body = "{\n" +
                "    \"partner_tx_id\": \"WIFI-7778842392404391\",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","application/json").
                body(reqBody.toString()).
                post(setAPIEndpoint());
    }


    @Step("I received valid HTTP response code 200")
    public void receivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data message success")
    public void iReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("Successfully pay bill")));}
//=========================================== Internet Pay Bill 02 ===================================================
    @Step("I send HTTP request")
    public void sendHTTPRequestpaidid() {
        String body = "{\n" +
                "    \"partner_tx_id\": \"WIFI-2607996820077522\",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","application/json").
                body(reqBody.toString()).
                post(setAPIEndpoint());
    }


    @Step("I received valid HTTP response code 500")
    public void receivedinValidHTTPResponseCodepaidid() {

        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I received valid data message error")
    public void iReceivedValidDataErorMessage() {
        restAssuredThat(response -> response.body("error", equalTo("this WiFi bill has been paid")));}
    //================================================== Internet Pay Bill 03 =======================================
    @Step("I send id paid HTTP request")
    public void sendinvalidHTTPRequestwithinvalidid() {
        String body = "{\n" +
                "    \"partner_tx_id\": \"WIFI-2607996820077525\",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","application/json").
                body(reqBody.toString()).
                post(setAPIEndpoint());
    }
    @Step("I received valid data eror message")
    public void iReceivedValidDataMessageErrorninvalidid() {
        restAssuredThat(response -> response.body("error", equalTo("record not found")));
    }
    //================================================== Insurance Pay Bill 04 =======================================

    @Step("I received valid HTTP response code 400")
    public void receivedinValidHTTPResponseCodebecausenotlogin() {

        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I received valid data eror message")
    public void iReceivedValidDataMessageErrorbecausenotlogin() {
        restAssuredThat(response -> response.body("message", equalTo("missing or malformed jwt")));
    }
}

