import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // System.setProperty("webdriver.chrome.driver", "Drivers/msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        //  WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.co.il/");
        driver.quit();


    }
}
