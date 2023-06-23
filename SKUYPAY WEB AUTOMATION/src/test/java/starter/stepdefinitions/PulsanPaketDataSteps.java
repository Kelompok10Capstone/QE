package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PulsanPaketData;

public class PulsanPaketDataSteps {
    @Steps
    PulsanPaketData pulsanPaketData;
    @Given("Admin melakukan login akun untuk fitur pulsa dan paket data")
    public void adminMelakukanLoginAkunUntukFiturPulsaDanPaketData() {
        pulsanPaketData.diHomepageSkuyPay();
        pulsanPaketData.inputfieldemail("admin@mail.com");
        pulsanPaketData.inputfieldpassword("12345678");
        pulsanPaketData.klikbuttonmasuk();
    }

    @When("Pada Beranda, Admin klik Layanan untuk fitur pulsa dan paket data")
    public void padaBerandaAdminKlikLayananUntukFiturPulsaDanPaketData() {
        pulsanPaketData.klikmenulayanan();
    }

    @And("Admin klik Pulsa & Data")
    public void adminKlikPulsaData() {
        pulsanPaketData.klikpulsadanpaketdata();
    }

    @Then("Admin klik button + tambah Provider")
    public void adminKlikButtonTambahProvider() {
        pulsanPaketData.kliktambahprovider();
    }

    @And("Admin input kode Pulsa & Data")
    public void adminInputKodePulsaData() {
        pulsanPaketData.inputfieldkodepulsadandata("IND01");
    }

    @Then("Admin memilih provider")
    public void adminMemilihProvider() {
        pulsanPaketData.memilihprovider();
    }

    @And("Admin memilih tipe pulsa")
    public void adminMemilihTipePulsa() {
        pulsanPaketData.memilihtipe();
    }

    @Then("Admin input harga")
    public void adminInputHarga() {
        pulsanPaketData.inputharga("10.000");
    }

    @And("Admin input deskripsi")
    public void adminInputDeskripsi() { pulsanPaketData.inputdeskripsi("Pulsa indosat 10.000");
    }

    @Then("Admin pilih memilih status aktif")
    public void adminPilihMemilihStatusAktif() { pulsanPaketData.memilihstatusaktif();
    }

    @And("Admin klik button simpan dan muncul pop up berhasil ditambahkan")
    public void adminKlikButtonSimpanDanMunculPopUpBerhasilDitambahkan() { pulsanPaketData.klikbuttonsimpandanmunculpopupberhasil();
    }
}
