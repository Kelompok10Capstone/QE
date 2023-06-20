package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.PDAMPage;

public class PDAMSteps {
    @Steps
    PDAMPage pdam;
    @Given("Admin melakukan login akun untuk fitur PDAM")
    public void adminMelakukanLoginAkunUntukFiturPDAM() {
        pdam.diHomepageSkuyPay();
        pdam.inputfieldemail("admin@mail.com");
        pdam.inputfieldpassword("12345678");
        pdam.klikbuttonmasuk();
    }

    @When("Pada Beranda, Admin klik Layanan")
    public void padaBerandaAdminKlikLayanan() { pdam.klikmenulayanan();
    }

    @And("Admin klik PDAM")
    public void adminKlikPDAM() { pdam.klikpdam();
    }

    @Then("Admin klik button + tambah PDAM")
    public void adminKlikButtonTambahPDAM() { pdam.kliktambahpdam();
    }

    @And("Admin input kode PDAM")
    public void adminInputKodePDAM() { pdam.inputfieldkodepdam("PDAM100");
    }

    @Then("Admin input jenis PDAM")
    public void adminInputJenisPDAM() { pdam.inputfieldjenispdam("PDAM Mojosongo");
    }

    @And("Admin input wilayah")
    public void adminInputWilayah() { pdam.inputfieldwilayah("Mojosongo");
    }

    @Then("Admin klik simpan dan muncul popup berhasil")
    public void adminKlikSimpan() { pdam.klikbuttonsimpandanmunculpopupberhasil();
    }
//=========================================== PDAM-02 =====================================================
    @And("Admin tidak input kode PDAM")
    public void adminTidakInputKodePDAM() { pdam.inputfieldkodepdam("");
    }

    @Then("Admin klik simpan dan muncul eror message kode PDAM wajib diisi")
    public void adminKlikSimpanDanMunculErorMessage() { pdam.klikbuttonsimpandantidakmunculpopupberhasil();
    }
    //======================================= PDAM-03 ========================================================
    @Then("Admin tidak input jenis PDAM")
    public void adminTidakInputJenisPDAM() { pdam.inputfieldjenispdam("");
    }

    @Then("Admin klik simpan dan muncul eror message jenis PDAM wajib diisi")
    public void adminKlikSimpanDanMunculErorMessageJenisPDAMWajibDiisi() { pdam.klikbuttonsimpandantidakmunculpopupberhasil();
    }
    //================================================ PDAM-04 =================================================
    @And("Admin tidak input field wilayah")
    public void adminTidakInputFieldWilayah() { pdam.inputfieldwilayah("");
    }

    @Then("Admin klik simpan dan muncul eror message wilayah wajib diisi")
    public void adminKlikSimpanDanMunculErorMessageWilayahWajibDiisi() { pdam.klikbuttonsimpandantidakmunculpopupberhasil();
    }
    //================================================== PDAM-05 =================================================
    @And("Admin klik field cari PDAM")
    public void adminKlikFieldCariPDAM() { pdam.klikfieldcariPDAM();
    }

    @Then("Admin input field cari PDAM")
    public void adminInputFieldCariPDAM() { pdam.inputfieldcariPDAM("Malang");
    }

    @And("Admin klik enter pada field cari PDAM dan terlihat hasil pencarian")
    public void adminKlikEnterPadaFieldCariPDAMDanTerlihatHasilPencarian() { pdam.entercariPDAM();
    }
    //================================================ PDAM-06 ==================================================
    @And("Admin klik icon edit pada salah satu produk")
    public void adminKlikIconEditPadaSalahSatuProduk() { pdam.klikiconeditPDAM();
    }

    @Then("Admin mengganti Nama jenis PDAM pada field jenis PDAM")
    public void adminMenggantiNamaJenisPDAMPadaFieldJenisPDAM() { pdam.inputfieldjenispdam("PDAM Mojosongo");
    }

    @And("Admin klik simpan dan muncul popup berhasil diubah")
    public void adminKlikSimpanDanMunculPopupBerhasilDiubah() { pdam.klikbuttonsimpandanmunculpopupberhasildirubah();
    }
    //=============================================== PDAM-07 ==================================================
    @Then("Admin mengganti wilayah PDAM pada field wilayah")
    public void adminMenggantiWilayahPDAMPadaFieldWilayah() { pdam.inputfieldwilayah("Mojosongo");
    }
    //==================================================== PDAM-08 =============================================
    @And("Admin klik icon hapus pada salah satu produk")
    public void adminKlikIconHapusPadaSalahSatuProduk() { pdam.klikiconhapusPDAM();
    }

    @Then("Admin klik hapus dan muncul notifikasi berhasil dihapus atau produk berkurang satu")
    public void adminKlikHapusDanMunculNotifikasiBerhasilDihapusAtauProdukBerkurangSatu() { pdam.klikbuttonhapus();
    }
    //==================================================== PDAM-09 =============================================
    @Then("Admin klik batal")
    public void adminKlikBatal() { pdam.klikbuttonbatal();
    }
}
