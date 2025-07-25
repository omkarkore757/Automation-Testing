import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class youtubeAPP {
    public static void main(String[] args) {
        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open YouTube
        driver.get("https://www.youtube.com/");

        // Wait for the Shorts icon to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Updated XPath to locate the Shorts icon
        WebElement shortsIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//yt-icon[@icon='video-youtube-shorts']")));

        // Click on the Shorts icon
        
        shortsIcon.click();
       

        // Optional: Perform other actions with the browser

        // Close the browser
        driver.quit();
    }
}
