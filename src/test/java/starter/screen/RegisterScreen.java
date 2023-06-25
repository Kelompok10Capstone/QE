package starter.screen;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import starter.pageobject.BasePageObject;

public class RegisterScreen extends BasePageObject {
    public String createRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public String createRandomNumber() {
        Faker faker = new Faker();
        return faker.phoneNumber().cellPhone();
    }

    public String password = "nisa123";
    public String password2 = "nisa123";
    public String password3 = "nisa";
    public String emailTerdaftar = "nisa@gmail.com";
    public String namaKosong = "";
    public String emailKosong = "";
    public String noHPkosong = "";
    public String passwordKosong = "";

    // ================================================== LOCATOR  =====================================
    private By WelcomeScreen() {
        return AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Teman yang memudahkan\n" +
                "Sekarang Skuypay bisa menjadi teman\n" +
                "anda dalam mengatur tagihan anda.\"]");
    }
    private By lewatiBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lewati\"]");
    }
    private By registerPage() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Daftar\"]");
    }
    private By NamaField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");
    }
    private By EmailField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
    }
    private By NomoHPfield() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
    }
    private By PasswordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");
    }
    private By ConfirmPasswordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]");
    }
    private By daftarBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");
    }
    private By validasiBerhasildaftar() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Berhasil Mendaftar\"]");
    }
    private By validasiNama() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Nama tidak boleh kosong\"]");
    }
    private By validasiEmail() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email tidak boleh kosong\"]");
    }
    private By validasiNoHP() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Nomor Hp tidak boleh kosong\"]");
    }
    private By ValidasiEmailSudahTerdaftar() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Email sudah terdaftar\"]");
    }

    private By ValidasiKataSandiKosong() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kata sandi tidak boleh kosong\"]");
    }
    private By ValidasiKetikUlangKataSandiKosong() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Ketik ulang kata sandi tidak boleh kosong\"]");
    }

    private By ValidasiPasswordTidakCocok() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kata Sandi tidak sama\"]");
    }

    private By ValidasiPasswordKurang6Karakter() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kata sandi minimal 6 karakter\"]");
    }

    // ================================================= FUNCTIONAL ===================================
    @Step
    public boolean onWelcomeScreen() {
        return waitUntilVisible(WelcomeScreen()).isDisplayed();
    }
    @Step
    public void clickLewati() {
        onClick(lewatiBtn());
    }
    @Step
    public void onRegisterPage() {
        waitUntilVisible(registerPage());
    }
    @Step
    public void clickNama() {
        onClick(NamaField());
    }
    @Step
    public void inputNama() {
        onType(NamaField(), createRandomName());
    }
    @Step
    public void clickEmail() {
        onClick(EmailField());
    }
    @Step
    public void inputEmail() {
        onType(EmailField(), createRandomName() + "@gmail.com");
    }
    @Step
    public void clicknoHP() {
        onClick(NomoHPfield());
    }
    @Step
    public void inputNoHP() {
        onType(NomoHPfield(), "+628" + createRandomNumber());
    }
    @Step
    public void clickKataSandi() {
        onClick(PasswordField());
    }
    @Step
    public void inputKataSandi() {
        onType(PasswordField(), password);
    }
    @Step
    public void clickUlangKataSandi() {
        onClick(ConfirmPasswordField());
    }
    @Step
    public void ketikUlangKataSandi() {
        onType(ConfirmPasswordField(), password2);
    }
    @Step
    public void clickDaftar() {
        onClick(daftarBtn());
    }
    @Step
    public void validasiBerhasilmendaftar() {
        waitUntilVisible(validasiBerhasildaftar());
    }
    @Step
    public void namaKosong() {
        onType(NamaField(), namaKosong);
    }
    @Step
    public void emailKosong() {
        onType(EmailField(), emailKosong);
    }
    @Step
    public void validasiNamaKosong() {
        waitUntilVisible(validasiNama());
    }
    @Step
    public void validasiEmailKosong() {
        waitUntilVisible(validasiEmail());
    }
    @Step
    public void NoHPkosong() {
        onType(NamaField(), noHPkosong);
    }
    @Step
    public void validasiNoHPkosong() {
        waitUntilVisible(validasiNoHP());
    }
    @Step
    public void inputEmailSudahTerdaftar() {
        onType(EmailField(), emailTerdaftar);
    }
    @Step
    public void validasiEmailSudahTerdaftar() {
        waitUntilVisible(ValidasiEmailSudahTerdaftar());
    }
    @Step
    public void inputKataSandiKosong() {
        onType(PasswordField(), passwordKosong);
    }
    @Step
    public void inputKetikUlangKataSandiKosong() {
        onType(ConfirmPasswordField(), passwordKosong);
    }
    @Step
    public void inputKataSandiTidakCocok() {
        onType(PasswordField(), password2);
    }
    @Step
    public void inputKetikUlangKataSandiTidakCocok() {
        onType(ConfirmPasswordField(), password3);
    }
    @Step
    public void kataSandiKurang6Karakter() {
        onType(PasswordField(), password3);
    }
    @Step
    public void KetikUlangKataSandiKurang6Karakter() {
        onType(ConfirmPasswordField(), password3);
    }
    @Step
    public void validasiKataSandiKosong() {
        waitUntilVisible(ValidasiKataSandiKosong());
    }
    @Step
    public void validasiKetikUlangKataSandiKosong() {
        waitUntilVisible(ValidasiKetikUlangKataSandiKosong());
    }
    @Step
    public void validasiPasswordTidakCocok() {
        waitUntilVisible(ValidasiPasswordTidakCocok());
    }
    @Step
    public void validasiPasswordKurang6Karakter() {
        waitUntilVisible(ValidasiPasswordKurang6Karakter());
    }
}
