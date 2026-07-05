package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CountrySelectPage {

    AndroidDriver driver;
    public CountrySelectPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By countryArrow = By.xpath("(//android.widget.ImageButton[@resource-id='com.truecaller:id/text_input_end_icon'])[1]");
    By countryTextBox = By.id("com.truecaller:id/countryText");
    By searchButton = By.id("com.truecaller:id/search_button");
    By searchField = By.id("com.truecaller:id/search_src_text");

    public void selectCountry(String country) {
        driver.findElement(countryArrow).click();
        driver.findElement(countryTextBox).click();
        driver.findElement(searchButton).click();
        driver.findElement(searchField).sendKeys(country);
        driver.findElement(countryTextBox).click();
    }
}
