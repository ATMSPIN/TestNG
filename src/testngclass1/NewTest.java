package testngclass1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	
	
	
  @Test(priority=0)
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  
	
  @Test(priority=1)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
