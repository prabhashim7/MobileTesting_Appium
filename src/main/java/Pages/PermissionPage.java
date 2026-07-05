package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PermissionPage {

    AndroidDriver driver;

    public PermissionPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By allowButton = By.id("com.android.permissioncontroller:id/permission_allow_button");
    By okButton = By.id("android:id/button1");

    public void allowPermissions(int times) throws InterruptedException {
        for (int i = 0; i < times; i++) {
            driver.findElement(allowButton).click();
            Thread.sleep(1000);
        }
    }

    public void clickOk() {
        driver.findElement(okButton).click();
    }
}