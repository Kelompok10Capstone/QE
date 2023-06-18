package starter.api.user;

import com.typesafe.config.Config;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.hc.core5.http.ContentType;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

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
                "    \"email\": \"user2@gmail.com\"\n" +
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
    public void iSendUploadImageHTTPRequestwithFormatValid() throws IOException {
        String imagePath = "C:/Dev/CapstoneProjectBaru/LOGO SKUYPAY.png";
        String boundary = "xyz123";
        File imageFile = new File(imagePath);
        byte[] imageBytes = readImageBytes(imageFile);
        SerenityRest.given().header("Authorization", "Bearer "+token).header("Content-Type","multipart/form-data; boundary=" +boundary).accept("application/json").body(buildMultipartBody(imageBytes, boundary)).put(iSetUpdateImageAPIEndpoint());
    }

    public byte[] readImageBytes(File imageFile) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(imageFile);
        byte[] imageBytes = new byte[(int) imageFile.length()];
        fileInputStream.read(imageBytes);
        fileInputStream.close();
        return imageBytes;
    }

    public byte[] buildMultipartBody(byte[] imageBytes, String boundary) {
        String lineBreak = "\r\n";

        StringBuilder builder = new StringBuilder();
        builder.append("--").append(boundary).append(lineBreak);
        builder.append("Content-Disposition: form-data; name=\"image\"; filename=\"").append("\"").append(lineBreak);
        builder.append("Content-Type: image/png").append(lineBreak);
        builder.append(lineBreak);
        builder.append(new String(imageBytes)).append(lineBreak);
        builder.append("--").append(boundary).append("--").append(lineBreak);

        return builder.toString().getBytes();
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
    public void iSendUploadImageHTTPRequestwithFormatInvalid() throws IOException {
        String imagePath = "C:/Dev/CapstoneProjectBaru/Teks skrip video KKN.pdf";
        String boundary = "xyz123";
        File imageFile = new File(imagePath);
        byte[] imageBytes = readImageBytes(imageFile);
        SerenityRest.given().header("Authorization", "Bearer "+token).header("Content-Type","multipart/form-data; boundary=" +boundary).accept("application/json").body(buildMultipartBody(imageBytes, boundary)).put(iSetUpdateImageAPIEndpoint());
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
    public void iSendUploadImageHTTPRequestwithNoAuthorization() throws IOException {
        String imagePath = "C:/Dev/CapstoneProjectBaru/LOGO SKUYPAY.png";
        String boundary = "xyz123";
        File imageFile = new File(imagePath);
        byte[] imageBytes = readImageBytes(imageFile);
        SerenityRest.given().header("Content-Type","multipart/form-data; boundary=" +boundary).accept("application/json").body(buildMultipartBody(imageBytes, boundary)).put(iSetUpdateImageAPIEndpoint());
    }
    @Step("I received eror message : missing or malformed jwt")
    public void iReceivedValidDataMessageErormissingormalformedjwt() {
        restAssuredThat(response -> response.body("message", equalTo("missing or malformed jwt")));
    }
}
