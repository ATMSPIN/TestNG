package timeoutkeys;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_5_TimeOut {
	
	WebDriver driver;
	
	
 @Test
  public void f() {
	  
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("Tirupati");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  
	  
  }
  
  
  
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	 driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
  }

}
