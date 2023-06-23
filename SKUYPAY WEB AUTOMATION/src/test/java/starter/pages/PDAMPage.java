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
        return By.xpath("//input[@name='password']");
    }

    private By masukbutton() {
        return By.xpath("//button[@class=\"col-12 button-login mt-4\" and @type=\"button\"]");
    }

    private By layananmenu() {
        return By.xpath("//a[normalize-space()='Layanan']");
    }
    private By pdam() {
        return By.xpath("//a[@href=\"/admin/layanan/pdam\"]");
    }
    private By tambahpdam() {
        return By.xpath("//button[@class=\"btn btn-primary\"]");
    }

    private By kodePDAMfield() {
        return By.xpath("//input[1]");
    }

    private By jenisPDAMfield() {
        return By.xpath("//input[2]");
    }

    private By wilayahfield() {
        return By.xpath("//input[3]");
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
    public void klikpdam() throws InterruptedException {
        $(pdam()).click();
        Thread.sleep(1500);
    }
    @Step
    public void kliktambahpdam() throws InterruptedException {
        $(tambahpdam()).click();
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldkodepdam(String kode) throws InterruptedException {
        $(kodePDAMfield()).click();
        $(kodePDAMfield()).type(kode);
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldjenispdam(String namajenis) throws InterruptedException {
        $(jenisPDAMfield()).click();
        $(jenisPDAMfield()).type(namajenis);
        Thread.sleep(1500);
    }

    @Step
    public void inputfieldwilayah(String wilayah) throws InterruptedException {
        $(wilayahfield()).click();
        $(wilayahfield()).type(wilayah);
        Thread.sleep(1500);
    }

    @Step
    public void klikbuttonsimpandanmunculpopupberhasil() throws InterruptedException {
        $(buttonsimpan()).click();$(popupberhasil()).isVisible();
        Thread.sleep(1500);
    }
    @Step
    public void klikbuttonsimpandantidakmunculpopupberhasil() throws InterruptedException {
        $(buttonsimpan()).click();$(popupberhasil()).shouldNotBeCurrentlyVisible();
        Thread.sleep(1500);
    }
    @Step
    public void klikfieldcariPDAM() throws InterruptedException {
        $(cariPDAMfield()).click();
        Thread.sleep(1500);
    }
    @Step
    public void inputfieldcariPDAM(String name) throws InterruptedException  {
        $(cariPDAMfield()).type(name);
        Thread.sleep(1500);
    }
    @Step
    public void entercariPDAM() throws InterruptedException  {
        $(cariPDAMfield()).sendKeys(Keys.ENTER);
        Thread.sleep(1500);
    }
    @Step
    public void klikiconeditPDAM() throws InterruptedException  {
        $(iconedit()).click();
        Thread.sleep(1500);
    }
    @Step
    public void klikbuttonsimpandanmunculpopupberhasildirubah() throws InterruptedException  {
        $(buttonsimpan()).click();$(popupberhasildiubah()).isVisible();
        Thread.sleep(1500);
    }
    @Step
    public void klikiconhapusPDAM() throws InterruptedException  {
        $(iconhapus()).click();
        Thread.sleep(1500);
    }
    @Step
    public void klikbuttonhapus() throws InterruptedException {
        $(buttonhapus()).click();
        Thread.sleep(1500);
    }
    @Step
    public void klikbuttonbatal() throws InterruptedException  {
        $(buttonbatal()).click();
        Thread.sleep(1500);
    }
}

