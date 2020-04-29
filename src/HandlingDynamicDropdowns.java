import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDynamicDropdowns {
	


	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  driver.get("https://www.spicejet.com");
				  Thread.sleep(500);
				  //@departure city
				  WebElement element=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']"));
				  //element.sendKeys(Keys.CLEAR);
				  Select source=new Select(element);
				  source.selectByVisibleText("Bagdogra (IXB)");
				  element.sendKeys(Keys.ENTER);
				  
				  
				  
				  Thread.sleep(5000);
				  
				  //@arrival city
				  WebElement element1=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_destinationStation1']"));
				  element1.click();
				  Select destination=new Select(element1);
				  destination.selectByVisibleText("Colombo (CMB)");
				  
				  
					
	}

}
