package starter.stepdefinitions.AllRole.PDAM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.AllRole.PDAM.GetPdamById;

public class GetPDAMByIdSteps {
    @Steps
    GetPdamById getPdamById;
    //==================================== Get PDAM by ID ====================================================
    @Given("User have endpoint auth login for get PDAM by ID")
    public void userHaveEndpointAuthLoginForGetPDAMByID() { getPdamById.haveendpointauthlogin();
    }

    @When("User send endpoint auth for get PDAM by ID feature and get token")
    public void userSendEndpointAuthForGetPDAMByIDFeatureAndGetToken() { getPdamById.sendendpointauthandgettoken();
    }

    @Then("User set get PDAM by ID api endpoint")
    public void userSetGetPDAMByIDApiEndpoint() { getPdamById.setapiendpoint();
    }

    @Then("User send HTTP request for get PDAM by ID")
    public void userSendHTTPRequestForGetPDAMByID() { getPdamById.sendHTTPrequest();
    }

    @And("User received valid HTTP response code {int} for get PDAM by ID")
    public void userReceivedValidHTTPResponseCodeForGetPDAMByID(int arg0) { getPdamById.receivedvalidHTTPresponsecode();
    }

    @And("User received valid data message success : Successfully get PDAM")
    public void userReceivedValidDataMessageSuccessSuccessfullyGetPDAM() { getPdamById.ReceivedValidDataMessageSuccess();
    }
}
