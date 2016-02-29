package src.main.java;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
	private AppiumDriver driver;
  @Test
  public void f() throws MalformedURLException {
	  //File app = new File("makemytrip-3.8.6.apk");
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("browserName", "Chrome");
//	  capabilities.setCapability("deviceName", "9ab0d64b");
	  capabilities.setCapability("deviceName", "Android");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("automationName", "Appium");
	  //capabilities.setCapability("app", app.getAbsolutePath());
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	  driver.get("http://www.google.com");
	  driver.close();
  }
}
