package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.RegisterScreen;
import test.automation.driver.AndroidDriverPool;

public class RegisterSteps {
    @Steps
    RegisterScreen register;
    @Given("user berada di welcome screen")
    public void userBeradaDiWelcomeScreen() { register.onWelcomeScreen();
    }

    @When("user klik lewati")
    public void userKlikLewati() { register.clickLewati();
    }

    @And("user berada di halaman register")
    public void userBeradaDiHalamanRegister() { register.onRegisterPage();
    }
    @And("user click field nama")
    public void userClickFieldNama() {register.clickNama();
    }
    @And("user input nama")
    public void userInputNama() { register.inputNama();
        AndroidDriverPool.pressBack();
    }
    @And("user click field Email")
    public void userClickFieldEmail() { register.clickEmail();
    }
    @And("user input email")
    public void userInputEmail() { register.inputEmail();
        AndroidDriverPool.pressBack();
    }
    @And("user click field no hp")
    public void userClickFieldNoHp() { register.clicknoHP();
    }
    @And("user input no hp")
    public void userInputNoHp() { register.inputNoHP();
        AndroidDriverPool.pressBack();
    }
    @And("user click field kata sandi")
    public void userClickFieldKataSandi() { register.clickKataSandi() ;
    }
    @And("user input kata sandi")
    public void userInputKataSandi() { register.inputKataSandi();
        AndroidDriverPool.pressBack();
    }
    @And("user click field ketik ulang kata sandi")
    public void userClickFieldKetikUlangKataSandi() { register.clickUlangKataSandi();
    }
    @And("user input ketik ulang kata sandi")
    public void userInputKetikUlangKataSandi() { register.ketikUlangKataSandi();
        AndroidDriverPool.pressBack();
    }

    @Then("user klik tombol daftar")
    public void userKlikTombolDaftar() { register.clickDaftar();
    }

    @And("terdapat validasi berhasil mendaftar")
    public void userBerhasilDaftarDanBerhasilMenujuHalamanLogin() { register.validasiBerhasilmendaftar();
    }

    @And("user input nama kosong")
    public void userInputNamaKosong() { register.namaKosong();
        AndroidDriverPool.pressBack();
    }

    @And("user input email kosong")
    public void userInputEmailKosong() { register.emailKosong();
        AndroidDriverPool.pressBack();
    }

    @And("terdapat validasi harus mengisikan nama")
    public void terdapatValidasiHarusMengisikanNama() { register.validasiNamaKosong();
    }

    @And("terdapat validasi harus mengisikan email")
    public void terdapatValidasiHarusMengisikanEmail() { register.validasiEmailKosong();
    }

    @And("user input no hp kosong")
    public void userInputNoHpKosong() { register.NoHPkosong();
        AndroidDriverPool.pressBack();
    }

    @And("terdapat validasi harus mengisikan no hp")
    public void terdapatValidasiHarusMengisikanNoHp() { register.validasiNoHPkosong();
    }

    @And("user input email yang sudah terdaftar")
    public void userClickFieldEmailYangSudahTerdaftar() { register.inputEmailSudahTerdaftar();
        AndroidDriverPool.pressBack();
    }

    @And("terdapat validasi email sudah terdaftar")
    public void terdapatValidasiEmailSudahTerdaftar() { register.validasiEmailSudahTerdaftar();
    }
    @And("user input kata sandi kosong")
    public void userInputKataSandiKosong() { register.inputKataSandiKosong();
        AndroidDriverPool.pressBack();
    }
    @And("terdapat validasi harus mengisikan kata sandi")
    public void terdapatValidasiHarusMengisikanKataSandi() { register.validasiKataSandiKosong();
    }
    @And("user input ketik ulang kata sandi kosong")
    public void userInputKetikUlangKataSandiKosong() { register.inputKetikUlangKataSandiKosong();
        AndroidDriverPool.pressBack();
    }
    @And("terdapat validasi harus mengisikan ketik ulang kata sandi")
    public void terdapatValidasiHarusMengisikanKetikUlangKataSandi() { register.validasiKetikUlangKataSandiKosong();
    }
    @And("user input kata sandi {int}")
    public void userInputKataSandi(int arg0) { register.inputKataSandiTidakCocok();
        AndroidDriverPool.pressBack();
    }

    @And("user input ketik ulang kata sandi {int}")
    public void userInputKetikUlangKataSandi(int arg0) { register.inputKetikUlangKataSandiTidakCocok();
        AndroidDriverPool.pressBack();
    }

    @And("user input kata sandi kurang dari {int} karakter")
    public void userInputKataSandiKurangDariKarakter(int arg0) { register.kataSandiKurang6Karakter();
        AndroidDriverPool.pressBack();
    }

    @And("user input ketik ulang kata sandi kurang dari {int} karakter")
    public void userInputKetikUlangKataSandiKurangDariKarakter(int arg0) { register.KetikUlangKataSandiKurang6Karakter();
        AndroidDriverPool.pressBack();
    }

    @And("terdapat validasi harus password tidak cocok")
    public void terdapatValidasiHarusPasswordTidakCocok() { register.validasiPasswordTidakCocok();
    }

    @And("terdapat validasi password kurang dari {int} karakter")
    public void terdapatValidasiPasswordKurangDariKarakter(int arg0) { register.validasiPasswordKurang6Karakter();
    }
}
