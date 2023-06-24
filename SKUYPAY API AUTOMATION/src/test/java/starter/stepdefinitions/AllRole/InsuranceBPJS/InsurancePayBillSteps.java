package starter.stepdefinitions.AllRole.InsuranceBPJS;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.AllRole.InsuranceBPJS.InsurancePayBill;

public class InsurancePayBillSteps {
    @Steps
    InsurancePayBill insurancePayBill;
    //======================================= Insurance-Pay-Bill-01 =======================================
    @Given("User have endpoint auth login for insurance pay bill")
    public void userHaveEndpointAuthLoginForInsurancePayBill() { insurancePayBill.haveEndpointAuth();
    }

    @When("User send endpoint auth for insurance pay bill and get token")
    public void userSendEndpointAuthForInsurancePayBillAndGetToken() { insurancePayBill.sendEndpointAuthandGetToken();
    }

    @Then("User set insurance pay bill endpoint")
    public void userSetInsurancePayBillEndpoint() { insurancePayBill.setAPIEndpoint();
    }

    @Then("User send HTTP request for insurance pay bill")
    public void userSendHTTPRequestForInsurancePayBill() { insurancePayBill.sendHTTPRequest();
    }

    @And("User received valid HTTP response code {int} for insurance pay bill")
    public void userReceivedValidHTTPResponseCodeForInsurancePayBill(int arg0) { insurancePayBill.receivedValidHTTPResponseCode();
    }

    @And("User received message success for insurance pay : Succesfully pay bill")
    public void userReceivedMessageSuccessForInsurancePaySuccessfullyPayBill() { insurancePayBill.iReceivedValidDataMessageSuccess();
    }
    //================================== Insurance Pay Bill 02 =====================================================
    @Then("User send HTTP request for insurance pay bill with paid id")
    public void userSendHTTPRequestForInsurancePayBillWithPaidId() { insurancePayBill.sendinvalidHTTPRequest();
    }

    @And("User received invalid HTTP response code {int} for insurance pay bill")
    public void userReceivedInvalidHTTPResponseCodeForInsurancePayBill(int arg0) { insurancePayBill.receivedinValidHTTPResponseCode();
    }

    @And("User received message eror for insurance pay : this month's bill has been paid")
    public void userReceivedMessageErorForInsurancePayThisMonthSBillHasBeenPaid() { insurancePayBill.iReceivedValidDataMessageError();
    }
    //================================== Insurance Pay Bill 03 =====================================================
    @Then("User send HTTP request for insurance pay bill with invalid id")
    public void userSendHTTPRequestForInsurancePayBillWithInvalidId() { insurancePayBill.sendinvalidHTTPRequestwithinvalidid();
    }

    @And("User received message eror for insurance pay : record not found")
    public void userReceivedMessageErorForInsurancePayRecordNotFound() { insurancePayBill.iReceivedValidDataMessageErrorninvalidid();
    }
    //========================================== Insurance Pay Bill 04 ================================================
    @And("User received invalid HTTP response code {int} for insurance pay bill because not login")
    public void userReceivedInvalidHTTPResponseCodeForInsurancePayBillBecauseNotLogin(int arg0) { insurancePayBill.receivedinValidHTTPResponseCodebecausenotlogin();
    }

    @And("User received message eror for insurance pay : missing or malformed jwt")
    public void userReceivedMessageErorForInsurancePayMissingOrMalformedJwt() { insurancePayBill.iReceivedValidDataMessageErrorbecausenotlogin();
    }


}
