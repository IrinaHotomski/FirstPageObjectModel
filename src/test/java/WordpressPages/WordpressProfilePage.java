package WordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordpressProfilePage {
    WebDriver driver;
    WebDriverWait wait;

    WebElement profileName;

    public WordpressProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getProfileName() {
        return driver.findElement(By.className("site__title"));
    }

}
