package starter.stepdefinitions.admin.PPD;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.api.admin.PPD.GetAllPPD;

public class GetAllPPDSteps {
    @Steps
    GetAllPPD getAllPPD;
    //================================================= 01 ========================================================
    @Given("Admin have endpoint auth login for get PPD")
    public void adminHaveEndpointAuthLoginForGetPPD() { getAllPPD.adminhaveendpointauthloginforgetPPD();
    }

    @When("Admin send endpoint auth for get PDD feature and get token")
    public void adminSendEndpointAuthForGetPDDFeatureAndGetToken() { getAllPPD.adminsendendpointauthforgetPDDfeatureandgettoken();
    }

    @Then("Admin set get PPD api endpoint")
    public void adminSetGetPPDApiEndpoint() { getAllPPD.adminsetgetPPDapiendpoint();
    }

    @Then("Admin send HTTP request with params for all")
    public void adminSendHTTPRequestWithNewUrlforpaketdata() { getAllPPD.adminsendHTTPrequestwithparamsforall();
    }

    @And("Admin received valid HTTP response code {int} for get detail PPD by admin")
    public void adminReceivedValidHTTPResponseCodeForGetDetailPPDByAdmin(int arg0) { getAllPPD.adminreceivedvalidHTTPresponsecodeforgetdetailPPDbyadmin();
    }

    @And("Admin received message success : success get all pulsa or paket data")
    public void iReceivedMessageSuccessSuccessGetAllPulsaOrPaketData() { getAllPPD.adminReceivedValidDataMessageSuccess();
    }
    //===================================================== Get All PPD 02 =====================================================

    @Then("Admin send HTTP request with params for only pulsa")
    public void adminSendHTTPRequestWithParamsForOnlyPulsa() { getAllPPD.adminsendHTTPrequestwithparamsforpulsa();
    }

    //===================================================== Get All PPD 3 =====================================================

    @Then("Admin send HTTP request with params for only paket data")
    public void adminSendHTTPRequestWithParamsForOnlyPaketData() { getAllPPD.adminsendHTTPrequestwithparamsforpaketdata();
    }
    //===================================================== Get All PPD 4 =====================================================
    @And("Admin received invalid HTTP response code {int} for get detail PPD by admin")
    public void adminReceivedInvalidHTTPResponseCodeForGetDetailPPDByAdmin(int arg0) { getAllPPD.adminreceivedinvalidHTTPresponsecodeforgetdetailPPDbyadmin();
    }

    @Then("Admin received message success : missing or malformed jwt")
    public void adminReceivedMessageSuccessMissingOrMalformedJwt() { getAllPPD.adminReceivedValidDataMessageEror();
    }
}
