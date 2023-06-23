package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class PulsanPaketData extends PageObject {

    // =============================== Locator ===============================
    private By emailfield() {
        return By.xpath("//input[@class=\"form-control mb-4\"]");
    }

    private By passwordfield() {
        return By.xpath("//input[@name='password']");
    }

    private By masukbutton() {
        return By.xpath("//button[@class=\"col-12 button-login mt-4\" and @type=\"button\"]");
    }

    private By layananmenu() {
        return By.xpath("//a[normalize-space()='Layanan']");
    }
    private By pulsanpaketdata() {
        return By.xpath("//a[@href=\"/admin/layanan/pulsadandata\"]");
    }
    private By tambahprovider() {
        return By.xpath("//button[@class=\"btn btn-primary\"]");
    }

    private By kodepulsandata() {
        return By.xpath("//input[1]");
    }

    private By provider() {
        return By.xpath("(//select)[1]");
    }

    private By namafield() {
        return By.xpath("//input[2]");
    }
    private By pilihtipe() {
        return By.xpath("(//select)[2]");
    }

    private By harga() {
        return By.xpath("//input[3]");
    }
    private By deskripsi() {
        return By.xpath("//textarea");
    }
    private By status() {
        return By.xpath("(//select)[3]");
    }
    private By buttonsimpan() {
        return By.xpath("//button[normalize-space()='Simpan']");
    }

    private By popupberhasil() {
        return By.xpath("//body[@class=\"swa12-shown swa12-height-auto\"]");
    }

    private By cariPDAMfield() {
        return By.xpath("//input[@placeholder='Cari Nama PDAM']");
    }
    private By iconedit() {
        return By.xpath("//tbody[1]/tr[1]/td[4]/a[1]//*[name()='svg']");
    }

    private By popupberhasildiubah() {
        return By.xpath("//div[@class=\"swa12-container swa12-center swa12-backdrop-show\"]");
    }
    private By iconhapus() {
        return By.xpath("//tbody[2]/tr[1]/td[4]/a[2]//*[name()='svg']//*[name()='path' and contains(@fill-rule,'evenodd')]");
    }
    private By buttonhapus() {
        return By.xpath("//button[@class=\"swal2-confirm delete-confirmButton swal2-styled\"]");
    }
    private By buttonbatal() {
        return By.xpath("//button[@class=\"swal2-cancel delete-cancelButton swal2-styled\"]");
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
    public void klikpulsadanpaketdata() {
        $(pulsanpaketdata()).click();
    }
    @Step
    public void kliktambahprovider() {
        $(tambahprovider()).click();
    }

    @Step
    public void inputfieldkodepulsadandata(String kode) {
        $(kodepulsandata()).click();
        $(kodepulsandata()).type(kode);
    }

    @Step
    public void memilihprovider() {
        $(provider()).selectByValue("Telkomsel");
    }

    @Step
    public void inputnamafield(String nama) {
        $(namafield()).click();
        $(namafield()).type(nama);
    }
    @Step
    public void memilihtipe() {
        $(pilihtipe()).selectByValue("pulsa");
    }
    @Step
    public void inputharga(String price) {
        $(harga()).click();
        $(harga()).type(price);
    }
    @Step
    public void inputdeskripsi(String description) {
        $(deskripsi()).click();
        $(deskripsi()).type(description);
    }
    @Step
    public void memilihstatusaktif() {
        $(status()).selectByValue("true");
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
        $(buttonbatal()).click();
    }
}

