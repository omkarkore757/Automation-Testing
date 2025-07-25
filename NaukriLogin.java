package AutomationTesting;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriAppTesting {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?");
		driver.findElement(By.className("nI-gNb-lg-rg__register")).click();
		driver.findElement(By.id("name")).sendKeys("Omkar");
		driver.findElement(By.id("email")).sendKeys("omkarkore123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Omkar@123");
		driver.findElement(By.id("mobile")).sendKeys("9620396616");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)"); // To scroll down 
		 WebElement resumebut=driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		  resumebut.click();
		  //mention your file full path
		  String filename="C:\\Users\\Sagar\\OneDrive\\Desktop\\omkar_kore_CV";
		  //set content in clipboard
		  StringSelection filedetails=new StringSelection(filename);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filedetails,null);
		  Robot robot=new Robot(); //keyboard Action
		  robot.delay(1000);
		  //ctrl+v
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  //enter
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(3000);
		  
				driver.close();
		

			} 
}
