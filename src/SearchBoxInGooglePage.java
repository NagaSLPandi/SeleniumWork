import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBoxInGooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
	//using parent to child traverse method
				  driver.get("https://www.google.com");
				 // driver.findElement(By.xpath("//div[@id='ntp-contents']/div/div/input")).sendKeys("hello");
				 driver.findElement(By.xpath("//div[@class='gb_Xc gb_Xa gb_Wc']/div/div/div[2]/a")).click();
	}

}



