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


    @Step("I received valid HTTP response code 200")
    public void receivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(202));
    }
    @Step("I received valid data message success")
    public void iReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("Successfully pay bill")));}}