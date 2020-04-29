import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	}

}
