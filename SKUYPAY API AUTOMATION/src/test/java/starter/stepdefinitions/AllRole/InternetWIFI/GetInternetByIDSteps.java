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
    public void ReceivedValidHTTPResponseCodeForGetInternetByID(int arg0) { getInternetById.ReceivedValidDataMessageSuccess();
    }

    @And("User received message success : Successfully get WiFi")
    public void ReceivedMessageSuccessSuccessfullyGetWiFi() { getInternetById.ReceivedValidDataMessageSuccess();
    }
}
