package test.automation.driver;

import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidDriverPool {
    private static AndroidDriver driver;

    public static AndroidDriver create() {
        String appiumUrl = "http://127.0.0.1:4723/wd/hub/";
        driver = null;

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME, "Android");

        caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
      /*  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "PIXEL 3 API 31"); */
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        caps.setCapability(MobileCapabilityType.NO_RESET, false);
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "app/app-debug.apk");
//        caps.setCapability(String.valueOf(Setting.WAIT_FOR_IDLE_TIMEOUT), 100);


        try {
            driver = new AndroidDriver(new URL(appiumUrl), caps);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

    public static void pressBack() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}
