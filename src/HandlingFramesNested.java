import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame_middle']")));
	

	}

}
