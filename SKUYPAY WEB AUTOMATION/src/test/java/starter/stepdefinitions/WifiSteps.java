package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PulsanPaketData;
import starter.pages.WifiPage;

public class WifiSteps {
    @Steps
    WifiPage wifiPage;
    //==================================== WIFI 01 ====================================================
    @Given("Admin melakukan login akun untuk fitur wifi")
    public void adminMelakukanLoginAkunUntukFiturWifi() {
        wifiPage.diHomepageSkuyPay();
        wifiPage.inputfieldemail("admin@mail.com");
        wifiPage.inputfieldpassword("12345678");
        wifiPage.klikbuttonmasuk();

    }

    @When("Pada Beranda, Admin klik Layanan untuk fitur wifi")
    public void padaBerandaAdminKlikLayananUntukFiturWifi() { wifiPage.klikmenulayanan();
    }

    @And("Admin klik Wifi")
    public void adminKlikWifi() { wifiPage.klikwifi();
    }

    @Then("Admin klik button + tambah wifi")
    public void adminKlikButtonTambahWifi() { wifiPage.kliktambahwifi();
    }

    @And("Admin input kode wifi")
    public void adminInputKodeWifi() { wifiPage.inputfieldkodewifi("WIFI3");
    }

    @Then("Admin input jenis wifi")
    public void adminInputJenisWifi() { wifiPage.inputfieldjeniswifi("Indihome");
    }

    @And("Admin klik button simpan dan muncul pop up berhasil ditambahkan wifi")
    public void adminKlikButtonSimpanDanMunculPopUpBerhasilDitambahkanWifi() { wifiPage.klikbuttonsimpandanmunculpopupberhasil();
    }
}
