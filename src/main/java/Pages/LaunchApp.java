package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LaunchApp {

    AndroidDriver driver;
    public LaunchApp(AndroidDriver driver) {
        this.driver = driver;
    }

    By nextButton = By.id("com.truecaller:id/nextButton");
    By truecallerOption = By.xpath("//*[@text='Truecaller']");
    By setDefaultButton = By.id("android:id/button1");
    By continueButton = By.id("android:id/button1");

    public void clickGetStarted() {
        driver.findElement(nextButton).click();
    }

    public void selectTruecallerDefault() {
        driver.findElement(truecallerOption).click();
        driver.findElement(setDefaultButton).click();
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

}
