package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.KebijakanKeamananScreen;

public class KebijakanKeamananSteps {
    @Steps
    KebijakanKeamananScreen kebijakanKeamananScreen;
    @Given("user telah login akun untuk fitur kebijakan keamanan")
    public void userTelahLoginAkunUntukFiturKebijakanKeamanan() {
        kebijakanKeamananScreen.onBoardingpageSkuyPay();
        kebijakanKeamananScreen.klikLewati();
        kebijakanKeamananScreen.klikMasuk();
        kebijakanKeamananScreen.inputemail("admin2@skuypay.com");
        kebijakanKeamananScreen.inputpassword("123456");
        kebijakanKeamananScreen.klikButtonLanjutkan();
    }

    @When("user klik akun untuk fitur kebijakan keamanan")
    public void userKlikAkunUntukFiturKebijakanKeamanan() { kebijakanKeamananScreen.klikTabAkun();
    }


    @Then("user klik kebijakan keamanan")
    public void userKlikKebijakanKeamanan() { kebijakanKeamananScreen.klikKebijakanKeamanan();
    }

    @And("user bisa melihat screen kebijakan keamanan")
    public void userBisaMelihatScreenKebijakanKeamanan() {
    }
}
