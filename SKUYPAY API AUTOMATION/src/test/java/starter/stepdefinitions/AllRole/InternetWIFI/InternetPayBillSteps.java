package starter.stepdefinitions.AllRole.InternetWIFI;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.AllRole.InternetWIFI.InternetPayBill;

public class InternetPayBillSteps {
    @Steps
    InternetPayBill internetPayBill;
    //========================================== Internet-Pay-Bill-01 =========================================
    @Given("User have endpoint auth login for internet pay bill")
    public void userHaveEndpointAuthLoginForInternetPayBill() { internetPayBill.haveEndpointAuth();
    }

    @When("User send endpoint auth for internet pay bill and get token")
    public void userSendEndpointAuthForInternetPayBillAndGetToken() { internetPayBill.sendEndpointAuthandGetToken();
    }

    @Then("User set internet pay bill endpoint")
    public void userSetInternetPayBillEndpoint() { internetPayBill.setAPIEndpoint();
    }

    @Then("User send HTTP request for internet pay bill")
    public void userSendHTTPRequestForInternetPayBill() { internetPayBill.sendHTTPRequest();
    }

    @And("User received valid HTTP response code {int} for internet pay bill")
    public void userReceivedValidHTTPResponseCodeForInternetPayBill(int arg0) { internetPayBill.receivedValidHTTPResponseCode();
    }

    @And("User received message success : Successfully pay bill")
    public void userReceivedMessageSuccessSuccessfullyPayBill() { internetPayBill.iReceivedValidDataMessageSuccess();
    }
    //================================= Internet Pay Bill 02 ==========================================================
    @Then("User send HTTP request for internet pay bill with paid id")
    public void userSendHTTPRequestForInternetPayBillWithPaidId() { internetPayBill.sendHTTPRequestpaidid();
    }

    @And("User received invalid HTTP response code {int} for internet pay bill")
    public void userReceivedInvalidHTTPResponseCodeForInternetPayBill(int arg0) { internetPayBill.receivedinValidHTTPResponseCodepaidid();
    }

    @And("User received message eror for internet pay : this month's bill has been paid")
    public void userReceivedMessageErorForInternetPayThisMonthSBillHasBeenPaid() { internetPayBill.iReceivedValidDataErorMessage();
    }
    //=========================================== Internet Pay Bill 03 ===============================================

    @Then("User send HTTP request for internet pay bill with invalid id")
    public void userSendHTTPRequestForInternetPayBillWithInvalidId() {
        internetPayBill.sendinvalidHTTPRequestwithinvalidid();
    }

    @And("User received message eror for internet pay : record not found")
    public void userReceivedMessageErorForInternetPayRecordNotFound() {
        internetPayBill.iReceivedValidDataMessageErrorninvalidid();
    }
    //=========================================== Internet Pay Bill 04 ============================================

    @And("User received invalid HTTP response code {int} for internet pay bill because not login")
    public void userReceivedInvalidHTTPResponseCodeForInternetPayBillBecauseNotLogin(int arg0) {
        internetPayBill.receivedinValidHTTPResponseCodebecausenotlogin();
    }

    @And("User received message eror for internet pay : missing or malformed jwt")
    public void userReceivedMessageErorForInternetPayMissingOrMalformedJwt() {
        internetPayBill.iReceivedValidDataMessageErrorbecausenotlogin();
    }
}
