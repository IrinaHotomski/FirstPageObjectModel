package WordpressPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WordpressLoginPage {
    WebDriver driver;
    WebDriverWait wait;

    WebElement username;
    WebElement submitButton;
    WebElement password;

    public WordpressLoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("usernameOrEmail"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.cssSelector(".button.form-button.is-primary"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    //---------------------------------------------------------------------

    public void insertUsername (String username){
        getUsername().clear();
        getUsername().sendKeys(username);
    }

    public void clickOnButton (){
        getSubmitButton().click();
    }

    public void insertPassword (String password){
        getPassword().clear();
        getPassword().sendKeys(password);
    }

}
