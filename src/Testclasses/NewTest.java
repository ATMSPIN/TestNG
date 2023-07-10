package Testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
	
	
	
  @Test
  public void alertpopups() throws InterruptedException {
	  
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  Thread.sleep(5000);
	  
	         	
       driver.findElement(By.name("cusid")).sendKeys("12345");					
       driver.findElement(By.name("submit")).submit();	
	   Thread.sleep(5000);
	  
	  
	  driver.switchTo().alert().dismiss();
	  
	  driver.findElement(By.name("res")).click();
	  Thread.sleep(4000);
	  
	  
  }
  
 
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = new ChromeDriver();
	  
	 driver.manage().window().maximize(); 
  }
  

 
  }


