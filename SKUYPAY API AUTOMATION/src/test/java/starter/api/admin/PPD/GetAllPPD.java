package starter.api.admin.PPD;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetAllPPD {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";

    //========================================================================================
    @Step("Admin have endpoint auth login for get PPD")
    public String adminhaveendpointauthloginforgetPPD() {
        return endpoint + "/login";
    }

    @Step("Admin send endpoint auth for get PDD feature and get token")
    public void adminsendendpointauthforgetPDDfeatureandgettoken() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"admin1@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(adminhaveendpointauthloginforgetPPD());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }

    @Step("Admin set get PPD api endpoint")
    public String adminsetgetPPDapiendpoint() {
        return endpoint + "/admin/ppd";
    }

    @Step("Admin send HTTP request with params for all")
    public void adminsendHTTPrequestwithparamsforall() {
        Map<String, String> queryParams = new HashMap<>();
        SerenityRest.
                given().
                queryParam("type", "--").
                queryParam("provider", "Telkomsel").
                queryParam("limit", 10).
                queryParam("page", 1).
                queryParams(queryParams).
                header("Authorization", "Bearer " + token).
                header("Content-Type", "application/json").
                accept("application/json").
                get(adminsetgetPPDapiendpoint());
    }


    @Step("Admin received valid HTTP response code 200 for get detail PPD by admin")
    public void adminreceivedvalidHTTPresponsecodeforgetdetailPPDbyadmin() {

        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Admin received message success : success get all pulsa or paket data")
    public void adminReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("success get all pulsa or paket data")));
    }
    //================================= 02 ==================================================================
    @Step("Admin send HTTP request with params for only pulsa")
    public void adminsendHTTPrequestwithparamsforpulsa() {
        Map<String, String> queryParams = new HashMap<>();
        SerenityRest.
                given().
                queryParam("type", "pulsa").
                queryParam("provider", "Telkomsel").
                queryParam("limit", 10).
                queryParam("page", 1).
                queryParams(queryParams).
                header("Authorization", "Bearer " + token).
                header("Content-Type", "application/json").
                accept("application/json").
                get(adminsetgetPPDapiendpoint());
    }
    //===================================== get all PPD by admin 03 ================================================
    @Step("Admin send HTTP request with params for only paket data")
    public void adminsendHTTPrequestwithparamsforpaketdata() {
        Map<String, String> queryParams = new HashMap<>();
        SerenityRest.
                given().
                queryParam("type", "paket_data").
                queryParam("provider", "Telkomsel").
                queryParam("limit", 10).
                queryParam("page", 1).
                queryParams(queryParams).
                header("Authorization", "Bearer " + token).
                header("Content-Type", "application/json").
                accept("application/json").
                get(adminsetgetPPDapiendpoint());
    }
    //===================================== get all PPD by admin 04 ================================================

    @Step("Admin received invalid HTTP response code 400 for get detail PPD by admin")
    public void adminreceivedinvalidHTTPresponsecodeforgetdetailPPDbyadmin() {

        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Admin received message success : missing or malformed jwt")
    public void adminReceivedValidDataMessageEror() {
        restAssuredThat(response -> response.body("message", equalTo("missing or malformed jwt")));
    }
}