package WordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordpressHomePage {
    public WebDriver driver;
    public WebDriverWait wait;

    WebElement loginButton;

    public WordpressHomePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.linkText("Log In"));
    }


    //---------------------------------------------------

    public void clickOnLoginButton () throws InterruptedException {
        //Thread.sleep(20000);
        getLoginButton().click(); }
}
