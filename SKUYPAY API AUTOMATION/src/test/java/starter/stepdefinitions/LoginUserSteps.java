package starter.stepdefinitions;

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
}
