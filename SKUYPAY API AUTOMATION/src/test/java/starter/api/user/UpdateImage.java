package starter.api.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateImage {
    public String endpoint = "http://34.101.78.228:2424/api/v1";
    public String token = "";
    //========================================================================================
    @Step ("I have endpoint auth for update image user")
    public String iHaveEndpointAuthforUpdateImageUser(){
        return endpoint + "/login";
    }
    @Step("I send endpoint auth for update image and get token")
    public void iSendEndpointAuthforUpdateImageUserandGetToken() {
        String body = "{\n" +
                "    \"password\": \"12345678\",\n" +
                "    \"email\": \"melmel@gmail.com\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iHaveEndpointAuthforUpdateImageUser());
        token = lastResponse().getBody().jsonPath().get("data.token");
    }
    @Step("I set update image api endpoint")
    public String iSetUpdateImageAPIEndpoint() {
        return endpoint + "/user/image";
    }

    @Step("I send upload image HTTP request with format valid")
    public void iSendUploadImageHTTPRequestwithFormatValid() {
        String imagePath = "C:/Dev/CapstoneProjectBaru/LOGO SKUYPAY.png";
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>").
                accept("application/json").
                multiPart("image", new File(imagePath)).
                put(iSetUpdateImageAPIEndpoint());
    }


    @Step("I received valid HTTP response code 200 for update image")
    public void iReceivedValidHTTPResponseCodeforupdateimage() {

        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received valid data for update image user")
    public void iReceivedValidDataMessageSuccess() {
        restAssuredThat(response -> response.body("metadata.message", equalTo("User Image Updated successfully")));
    }
    //======================================================================================================
    @Step("I send upload image HTTP request with format invalid")
    public void iSendUploadImageHTTPRequestwithFormatInvalid() {
        String imagePath = "C:/Dev/CapstoneProjectBaru/Teks skrip video KKN.pdf";
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>").
                accept("application/json").
                multiPart("image", new File(imagePath)).
                put(iSetUpdateImageAPIEndpoint());
    }
    @Step("I received valid HTTP response code {int} bad request")
    public void iReceivedValidHTTPResponseCodeforupdateimagebecauseformatinvalid() {

        restAssuredThat(response -> response.statusCode(400));
    }
    @Step("I received eror message : Uploaded image formats are only allowed png, jpg and jpeg")
    public void iReceivedValidDataMessageErorUploadedimageformatsareonlyallowedpngjpgandjpeg() {
        restAssuredThat(response -> response.body("message", equalTo("Uploaded image formats are only allowed png, jpg and jpeg")));
    }
    //=======================================================================================================
    @Step("I send upload image HTTP request with no authorization")
    public void iSendUploadImageHTTPRequestwithNoAuthorization() {
        String imagePath = "C:/Dev/CapstoneProjectBaru/Teks skrip video KKN.pdf";
        SerenityRest.
                given().
                header("Authorization", "Bearer "+token).
                header("Content-Type","multipart/form-data; boundary=<calculated when request is sent>").
                accept("application/json").
                multiPart("image", new File(imagePath)).
                put(iSetUpdateImageAPIEndpoint());
    }
    @Step("I received eror message : missing or malformed jwt")
    public void iReceivedValidDataMessageErormissingormalformedjwt() {
        restAssuredThat(response -> response.body("message", equalTo("missing or malformed jwt")));
    }
}
