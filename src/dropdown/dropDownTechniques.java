package dropdown;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class dropDownTechniques {
	
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  
	  driver.get("https://redmine.org/");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("Nikhila");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("nikhila1234");
	  Thread.sleep(3000);
	  
	  
	
	  
	  Select obj =new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
		obj.selectByValue("eu");	  
	  
	
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
