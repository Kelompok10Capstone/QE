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
    //==================================== Get PDAM by ID 01 ====================================================
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
    //==================================== Get PDAM by ID 02 ====================================================
    @Then("User set get PDAM by ID api invalid endpoint")
    public void userSetGetPDAMByIDApiInvalidEndpoint() { getPdamById.setapiinvalidendpoint();
    }

    @Then("User send HTTP request for get PDAM by ID with invalid id")
    public void userSendHTTPRequestForGetPDAMByIDWithInvalidId() { getPdamById.sendinvalidHTTPrequest();
    }

    @And("User received invalid HTTP response code {int} for get PDAM by ID")
    public void userReceivedInvalidHTTPResponseCodeForGetPDAMByID(int arg0) { getPdamById.receivedinvalidHTTPresponsecodenotfound();
    }

    @And("User received message : PDAM not found")
    public void userReceivedMessagePDAMNotFound() { getPdamById.ReceivedValidDataMessagenotfound();
    }
    //==================================== Get PDAM by ID 03 ====================================================
    @Then("User set get PDAM by ID api endpoint with empty id")
    public void userSetGetPDAMByIDApiEndpointWithEmptyId() { getPdamById.setapiendpointwithoutid();
    }

    @Then("User send HTTP request for get PDAM by ID with empty id")
    public void userSendHTTPRequestForGetPDAMByIDWithEmptyId() { getPdamById.sendHTTPrequestwithoutid();
    }

    @And("User received message for PDAM : not found")
    public void userReceivedMessageForPDAMNotFound() { getPdamById.receivedinvalidHTTPresponsecodenotfound();
    }
    //==================================== Get PDAM by ID 04 ====================================================
    @And("User received valid HTTP response code {int} for get PDAM by ID because not login")
    public void userReceivedValidHTTPResponseCodeForGetPDAMByIDBecauseNotLogin(int arg0) {
        getPdamById.receivedinvalidHTTPresponsenotlogin();
    }

    @And("User received message for PDAM : missing or malformed jwt")
    public void userReceivedMessageForPDAMMissingOrMalformedJwt() {
        getPdamById.ReceivedValidDataMessagenotlogin();
    }
}
