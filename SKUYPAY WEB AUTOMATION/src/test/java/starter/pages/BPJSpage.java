package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class BPJSpage extends PageObject {

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
    private By bpjs() {
        return By.xpath("//a[@href=\"/admin/layanan/bpjs\"]");
    }
    private By tambahbpjs() {
        return By.xpath("//button[@class=\"btn btn-primary\"]");
    }

    private By kodebpjs() {
        return By.xpath("(//input[@type='text'])[1]");
    }

    private By jenisbpjs() {
        return By.xpath("(//input[@type='text'])[2]");
    }

    private By buttonsimpan() {
        return By.xpath("//button[normalize-space()='Simpan']");
    }

    private By popupberhasil() {
        return By.xpath("//body[@class=\"swa12-shown swa12-height-auto\"]");
    }
    private By halamanbpjs() {
        return By.xpath("//h1[contains(text(),'BPJS')]");
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
    public void diHomepageSkuyPay() throws InterruptedException {
        open();
        $(emailfield()).shouldBeVisible();
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldemail(String email) throws InterruptedException {
        $(emailfield()).click();
        $(emailfield()).type(email);
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldpassword(String password) throws InterruptedException {
        $(passwordfield()).click();
        $(passwordfield()).type(password);
        Thread.sleep(1500);
    }

    @Step
    public void klikbuttonmasuk() throws InterruptedException {
        $(masukbutton()).click();
        Thread.sleep(1500);
    }

    @Step
    public void klikmenulayanan() throws InterruptedException {
        $(layananmenu()).click();
        Thread.sleep(1500);
    }
    @Step
    public void klikbpjs() throws InterruptedException {
        $(bpjs()).click();
        Thread.sleep(1500);
    }
    @Step
    public void kliktambahbpjs() throws InterruptedException {
        $(tambahbpjs()).click();
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldkodebpjs(String kode) throws InterruptedException {
        $(kodebpjs()).click();
        $(kodebpjs()).type(kode);
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldjenisbps(String namajenis) throws InterruptedException {
        $(jenisbpjs()).click();
        $(jenisbpjs()).type(namajenis);
        Thread.sleep(1500);
    }

    @Step
    public void klikbuttonsimpandanmunculpopupberhasil() throws InterruptedException {
        $(buttonsimpan()).click();$(popupberhasil()).isVisible();
        Thread.sleep(1500);
    }
    @Step
    public void kembalikehalamanbpjs() throws InterruptedException {
        $(halamanbpjs()).shouldBeVisible();
        Thread.sleep(1500);
    }
    @Step
    public void klikbuttonsimpandantidakmunculpopupberhasil() throws InterruptedException {
        $(buttonsimpan()).click();$(popupberhasil()).shouldNotBeCurrentlyVisible();
        Thread.sleep(1500);
    }

}

