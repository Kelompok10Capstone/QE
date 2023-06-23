package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.TopUpPage;

public class TopUpSteps {
    @Steps
    TopUpPage topUpPage;
    //================================================== Top Up 01 ============================================

    @Given("Admin melakukan login akun untuk fitur top up")
    public void adminMelakukanLoginAkunUntukFiturTopUp() throws InterruptedException {
        topUpPage.diHomepageSkuyPay();
        topUpPage.inputfieldemail("admin@mail.com");
        topUpPage.inputfieldpassword("12345678");
        topUpPage.klikbuttonmasuk();

    }

    @When("Pada Beranda, Admin klik Layanan untuk fitur top up")
    public void padaBerandaAdminKlikLayananUntukFiturTopUp() throws InterruptedException {
        topUpPage.klikmenulayanan();
    }

    @And("Admin klik Top Up")
    public void adminKlikTopUp() throws InterruptedException {
        topUpPage.kliktopup();
    }

    @Then("Admin klik button + tambah Bank")
    public void adminKlikButtonTambahBank() throws InterruptedException {
        topUpPage.kliktambahbank();
    }

    @And("Admin input kode Bank")
    public void adminInputKodeBank() throws InterruptedException {
        topUpPage.inputfieldkodebank("002");
    }

    @Then("Admin input nama bank")
    public void adminInputNamaBank() throws InterruptedException {
        topUpPage.inputfieldnamabank("BRI");
    }

    @And("Admin upload gambar logo bank")
    public void adminUploadGambarLogoBank() throws InterruptedException {
        topUpPage.inputgambar();
    }

    @Then("Admin klik simpan dan muncul popup berhasil untuk top up")
    public void adminKlikSimpanDanMunculPopupBerhasilUntukTopUp() throws InterruptedException {
        topUpPage.klikbuttonsimpandanmunculpopupberhasil();
    }

    @And("Admin berada kembali ke halaman top up")
    public void adminBeradaKembaliKeHalamanTopUp() throws InterruptedException {
        topUpPage.kembalikehalamantopup();
    }
}
