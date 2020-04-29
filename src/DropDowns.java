import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  driver.get("https://www.google.com");
				  driver.get("https://www.spicejet.com");
				  //handling dropdowns
				Select s= new Select(driver.findElement(By.id("divpaxinfo")));
			
				
				  
				  
	}

}
