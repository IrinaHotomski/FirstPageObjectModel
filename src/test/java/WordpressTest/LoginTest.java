package WordpressTest;

import WordpressBase.WordpressBaseTest;
import WordpressPages.WordpressHomePage;
import WordpressPages.WordpressLoginPage;
import WordpressPages.WordpressProfilePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends WordpressBaseTest {

    @BeforeMethod
    public void pageSetUp (){

        driver.manage().window().maximize();
        driver.navigate().to("https://wordpress.com/");
        wordpressHomePage = new WordpressHomePage(driver, wait);
        wordpressLoginPage = new WordpressLoginPage(driver, wait);
        wordpressProfilePage = new WordpressProfilePage(driver,wait);
    }

    @Test
    public void userCanLogin () throws InterruptedException {

        wordpressHomePage.clickOnLoginButton();
        waitForClickability(driver.findElement(By.id("usernameOrEmail")));
        wordpressLoginPage.insertUsername("irinahotomski");
        wordpressLoginPage.clickOnButton();
        waitForClickability(driver.findElement(By.id("password")));
        wordpressLoginPage.insertPassword("@pomorandze123");
        wordpressLoginPage.clickOnButton();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.cssSelector(".gravatar.masterbar__item-me-gravatar")).isDisplayed());

    }
}
