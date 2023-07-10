package actionsclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionClasses {
	WebDriver driver;
  @Test(enabled=false)
  public void Doubleclick() throws Exception {
	  
	  driver.get("http://seleniumlearn.com/double-click");
	  Thread.sleep(3000);
	  Actions act =new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().build().perform();
	  
	   }
  
  @Test(enabled=false)
  public void rightclick() throws Exception {
	  
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(3000);
	 Actions act =new Actions(driver);
	 act.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-387-1\"]/a"))).build().perform();
  }
	  
  @Test(enabled=true)
  public void draganddrop()  throws Exception {
  
	  driver.get("http://www.seleniumlearn.com/drag-and-drop-html");
	  Thread.sleep(3000);
	  
	  WebElement source = driver.findElement(By.id("draggable"));
	  
	  WebElement target = driver.findElement(By.id("droppable"));
	  
	  Actions act = new Actions(driver);
	  act.dragAndDrop(source, target).build().perform();
	  
	  }
  
  
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
