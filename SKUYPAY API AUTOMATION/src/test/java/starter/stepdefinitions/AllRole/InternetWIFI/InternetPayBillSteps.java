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
}
