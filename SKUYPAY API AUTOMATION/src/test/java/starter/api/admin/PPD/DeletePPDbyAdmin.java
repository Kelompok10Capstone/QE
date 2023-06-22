package starter.api.admin.PPD;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;


import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeletePPDbyAdmin {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";

    //========================================================================================
    @Step("Admin have endpoint auth login")
    public String adminhaveendpointauth() {
        return endpoint + "/login";
    }

    @Step("Admin send endpoint auth and get token")
    public void adminsendendpointauthandgettoken() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"admin1@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminhaveendpointauth());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("Admin set get PPD api endpoint")
    public String adminsetdeletePPDapiendpoint() {
        return endpoint + "/admin/ppd/{id}";
    }

    @Step("Admin send HTTP request with params pulsa id")
    public void adminsendHTTPrequestwithparamspulsaid() {
        String PPDId = "b6c36cc0-56da-44d2-97eb-0a4ee321f381";
        SerenityRest.
                given().
                pathParam("id", PPDId).
                header("Authorization", "Bearer " + token).
                header("accept", "application/json").
                accept("application/json").
                delete(adminsetdeletePPDapiendpoint());
    }


    @Step("Admin received valid HTTP response code 200")
    public void adminreceivedvalidHTTPresponsecode() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Admin received message success : pulsa or paket data deleted successfully")
    public void adminReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("pulsa or paket data deleted successfully")));
    }
    //===================================== delete-PPD-by-Admin-02 ================================================
    @Step("Admin send HTTP request with params paket data")
    public void adminsendHTTPrequestwithparamspaketdataid() {
        String PPDId = "85f4f472-7a0b-41bb-bab0-6930e36d244e";
        SerenityRest.
                given().
                pathParam("id", PPDId).
                header("Authorization", "Bearer " + token).
                header("accept", "application/json").
                accept("application/json").
                delete(adminsetdeletePPDapiendpoint());
    }
    //===================================== delete-PPD-by-Admin-03 ================================================
    @Step("Admin received invalid HTTP response code 400")
    public void adminreceivedinvalidHTTPresponsecode() {

        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Admin received message success : missing or malformed jwt")
    public void adminReceivedValidDataMessageEror() {
        restAssuredThat(response -> response.body("message", equalTo("missing or malformed jwt")));
    }
}