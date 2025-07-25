package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriLogin {

	private static final String WebDriverManager = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		/*driver.findElement(By.className("row mb0 err")).sendKeys("9620396616",Keys.TAB);
		driver.findElement(By.id("passwordField")).sendKeys("Omkar@9620",Keys.TAB);
		driver.findElement(By.className("waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform")).click();
		*/

	}

}
