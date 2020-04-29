import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandligActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		// driver.findElement(By.id("twotabsearchtextbox"));

		// move to a selected element(accounts&login)
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		
		//sending the text hello key in search box in lower case but displaing in uppercase using shift+
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello")
				.build().perform();
		
		

	}

}
