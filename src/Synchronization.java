import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] items = { "Cucumber", "Brocolli", "Carrot" };
		Thread.sleep(500);
		addItems(driver, items);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		// explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='promoBtn']")));
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	}

	public static void addItems(WebDriver driver, String[] items) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));// got 30 items
		for (int i = 0; i <= products.size(); i++) {// getting each element from an array so it will be cuccumber -1 kg
													// but we want only cuccumber so we split the - and also trim the
													// space
			String name[] = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List itemsNeededList = Arrays.asList(items);
			if (itemsNeededList.contains(formattedname)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == items.length) {
					break;
				}
			}
		}

	}

}
