package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PromoPage;

public class PromoSteps {
    @Steps
    PromoPage promoPage;
    //============================================== Promo-01 ==================================================
    @Given("Admin melakukan login akun untuk fitur promo")
    public void adminMelakukanLoginAkunUntukFiturPromo() throws InterruptedException {
        promoPage.diHomepageSkuyPay();
        promoPage.inputfieldemail("admin@mail.com");
        promoPage.inputfieldpassword("12345678");
        promoPage.klikbuttonmasuk();
    }

    @When("Pada Beranda, Admin klik Layanan untuk fitur promo")
    public void padaBerandaAdminKlikLayananUntukFiturPromo() throws InterruptedException {
        promoPage.klikmenulayanan();
    }

    @And("Admin klik Promo")
    public void adminKlikPromo() throws InterruptedException {
        promoPage.klikpromo();
    }

    @Then("Admin klik button + tambah Promo")
    public void adminKlikButtonTambahPromo() throws InterruptedException {
        promoPage.kliktambahpromo();
    }

    @And("Admin input kode promo")
    public void adminInputKodePromo() throws InterruptedException {
        promoPage.inputfieldkodepromo("SKUYPAY30");
    }

    @Then("Admin input deskripsi promo")
    public void adminInputDeskripsiPromo() throws InterruptedException {
        promoPage.inputfielddeskripsi("Ini adalah kode promo diskon 50% BPJS");
    }

    @And("Admin upload gambar logo promo")
    public void adminUploadGambarLogoPromo() throws InterruptedException {
        promoPage.inputgambar();
    }
    @Then("Admin input nominal potongan")
    public void adminInputNominalPotongan() throws InterruptedException {
        promoPage.inputnominal("50000");
    }

    @Then("Admin klik simpan dan muncul popup berhasil nambah promo")
    public void adminKlikSimpanDanMunculPopupBerhasilNambahPromo() throws InterruptedException {
        promoPage.klikbuttonsimpandanmunculpopupberhasil();
    }

    @And("Admin berada kembali ke halaman promo")
    public void adminBeradaKembaliKeHalamanPromo() throws InterruptedException {
        promoPage.kembalikehalamanpromo();

    }


}
