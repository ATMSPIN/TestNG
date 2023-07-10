package testngclass2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PriorityMethod {
	
	
	WebDriver driver;
	
	
  @Test(priority=1)
  public void youtube() {
	  driver.get("https://www.youtube.com");
	  
	  }
  @Test(priority=0)
  public void google() {
	  driver.get("https://www.google.com");
	  
	  }
  
  @Test(priority=2)
  public void selenium() {
	  driver.get("https://www.selenium.dev");
	  
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
