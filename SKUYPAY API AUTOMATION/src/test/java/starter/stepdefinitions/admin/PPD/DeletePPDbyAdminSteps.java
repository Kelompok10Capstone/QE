package starter.stepdefinitions.admin.PPD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.admin.PPD.DeletePPDbyAdmin;

public class DeletePPDbyAdminSteps {
    @Steps
    DeletePPDbyAdmin deletePPDbyAdmin;
    //======================================== delete-PPD-by-Admin-01 =============================================
    @Given("Admin have endpoint auth login for delete PPD")
    public void adminHaveEndpointAuthLoginForDeletePPD() { deletePPDbyAdmin.adminhaveendpointauth();
    }

    @When("Admin send endpoint auth for delete PPD and get token")
    public void adminSendEndpointAuthForDeletePPDAndGetToken() { deletePPDbyAdmin.adminsendendpointauthandgettoken();}

    @Then("Admin set delete PPD api endpoint")
    public void adminSetDeletePPDApiEndpoint() { deletePPDbyAdmin.adminsetdeletePPDapiendpoint();
    }

    @Then("Admin send HTTP request with params Pulsa id")
    public void adminSendHTTPRequestWithParamsPulsaId() { deletePPDbyAdmin.adminsendHTTPrequestwithparamspulsaid();
    }

    @And("Admin received valid HTTP response code {int} for delete PPD by admin")
    public void adminReceivedValidHTTPResponseCodeForDeletePPDByAdmin(int arg0) { deletePPDbyAdmin.adminreceivedvalidHTTPresponsecode();
    }

    @And("Admin received message success : pulsa or paket data deleted successfully")
    public void adminReceivedMessageSuccessPulsaOrPaketDataDeletedSuccessfully() { deletePPDbyAdmin.adminReceivedValidDataMessageSuccess();
    }
    //========================================== delete PPD 02 ==================================================
    @Then("Admin send HTTP request with params Paket data id")
    public void adminSendHTTPRequestWithParamsPaketDataId() { deletePPDbyAdmin.adminsendHTTPrequestwithparamspaketdataid();
    }
    //========================================== delete PPD 03 ===================================================
    @And("Admin received invalid HTTP response code {int} for delete PPD by admin")
    public void adminReceivedInvalidHTTPResponseCodeForDeletePPDByAdmin(int arg0) { deletePPDbyAdmin.adminreceivedinvalidHTTPresponsecode();
    }

    @And("Admin received eror message : missing or malformed jwt")
    public void adminReceivedErorMessageMissingOrMalformedJwt() { deletePPDbyAdmin.adminReceivedValidDataMessageEror();
    }
}
