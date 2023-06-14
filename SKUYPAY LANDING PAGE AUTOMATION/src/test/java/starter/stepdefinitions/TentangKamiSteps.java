package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.TentangKamiPage;

public class TentangKamiSteps {
    @Steps
    TentangKamiPage tentangkami;
    @When("User masuk ke halaman landing Page")
    public void userMasukKeHalamanLandingPage() {
        tentangkami.LandingPageSkuyPay();
    }

    @Then("User klik {string}")
    public void userKlik(String arg0) {
        tentangkami.klikTentangKami();
    }

    @And("Bergeser menuju section {string} di landing page")
    public void bergeserMenujuSectionDiLandingPage(String arg0) {
        tentangkami.bergeserketentangkami();
    }
}
