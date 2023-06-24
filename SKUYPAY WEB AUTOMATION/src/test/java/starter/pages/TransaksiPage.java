package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TransaksiPage extends PageObject {

    //==================================== Locator ==========================================================
    private By emailfield() {
        return By.xpath("//input[@class=\"form-control mb-4\"]");
    }
    private By passwordfield() {
        return By.xpath("//input[@name='password']");
    }

    private By masukbutton() {
        return By.xpath("//button[@class=\"col-12 button-login mt-4\" and @type=\"button\"]");
    }
    private By transaksimenu() {
        return By.xpath("//a[normalize-space()='Transaksi']");
    }
    private By itemsemua() {
        return By.xpath("//a[@data-rr-ui-event-key='semua']");
    }
    private By statusselesai() {
        return By.xpath("(//td[contains(text(),'successful')])[1]");
    }
    private By statusgagal() {
        return By.xpath("//td[@class=\"text-danger\" and text()=\"Gagal\"]");
    }
    private By itemselesai() {
        return By.xpath("//a[@id='react-aria7549791933-1-tab-selesai']");
    }
    private By itembelumbayar() {
        return By.xpath("//a[@data-rr-ui-event-key='proses']");
    }
    private By itemgagal() {
        return By.xpath("//a[@data-rr-ui-event-key='gagal']");
    }
    private By CariTransaksifield() {
        return By.xpath("//input[@placeholder=\"Cari Transaksi\"]");
    }



    //=============================================== Functional ======================================================
    @Step
    public void diHomepageSkuyPay() {
        open();
        $(emailfield()).shouldBeVisible();
    }
    @Step
    public void inputfieldemail (String email) {
        $(emailfield()).click(); $(emailfield()).type(email);
    }
    @Step
    public void inputfieldpassword (String password) {
        $(passwordfield()).click(); $(passwordfield()).type(password);
    }
    @Step
    public void klikbuttonmasuk() {
        $(masukbutton()).click();
    }
    @Step
    public void klikmenutransaksi() {
        $(transaksimenu()).click();
    }
    @Step
    public void pilihitemsemua() {
        $(itemsemua()).click();
    }
    @Step
    public void adastatusselesai() {
        $(statusselesai()).isVisible();
    }
    @Step
    public void adastatusgagal() {
        $(statusgagal()).isVisible();
    }
    @Step
    public void pilihitemselesai() {
        $(itemselesai()).click();
    }
    @Step
    public void pilihitemgagal() {
        $(itemgagal()).click();
    }
    @Step
    public void pilihitembelumbayar() {
        $(itembelumbayar()).click();
    }
    @Step
    public void klikcaritransaksi() {
        $(CariTransaksifield()).click();
    }
    @Step
    public void inputfieldcaritransaksi (String name) {
        $(CariTransaksifield()).type(name);
    }
    @Step
    public void entercaritransaksi() {
        $(CariTransaksifield()).sendKeys(Keys.ENTER);
    }
}