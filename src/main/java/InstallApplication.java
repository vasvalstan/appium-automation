import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class InstallApplication {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        System.out.println("Test");
        UiAutomator2Options dc = new UiAutomator2Options();
        dc.setDeviceName("appium-phone");
        dc.setApp("C:\\Users\\User\\IdeaProjects\\appium\\ApiDemos-debug.apk");
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), dc);

        Thread.sleep(5000);
        driver.quit();
    }
}
