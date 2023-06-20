package starter.stepdefinitions.auth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.api.auth.LoginUser;

public class LoginUserSteps {
    @Steps
    LoginUser login;
    @Given("I set login api endpoint for login feature")
    public void iSetLoginApiEndpointForLoginFeature() { login.iSetLoginApiEndpoints();

    }

    @When("I send login HTTP request for login feature")
    public void iSendLoginHTTPRequestForLoginFeature() { login.iSendPOSTHTTPRequest();

    }

    @Then("I received valid HTTP response code {int} for login")
    public void iReceivedValidHTTPResponseCodeForLogin(int arg0) { login.iReceiveValidHTTPResponseCode();
    }

    @Then("I received valid data for login")
    public void iReceivedValidDataForLogin() { login.iReceiveValidData();
    }
//=========================================== Login-02 ==========================================================
    @When("I send login HTTP request with invalid data for login feature")
    public void iSendLoginHTTPRequestWithInvalidDataForLoginFeature() { login.iSendPOSTHTTPRequestwithinvaliddataforloginfeature();
    }

    @Then("I received invalid HTTP response code {int} for login")
    public void iReceivedValidHTTPResponseCodeForLoginBecauseInvalidPassword(int arg0) { login.iReceiveInvalidHTTPResponse();
    }

    @Then("I received error message : invalid email or password")
    public void iReceivedErrorMessageInvalidEmailOrPassword() { login.iReceiveerrormessageinvalidemailorpasword();
    }
//====================================================== Login-03 =================================================
    @When("I send login HTTP request with invalid email not registered")
    public void iSendLoginHTTPRequestWithInvalidEmailNotRegistered() { login.iSendPOSTHTTPRequestwithinvalidemailnotregistered();
    }

    @Then("I received error message : user not found")
    public void iReceivedErrorMessageUserNotFound() { login.iReceiveerrormessageusernotfound();
    }
    //====================================================== Login-04 =================================================
    @When("I send login HTTP request with no input email")
    public void iSendLoginHTTPRequestWithNoInputEmail() { login.iSendPOSTHTTPRequestwithnoinputemail();
    }

    @Then("I received error message : email field is required")
    public void iReceivedErrorMessageEmailFieldIsRequired() {login.iReceiveerrormessageemailfieldisrequired();
    }
    //====================================================== Login-05 =================================================
    @When("I send login HTTP request with no input password")
    public void iSendLoginHTTPRequestWithNoInputPassword() { login.iSendPOSTHTTPRequestwithnoinputpassword();
    }

    @Then("I received error message : password field is required")
    public void iReceivedErrorMessagePasswordFieldIsRequired() { login.iReceiveerrormessagepasswordfieldisrequired();
    }
}
