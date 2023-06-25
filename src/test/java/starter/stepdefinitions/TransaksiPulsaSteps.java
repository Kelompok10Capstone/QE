package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.screen.TransaksiPulsaPage;

public class TransaksiPulsaSteps {
    @Steps
    TransaksiPulsaPage transaksiPulsa;

    @And("user click tombol Masuk")
    public void userClickTombolMasuk() { transaksiPulsa.clickTombolMasuk();
    }

    @And("user click email field")
    public void userClickEmailField() { transaksiPulsa.clickEmailField();
    }

    @And("user input email field")
    public void userInputEmailField() { transaksiPulsa.EmailField("nisa12@gmail.com");
    }

    @And("user click password field")
    public void userClickPasswordField() { transaksiPulsa.clickPasswordField();
    }

    @And("user input password field")
    public void userInputPasswordField() { transaksiPulsa.inputPasswordField("nisa123");
    }

    @And("user click tombol Login")
    public void userClickTombolLogin() { transaksiPulsa.clickTombolLogin();
    }

    @And("user click menu Pulsa&Data")
    public void userClickMenuPulsaData() { transaksiPulsa.clickMenuPulsaData();
    }

    @And("user click nomor handphone field")
    public void userClickNomorHandphoneField() { transaksiPulsa.clickNomorHandphoneField();
    }

    @And("user input nomor handphone field")
    public void userInputNomorHandphoneField() { transaksiPulsa.inputNomorHandphoneField("6285708923454");
    }

    @And("user click tombol Lanjutkan")
    public void userClickTombolLanjutkan() { transaksiPulsa.clickLanjutkanBtn();
    }

    @And("user on Payment page")
    public void userOnPaymentPage() { transaksiPulsa.onPaymentPage();
    }
}
