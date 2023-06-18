package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    @And("user klik kebijakan keamanan hingga terbuka screen kebijakan keamanan")
    public void userKlikKebijakanKeamananHinggaTerbukaScreenKebijakanKeamanan() { kebijakanKeamananScreen.klikKebijakanKeamanan();
    }
}
