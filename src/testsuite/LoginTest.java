package testsuite;

/**
 * 1. userSholdLoginSuccessfullyWithValidCredentials()
 *
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on the ‘Login’ button
 * * Verify the ‘Dashboard’ text is displayed   
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";



    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
