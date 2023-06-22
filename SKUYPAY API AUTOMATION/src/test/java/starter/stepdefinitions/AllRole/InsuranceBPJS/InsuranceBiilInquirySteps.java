package starter.stepdefinitions.AllRole.InsuranceBPJS;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.AllRole.InsuranceBPJS.InsuranceBiilInquiry;

public class InsuranceBiilInquirySteps {
    @Steps
    InsuranceBiilInquiry insuranceBiilInquiry;
    //========================================= 01 =========================================================
    @Given("User have endpoint auth login for insurance biil inquiry")
    public void iHaveEndpointAuthLoginForInsuranceBiilInquiry() { insuranceBiilInquiry.iHaveEndpointAuth();
    }

    @When("User send endpoint auth for insurance biil inquiry and get token")
    public void iSendEndpointAuthForInsuranceBiilInquiryAndGetToken() { insuranceBiilInquiry.iSendEndpointAuthandGetToken();
    }

    @Then("User set insurance biil inquiry endpoint")
    public void iSetInsuranceBiilInquiryEndpoint() { insuranceBiilInquiry.iSetAPIEndpoint();
    }

    @Then("User send HTTP request for insurance biil inquiry")
    public void iSendHTTPRequestForInsuranceBiilInquiry() { insuranceBiilInquiry.iSendHTTPRequest();
    }

    @And("User received valid HTTP response code {int} for insurance biil inquiry")
    public void iReceivedValidHTTPResponseCodeForInsuranceBiilInquiry(int arg0) { insuranceBiilInquiry.iReceivedValidHTTPResponseCode();
    }

    @And("User received message success : Succesfully Get Bill")
    public void iReceivedMessageSuccessSuccesfullyGetBill() { insuranceBiilInquiry.iReceivedValidDataMessageSuccess();
    }
}
