package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;


public class KebijakanKeamananScreen extends BasePageObject {
    // =============================== Locator ===============================
    private By Lewati() {
        return AppiumBy.xpath(
                "//android.widget.Button[@content-desc=\"Lewati\"]");
    }
    private By Masuk() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Masuk\"]");
    }
    private By EmailField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    }
    private By PasswordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]");
    }
    private By buttonLanjutkan() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Lanjutkan\"]");
    }
    private By tabAkun() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Akun Tab 3 of 3\"]");
    }
    private By kebijakankeamanan() {
        return AppiumBy.xpath("//android.view.View[@content-desc=\"Kebijakan Keamanan\"]");
    }


    //=============================================== Functional ======================================================
    @Step
    public void onBoardingpageSkuyPay() {
        Assert.assertTrue(waitUntilVisible(Lewati()).isDisplayed());}
    @Step
    public void klikLewati() { onClick(Lewati());}
    @Step
    public void klikMasuk() { onClick(Masuk());}
    @Step
    public void inputemail(String email) {
        onClick(EmailField()); onType(EmailField(), email);
    }
    @Step
    public void inputpassword(String password) {
        onClick(PasswordField()); onType(PasswordField(), password);
    }
    @Step
    public void klikButtonLanjutkan() {onClick(buttonLanjutkan());}
    @Step
    public void klikTabAkun() {onClick(tabAkun());}
    @Step
    public void klikKebijakanKeamanan() {onClick(kebijakankeamanan());}



}