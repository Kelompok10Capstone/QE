package starter.stepdefinitions.AllRole.InternetWIFI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.AllRole.InternetWIFI.GetInternetById;

public class GetInternetByIDSteps {
    @Steps
    GetInternetById getInternetById;
    //====================================== 01 ============================================================
    @Given("User have endpoint auth login for get internet by ID")
    public void HaveEndpointAuthLoginForGetInternetByID() { getInternetById.haveendpointauthlogin();
    }

    @When("User send endpoint auth for get internet by ID feature and get token")
    public void SendEndpointAuthForGetInternetByIDFeatureAndGetToken() { getInternetById.sendendpointauthandgettoken();
    }

    @Then("User set get internet by ID api endpoint")
    public void SetGetInternetByIDApiEndpoint() { getInternetById.setapiendpoint();
    }

    @Then("User send HTTP request for get internet by ID")
    public void SendHTTPRequestForGetInternetByID() { getInternetById.sendHTTPrequest();
    }

    @And("User received valid HTTP response code {int} for get internet by ID")
    public void ReceivedValidHTTPResponseCodeForGetInternetByID(int arg0) { getInternetById.receivedvalidHTTPresponsecode();
    }

    @And("User received message success : Successfully get WiFi")
    public void ReceivedMessageSuccessSuccessfullyGetWiFi() { getInternetById.ReceivedValidDataMessageSuccess();
    }
    //===================================== Get Internet By ID 02 =================================================
    @Then("User set get internet by ID api invalid endpoint")
    public void userSetGetInternetByIDApiInvalidEndpoint() {
        getInternetById.setapiinvalidendpoint();
    }
    @Then("User send HTTP request for get internet by ID with invalid id")
    public void userSendHTTPRequestForGetInternetByIDWithInvalidId() {
        getInternetById.sendinvalidHTTPrequest();
    }

    @And("User received invalid HTTP response code {int} for get internet by ID")
    public void userReceivedInvalidHTTPResponseCodeForGetInternetByID(int arg0) {
        getInternetById.receivedinvalidHTTPresponsecodenotfound();
    }

    @And("User received message : wifi not found")
    public void userReceivedMessageWifiNotFound() {
        getInternetById.ReceivedValidDataMessagenotfound();
    }
    //========================================= Get Internet By ID 03 =======================================
    @Then("User set get internet by ID api endpoint with empty id")
    public void userSetGetInternetByIDApiEndpointWithEmptyId() {
        getInternetById.setapiendpointwithoutid();
    }
    @Then("User send HTTP request for get internet by ID with empty id")
    public void userSendHTTPRequestForGetInternetByIDWithEmptyId() {
        getInternetById.sendHTTPrequestwithoutid();
    }

    @And("User received message : not found")
    public void userReceivedMessageNotFound() {
        getInternetById.ReceivedValidDataMessagenotfoundwithoutid();
    }
    //========================================= Get Internet By ID 04 =======================================
    @And("User received valid HTTP response code {int} for get internet by ID because not login")
    public void userReceivedValidHTTPResponseCodeForGetInternetByIDBecauseNotLogin(int arg0) {
        getInternetById.receivedinvalidHTTPresponsenotlogin();
    }

    @And("User received message : missing or malformed jwt")
    public void userReceivedMessageMissingOrMalformedJwt() {
        getInternetById.ReceivedValidDataMessagenotlogin();
    }
}
