package AutomationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkdinApp {

    public static void main(String[] args) throws Exception {
        // Set up ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to LinkedIn
        driver.get("https://www.linkedin.com/feed/");
        
        Thread.sleep(3000);
        
        driver.findElement(By.id("email-or-phone")).sendKeys("omkarkore757@gmail.com",Keys.TAB);
        driver.findElement(By.id("password")).sendKeys("Omkar@9620");
        driver.findElement(By.className("join-form__show-password-btn")).click();    
        driver.findElement(By.id("join-form-submit")).click();        
        Thread.sleep(5000);

        //driver.findElement(By.className("main__sign-in-link")).click();
        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }
}
