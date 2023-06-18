package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PDAMPage extends PageObject {

    // =============================== Locator ===============================
    private By emailfield() {
        return By.xpath("//input[@class=\"form-control mb-4\"]");
    }

    private By passwordfield() {
        return By.xpath("//input[@class=\"form-control\" and @name=\"Kata Sandi*\"]");
    }

    private By masukbutton() {
        return By.xpath("//button[@class=\"col-12 button-login mt-4\" and @type=\"button\"]");
    }

    private By layananmenu() {
        return By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]");
    }
    private By pdam() {
        return By.xpath("//a[@href=\"/admin/layanan/pdam\"]");
    }
    private By tambahpdam() {
        return By.xpath("//button[@class=\"btn btn-primary\"]");
    }

    private By kodePDAMfield() {
        return By.xpath("//input[@name=\"Kode PDAM*\"]");
    }

    private By jenisPDAMfield() {
        return By.xpath("//input[@name=\"Jenis PDAM*\"]");
    }

    private By wilayahfield() {
        return By.xpath("//input[@name=\"Wilayah*\"]");
    }

    private By buttonsimpan() {
        return By.xpath("//button[@class=\"btn btn-primary\"]");
    }

    private By popupberhasil() {
        return By.xpath("//div[@class=\"swa12-popup swa12-modal swa12-show\"]");
    }

    private By cariPDAMfield() {
        return By.xpath("//input[@placeholder='Cari PDAM...']");
    }
    private By iconedit() {
        return By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[4]/a[1]/*[name()='svg'][1]");
    }

    private By popupberhasildiubah() {
        return By.xpath("//div[@class=\"swa12-container swa12-center swa12-backdrop-show\"]");
    }
    private By iconhapus() {
        return By.xpath("//tbody[2]/tr[1]/td[4]/a[2]//*[name()='svg']");
    }
    private By buttonhapus() {
        return By.xpath("//button[@class=\"swal2-confirm swal2-styled swal2-default-outline\"]");
    }
    private By buttonbatal() {
        return By.xpath("//button[@class=\"swal2-cancel swal2-styled swal2-default-outline\"]");
    }
    //=============================================== Functional ======================================================
    @Step
    public void diHomepageSkuyPay() {
        open();
        $(emailfield()).shouldBeVisible();
    }

    @Step
    public void inputfieldemail(String email) {
        $(emailfield()).click();
        $(emailfield()).type(email);
    }

    @Step
    public void inputfieldpassword(String password) {
        $(passwordfield()).click();
        $(passwordfield()).type(password);
    }

    @Step
    public void klikbuttonmasuk() {
        $(masukbutton()).click();
    }

    @Step
    public void klikmenulayanan() {
        $(layananmenu()).click();
    }
    @Step
    public void klikpdam() {
        $(pdam()).click();
    }
    @Step
    public void kliktambahpdam() {
        $(tambahpdam()).click();
    }

    @Step
    public void inputfieldkodepdam(String kode) {
        $(kodePDAMfield()).click();
        $(kodePDAMfield()).type(kode);
    }

    @Step
    public void inputfieldjenispdam(String namajenis) {
        $(jenisPDAMfield()).click();
        $(jenisPDAMfield()).type(namajenis);
    }

    @Step
    public void inputfieldwilayah(String wilayah) {
        $(wilayahfield()).click();
        $(wilayahfield()).type(wilayah);
    }

    @Step
    public void klikbuttonsimpandanmunculpopupberhasil() {
        $(buttonsimpan()).click();$(popupberhasil()).isVisible();
    }
    @Step
    public void klikbuttonsimpandantidakmunculpopupberhasil() {
        $(buttonsimpan()).click();$(popupberhasil()).shouldNotBeCurrentlyVisible();
    }
    @Step
    public void klikfieldcariPDAM() {
        $(cariPDAMfield()).click();
    }
    @Step
    public void inputfieldcariPDAM(String name) {
        $(cariPDAMfield()).type(name);
    }
    @Step
    public void entercariPDAM() {
        $(cariPDAMfield()).sendKeys(Keys.ENTER);
    }
    @Step
    public void klikiconeditPDAM() {
        $(iconedit()).click();
    }
    @Step
    public void klikbuttonsimpandanmunculpopupberhasildirubah() {
        $(buttonsimpan()).click();$(popupberhasildiubah()).isVisible();
    }
    @Step
    public void klikiconhapusPDAM() {
        $(iconhapus()).click();
    }
    @Step
    public void klikbuttonhapus() {
        $(buttonhapus()).click();
    }
    @Step
    public void klikbuttonbatal() {
        $(buttonhapus()).click();
    }
}

