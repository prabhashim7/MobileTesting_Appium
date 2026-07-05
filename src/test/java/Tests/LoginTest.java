package Tests;

import Pages.*;
import base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void truecallerLogin() throws Exception {

        LaunchApp launchPage = new LaunchApp(driver);
        PermissionPage permissionsPage = new PermissionPage(driver);
        CountrySelectPage countryPage = new CountrySelectPage(driver);
        PhoneNumberPage phoneNumberPage = new PhoneNumberPage(driver);
        OTPEnterPage otpPage = new OTPEnterPage(driver);

        // Launch app & setup Truecaller as default
        launchPage.clickGetStarted();
        Thread.sleep(2000);
        launchPage.selectTruecallerDefault();
        launchPage.clickContinue();

        // Allow permissions
        permissionsPage.allowPermissions(4);
        permissionsPage.clickOk();

        // Select country
        countryPage.selectCountry("Sweden");

        // Enter phone number
        phoneNumberPage.enterPhoneNumber("0764546567");
        Thread.sleep(1500);
        phoneNumberPage.clickNext();
        phoneNumberPage.confirmNumber();

        // Enter OTP
        String otp = "123456";
        otpPage.enterOTP(otp);

        Thread.sleep(3000);
    }
}
