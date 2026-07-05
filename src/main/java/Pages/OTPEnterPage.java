package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class OTPEnterPage {

    AndroidDriver driver;
    public OTPEnterPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By otpDigits = By.xpath("//android.widget.TextView[@resource-id='com.truecaller:id/digit']");

    public void enterOTP(String otp) {
        char[] digits = otp.toCharArray();
        for(int i=0; i<digits.length; i++){
            driver.findElements(otpDigits).get(i).sendKeys(String.valueOf(digits[i]));
        }
    }
}
