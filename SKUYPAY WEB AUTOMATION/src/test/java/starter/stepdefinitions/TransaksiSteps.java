package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.TransaksiPage;

public class TransaksiSteps {
    @Steps
    TransaksiPage transaksi;
    //============================================== Transaksi-01 ==========================================
    @Given("Admin melakukan login akun")
    public void adminMelakukanLoginAkun() {
        transaksi.diHomepageSkuyPay();
        transaksi.inputfieldemail("capstoneprojectalta@gmail.com");
        transaksi.inputfieldpassword("kelompok10");
        transaksi.klikbuttonmasuk();
    }

    @When("Pada Beranda, Admin klik Transaksi")
    public void padaBerandaAdminKlikTransaksi() {
        transaksi.klikmenutransaksi();
    }

    @And("Admin klik Semua")
    public void adminKlikSemua() {
        transaksi.pilihitemsemua();
        transaksi.adastatusgagal();
        transaksi.adastatusselesai();
    }
    //============================================ Transaksi-02 ===========================================
    @And("Admin klik Selesai")
    public void adminKlikSelesai() { transaksi.pilihitemselesai();
    }
    //============================================ Transaksi-03 ===========================================
    @And("Admin klik Gagal")
    public void adminKlikGagal() { transaksi.pilihitemgagal();
    }
    //============================================ Transaksi-04 ===========================================
    @And("Admin klik field cari")
    public void adminKlikFieldCari() { transaksi.klikcaritransaksi();
    }

    @Then("Admin input field cari")
    public void adminInputFieldCari() { transaksi.inputfieldcaritransaksi("Konello");
    }

    @And("Admin klik enter dan terlihat hasil pencarian")
    public void adminKlikEnter() { transaksi.entercaritransaksi();
    }
}
