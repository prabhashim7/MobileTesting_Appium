package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class PhoneNumberPage {

    AndroidDriver driver;
    public PhoneNumberPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By phoneNumberField = By.id("com.truecaller:id/phoneNumberEditText");
    By nextButton = By.id("com.truecaller:id/nextButton");
    By confirmButton = By.id("android:id/button1");

    public void enterPhoneNumber(String number) {
        driver.findElement(phoneNumberField).sendKeys(number);
    }

    public void clickNext() {
        driver.findElement(nextButton).click();
    }

    public void confirmNumber() {
        driver.findElement(confirmButton).click();
    }
}
