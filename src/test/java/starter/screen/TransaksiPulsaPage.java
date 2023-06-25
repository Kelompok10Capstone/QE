package starter.screen;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import starter.pageobject.BasePageObject;

public class TransaksiPulsaPage extends BasePageObject {
    private By tombolMasuk() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"login\"]");
    }
    private By emailField() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"email\"]");
    }

    private By passwordField() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"passwordg\"]");
    }

    private By btnLogin() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");
    }

    private By clickPulsadata() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Datapulsa\"]");
    }

    private By nomorHPfield() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"noHP\"]");
    }

    private By lanjutkanBtn() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
    }

    private By paymentPage() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"paymentPage\"]");
    }

    public void clickTombolMasuk() {
        onClick(tombolMasuk());
    }

    public void clickEmailField() {
        onClick(emailField());
    }

    public void EmailField(String email) {
        onType(emailField(), email);
    }

    public void clickPasswordField() {
        onClick(passwordField());
    }

    public void inputPasswordField(String password) {
        onType(passwordField(), password);
    }

    public void clickTombolLogin() {
        onClick(btnLogin());
    }

    public void clickMenuPulsaData() {
        onClick(clickPulsadata());
    }

    public void clickNomorHandphoneField() {
        onClick(nomorHPfield());
    }

    public void inputNomorHandphoneField(String nomorHP) {
        onType(nomorHPfield(), nomorHP);
    }

    public void clickLanjutkanBtn() {
        onClick(lanjutkanBtn());
    }

    public void onPaymentPage() {
        waitUntilVisible(paymentPage());
    }
}
