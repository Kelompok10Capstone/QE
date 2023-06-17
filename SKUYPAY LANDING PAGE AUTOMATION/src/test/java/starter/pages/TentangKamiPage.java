package starter.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TentangKamiPage extends PageObject {

    // =============================== Locator ===============================
    private By TentangKami() {
        return By.xpath("//body/div[@id='root']/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/li[3]/a[1]/a[1]");
    }
    private By DivTentangKami() {
        return By.xpath("//div[@class=\"justify-content-center d-flex row text-center \"]");
    }

    //=============================================== Functional ======================================================
    @Step
    public void LandingPageSkuyPay() {
        open();
        $(TentangKami()).shouldBeVisible();
    }
    @Step
    public void klikTentangKami() {
        $(TentangKami()).click();
    }
    @Step
    public void bergeserketentangkami() {
        $(DivTentangKami()).shouldBeVisible();
    }
}

