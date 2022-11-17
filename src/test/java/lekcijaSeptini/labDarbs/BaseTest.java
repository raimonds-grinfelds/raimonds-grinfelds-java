package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest{

    public class SauceDemoProductTest extends BaseTest{


        @Test
        public void testAddProductToCart(){
            WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
            lietotajVardsIevadesLauks.sendKeys("standart user");

            WebElement passwordField = parluks.findElement(By.id("password"));
            passwordField.sendKeys("secret_sauce");

            WebElement loginPoga = parluks.findElement(By.id("login-button"));
            loginPoga.click();



        }
    }

        WebDriver parluks;
    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();

    }
}
