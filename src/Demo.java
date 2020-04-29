import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//selenium code
		
		 System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		 /* 
		 * driver.get("https://www.google.com"); System.out.println(driver.getTitle());
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getPageSource());
		 * 
		 * 
		 * driver.get("https://facebook.com");
		 */
		
		// on firefox driver
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\laksh\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		/*
		 * driver.findElement(By.id("email")).sendKeys("lakshmi.lippi@gmail.com");
		 * driver.findElement(By.name("pass")).sendKeys("1636");
		 * driver.findElement(By.linkText("Forgotten account?")).click();
		 */
		
		driver.findElement(By.cssSelector("#email")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abcde");
		
	}

}
