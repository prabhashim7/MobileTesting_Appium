package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.URL;

public class BaseTest {

        public static AndroidDriver driver;

        @BeforeClass
        public void setup() throws Exception {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("deviceName", "emulator-5554");
            caps.setCapability("avd", "Pixel_5");
            caps.setCapability("app", "C:\\Users\\prabh\\OneDrive\\Desktop\\True Caller\\truecaller-caller-id-and-spam-call-blocker-15-28-7.apk");
            caps.setCapability("appWaitActivity", "*");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
            Thread.sleep(15000); // Wait for app to launch
        }

        @AfterClass
        public void tearDown() {
            if(driver != null) {
                driver.quit();
            }
        }

}
