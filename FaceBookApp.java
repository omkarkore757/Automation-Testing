package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class FaceBookApp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriverManager driver = new ChromeDriverManager();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		/*
		 * driver.findElement(By.id("email")).sendKeys("omkar kore",Keys.TAB);
		 * driver.findElement(By.id("pass")).sendKeys("Omi@123",Keys.ENTER);
		 */
		driver.findElement(By.className("_97w5")).click();
		driver.findElement(By.name("firstname")).sendKeys("Omkar", Keys.TAB);
		driver.findElement(By.name("lastname")).sendKeys("Kore", Keys.TAB);
		driver.findElement(By.name("reg_email__")).sendKeys("999999999", Keys.TAB);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Omi@123", Keys.TAB);
		WebElement ele = driver.findElement(By.id("day"));
		Select s1 = new Select(ele);// drop down selection we use select class
		s1.selectByIndex(3);
		WebElement ele1 = driver.findElement(By.id("month"));
		Select s2 = new Select(ele1);// drop down selection we use select class
		s2.selectByValue("4");
		WebElement ele2 = driver.findElement(By.id("year"));
		Select s3 = new Select(ele2);// drop down selection we use select class
		s3.selectByVisibleText("2018");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		

	}

}
