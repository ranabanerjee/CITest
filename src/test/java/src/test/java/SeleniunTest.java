package src.test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniunTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver wd = new FirefoxDriver();
	  wd.get("https://www.google.com");
	  Thread.sleep(3000);
	  wd.close();
  }
}
