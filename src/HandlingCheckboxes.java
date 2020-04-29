import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
				  WebDriver driver=new ChromeDriver();
				  driver.get("https://www.spicejet.com");
				  //select the checkbox senior citizen in spicejet.com
				  
				  System.out.println(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
				  driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
				  System.out.println(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
				  
				  //count the number of checkboxes in the entire page
				 System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
