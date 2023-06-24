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

    @Then("User send HTTP request for insurance biil inquiry with unpaid customer id")
    public void iSendHTTPRequestForInsuranceBiilInquiry() { insuranceBiilInquiry.iSendvalidHTTPRequest();
    }

    @And("User received valid HTTP response code {int} for insurance biil inquiry")
    public void iReceivedValidHTTPResponseCodeForInsuranceBiilInquiry(int arg0) { insuranceBiilInquiry.iReceivedValidHTTPResponseCode();
    }

    @And("User received message success : Succesfully Get Bill")
    public void iReceivedMessageSuccessSuccesfullyGetBill() { insuranceBiilInquiry.iReceivedValidDataMessageSuccess();
    }
    //================================================ insurance bill inquiry 02 ======================================

    @Then("User send HTTP request for insurance biil inquiry with paid customer id")
    public void userSendHTTPRequestForInsuranceBiilInquiryWithPaidCustomerId() { insuranceBiilInquiry.iSendinvalidHTTPRequest();
    }

    @And("User received invalid HTTP response code {int} for insurance biil inquiry")
    public void userReceivedInvalidHTTPResponseCodeForInsuranceBiilInquiry(int arg0) { insuranceBiilInquiry.iReceivedinValidHTTPResponseCode();
    }

    @And("User received message eror : this month's bill has been paid")
    public void userReceivedMessageErorThisMonthSBillHasBeenPaid() { insuranceBiilInquiry.iReceivedValidDataMessageError();
    }
    //================================================ insurance bill inquiry 03 ======================================

    @And("User received invalid HTTP response code {int} for insurance biil inquiry because not login")
    public void userReceivedInvalidHTTPResponseCodeForInsuranceBiilInquiryBecauseNotLogin(int arg0) {
        insuranceBiilInquiry.iReceivedinValidHTTPResponseCodebecausenotlogin();
    }

    @And("User received message eror : missing or malformed jwt")
    public void userReceivedMessageErorMissingOrMalformedJwt() {
        insuranceBiilInquiry.iReceivedValidDataMessageErrorbecausenotlogin();
    }
}
