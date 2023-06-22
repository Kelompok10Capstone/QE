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
}
