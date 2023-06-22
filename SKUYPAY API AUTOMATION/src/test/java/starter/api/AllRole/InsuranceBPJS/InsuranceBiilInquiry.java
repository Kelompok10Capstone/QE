package starter.api.AllRole.InsuranceBPJS;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class InsuranceBiilInquiry {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";
    //========================================================================================
    @Step ("I have endpoint auth")
    public String iHaveEndpointAuth(){
        return endpoint + "/login";
    }
    @Step("I send endpoint auth and get token")
    public void iSendEndpointAuthandGetToken() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"melmel@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iHaveEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("I set api endpoint")
    public String iSetAPIEndpoint() {
        return endpoint + "/insurance/inquiry";
    }

    @Step("I send HTTP request")
    public void iSendHTTPRequest() {
        String body = "{\n" +
                "    \"customer_id\": \"0001169655783\",\n" +
                "    \"discount_id\": \"722abee6-f0bc-4cf7-9590-a447e7e3857b\",\n" +
                "    \"product_id\": \"BPJSKS\",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","application/json").
                accept("application/json").
                body(reqBody.toString()).
                post(iSetAPIEndpoint());
    }


    @Step("I received valid HTTP response code 200")
    public void iReceivedValidHTTPResponseCode() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data")
    public void iReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("Succesfully Get Bill")));}}