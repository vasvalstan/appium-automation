import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class InstallApplication {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        UiAutomator2Options dc = new UiAutomator2Options();
        dc.setDeviceName("appium-phone");
        dc.setApp("C:\\Users\\User\\IdeaProjects\\appium\\SauceLabs.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), dc);

        Thread.sleep(5000);
        driver.quit();
    }
}
