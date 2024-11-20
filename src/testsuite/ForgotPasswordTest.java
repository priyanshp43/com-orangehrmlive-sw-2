package testsuite;

/**
 * 1. userShouldNavigateToForgotPasswordPageSuccessfully()
 * * click on the ‘Forgot your password’ link
 * * Verify the text ‘Reset Password’
 * * click on the ‘Cancel’ button
 * * Verify the text ‘Login’
 */

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.time.Duration;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
        String expectesText = "Reset Password";
        String actualText = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")).getText();
        Assert.assertEquals(expectesText, actualText);

        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[1]")).click();
        String expectedTextForLogin = "Login";
        String actualTextForLogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).getText();
        Assert.assertEquals(expectedTextForLogin, actualTextForLogin);


        //driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
//       // driver.findElement(By.linkText("Forgot your password?")).click();
//        String actualText = driver.findElement(By.tagName("h1")).getText();
//        Assert.assertEquals(actualText, "Reset Password");
//        driver.findElement(By.id("btnCancel")).click();
//        // Assuming there is a button with id 'btnCancel'
//        String loginText = driver.findElement(By.id("btnLogin")).getAttribute("value");
//        Assert.assertEquals(loginText, "LOGIN");


    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
