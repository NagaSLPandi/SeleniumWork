import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  
				  driver.get("https://www.google.com");
				  driver.get("https://login.salesforce.com/?locale=au");
				  driver.findElement(By.id("username")).sendKeys("abcdef");
				  driver.findElement(By.name("pw")).sendKeys("12345");
				  //driver.findElement(By.id("Login")).click();
				  driver.findElement(By.xpath("//*[@id='Login']")).click();
				  System.out.println(driver.findElement(By.id("error")).getText());
				  
	}

}
