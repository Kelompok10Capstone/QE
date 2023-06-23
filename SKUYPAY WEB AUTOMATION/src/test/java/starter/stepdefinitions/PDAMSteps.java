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
    public void adminMelakukanLoginAkunUntukFiturPDAM() throws InterruptedException {
        pdam.diHomepageSkuyPay();
        pdam.inputfieldemail("admin@mail.com");
        pdam.inputfieldpassword("12345678");
        pdam.klikbuttonmasuk();
    }

    @When("Pada Beranda, Admin klik Layanan")
    public void padaBerandaAdminKlikLayanan() throws InterruptedException { pdam.klikmenulayanan();
    }

    @And("Admin klik PDAM")
    public void adminKlikPDAM() throws InterruptedException { pdam.klikpdam();
    }

    @Then("Admin klik button + tambah PDAM")
    public void adminKlikButtonTambahPDAM() throws InterruptedException { pdam.kliktambahpdam();
    }

    @And("Admin input kode PDAM")
    public void adminInputKodePDAM() throws InterruptedException { pdam.inputfieldkodepdam("PDAM-0005");
    }

    @Then("Admin input jenis PDAM")
    public void adminInputJenisPDAM() throws InterruptedException { pdam.inputfieldjenispdam("pdamkot.Surakarta");
    }

    @And("Admin input wilayah")
    public void adminInputWilayah() throws InterruptedException{ pdam.inputfieldwilayah("Jebres");
    }

    @Then("Admin klik simpan dan muncul popup berhasil")
    public void adminKlikSimpan() throws InterruptedException { pdam.klikbuttonsimpandanmunculpopupberhasil();
    }
//=========================================== PDAM-02 =====================================================
    @And("Admin tidak input kode PDAM")
    public void adminTidakInputKodePDAM() throws InterruptedException { pdam.inputfieldkodepdam("");
    }

    @Then("Admin klik simpan dan muncul eror message kode PDAM wajib diisi")
    public void adminKlikSimpanDanMunculErorMessage() throws InterruptedException { pdam.klikbuttonsimpandantidakmunculpopupberhasil();
    }
    //======================================= PDAM-03 ========================================================
    @Then("Admin tidak input jenis PDAM")
    public void adminTidakInputJenisPDAM() throws InterruptedException { pdam.inputfieldjenispdam("");
    }

    @Then("Admin klik simpan dan muncul eror message jenis PDAM wajib diisi")
    public void adminKlikSimpanDanMunculErorMessageJenisPDAMWajibDiisi() throws InterruptedException { pdam.klikbuttonsimpandantidakmunculpopupberhasil();
    }
    //================================================ PDAM-04 =================================================
    @And("Admin tidak input field wilayah")
    public void adminTidakInputFieldWilayah() throws InterruptedException { pdam.inputfieldwilayah("");
    }

    @Then("Admin klik simpan dan muncul eror message wilayah wajib diisi")
    public void adminKlikSimpanDanMunculErorMessageWilayahWajibDiisi() throws InterruptedException { pdam.klikbuttonsimpandantidakmunculpopupberhasil();
    }
    //================================================== PDAM-05 =================================================
    @And("Admin klik field cari PDAM")
    public void adminKlikFieldCariPDAM() throws InterruptedException { pdam.klikfieldcariPDAM();
    }

    @Then("Admin input field cari PDAM")
    public void adminInputFieldCariPDAM() throws InterruptedException { pdam.inputfieldcariPDAM("Bandung");
    }

    @And("Admin klik enter pada field cari PDAM dan terlihat hasil pencarian")
    public void adminKlikEnterPadaFieldCariPDAMDanTerlihatHasilPencarian() throws InterruptedException { pdam.entercariPDAM();
    }
    //================================================ PDAM-06 ==================================================
    @And("Admin klik icon edit pada salah satu produk")
    public void adminKlikIconEditPadaSalahSatuProduk() throws InterruptedException { pdam.klikiconeditPDAM();
    }

    @Then("Admin mengganti Nama jenis PDAM pada field jenis PDAM")
    public void adminMenggantiNamaJenisPDAMPadaFieldJenisPDAM() throws InterruptedException { pdam.inputfieldjenispdam("pdamkot.Surakarta");
    }

    @And("Admin klik simpan dan muncul popup berhasil diubah")
    public void adminKlikSimpanDanMunculPopupBerhasilDiubah()  throws InterruptedException { pdam.klikbuttonsimpandanmunculpopupberhasildirubah();
    }
    //=============================================== PDAM-07 ==================================================
    @Then("Admin mengganti wilayah PDAM pada field wilayah")
    public void adminMenggantiWilayahPDAMPadaFieldWilayah() throws InterruptedException { pdam.inputfieldwilayah("Jebres");
    }
    //==================================================== PDAM-08 =============================================
    @And("Admin klik icon hapus pada salah satu produk")
    public void adminKlikIconHapusPadaSalahSatuProduk() throws InterruptedException { pdam.klikiconhapusPDAM();
    }

    @Then("Admin klik hapus dan muncul notifikasi berhasil dihapus atau produk berkurang satu")
    public void adminKlikHapusDanMunculNotifikasiBerhasilDihapusAtauProdukBerkurangSatu() throws InterruptedException { pdam.klikbuttonhapus();
    }
    //==================================================== PDAM-09 =============================================
    @Then("Admin klik batal")
    public void adminKlikBatal() throws InterruptedException { pdam.klikbuttonbatal();
    }
}
