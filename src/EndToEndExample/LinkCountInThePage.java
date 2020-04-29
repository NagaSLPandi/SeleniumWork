package EndToEndExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountInThePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//minimize the scope of the link by creating a mini driver
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver=footerDriver.findElement(By.xpath("/table/tbody/tr/td[0]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		

	}

}
