package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.BPJSpage;

public class BPJSsteps {
    @Steps
    BPJSpage BPJS;
    @Given("Admin melakukan login akun untuk fitur BPJS")
    public void adminMelakukanLoginAkunUntukFiturBPJS() throws InterruptedException {
        BPJS.diHomepageSkuyPay();
        BPJS.inputfieldemail("admin@mail.com");
        BPJS.inputfieldpassword("12345678");
        BPJS.klikbuttonmasuk();
    }

    @When("Pada Beranda, Admin klik Layanan untuk fitur BPJS")
    public void padaBerandaAdminKlikLayananUntukFiturBPJS() throws InterruptedException {
        BPJS.klikmenulayanan();
    }

    @And("Admin klik BPJS")
    public void adminKlikBPJS() throws InterruptedException {
        BPJS.klikbpjs();
    }

    @Then("Admin klik button + tambah BPJS")
    public void adminKlikButtonTambahBPJS() throws InterruptedException {
        BPJS.kliktambahbpjs();

    }

    @And("Admin input kode BPJS")
    public void adminInputKodeBPJS() throws InterruptedException {
        BPJS.inputfieldkodebpjs("BPJS30");
    }

    @Then("Admin input jenis BPJS")
    public void adminInputJenisBPJS() throws InterruptedException {
        BPJS.inputfieldjenisbps("BPJS Jaminan Keselamatan Kerja");
    }

    @And("Admin klik button simpan dan muncul pop up berhasil ditambahkan BPJS")
    public void adminKlikButtonSimpanDanMunculPopUpBerhasilDitambahkanBPJS() throws InterruptedException {
        BPJS.klikbuttonsimpandanmunculpopupberhasil();
    }

    @Then("produk berhasil ditambah dan kembali ke halaman BPJS")
    public void produkBerhasilDitambahDanKembaliKeHalamanBPJS() throws InterruptedException {
        BPJS.kembalikehalamanbpjs();
    }
}
