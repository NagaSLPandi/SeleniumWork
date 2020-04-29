import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCartEC {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\laksh\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] items = { "Cucumber", "Brocolli", "Carrot" };
		int j = 0;
		// first list all the product names by selecting the product box
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));// got 30 items
		for (int i = 0; i <= products.size(); i++) {// getting each element from an array so it will be cuccumber -1 kg
													// but we want only cuccumber so we split the - and also trim the
													// space
			String name[] = products.get(i).getText().split("-");
			String formattedname = name[0].trim();

			List itemsNeededList = Arrays.asList(items);
			if (itemsNeededList.contains(formattedname)) {
				j++;
				// driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();// if
				// we write xpath for add to
				// cart after clicking the text
				// changes so we need to write
				// parent xpath and then to
				// child
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == items.length) {
					break;
				}
			}

		}
	}
}
