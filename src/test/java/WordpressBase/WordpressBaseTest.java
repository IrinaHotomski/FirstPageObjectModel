package WordpressBase;

import WordpressPages.WordpressHomePage;
import WordpressPages.WordpressLoginPage;
import WordpressPages.WordpressProfilePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class WordpressBaseTest {
    public WebDriver driver;
    public WebDriverWait wait;

    public WordpressHomePage wordpressHomePage;
    public WordpressLoginPage wordpressLoginPage;
    public WordpressProfilePage wordpressProfilePage;

    public void waitForClickability(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    @BeforeClass
    public void SetUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterClass
    public void TearDown (){
        driver.quit();
    }
}
