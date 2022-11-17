package lekcijaSeptini.labDarbs;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest{
    WebDriver parluks;
    @BeforeMethod
    public void setupBrowser(){
        parluks = new ChromeDriver();
        parluks.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser(){

    }

    @Test
    public void testLoginEmptyUsernameAndPassword() throws InterruptedException{
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("asdas");

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys("qwerty123");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();


        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText,"Epic sadface: Username and password do not match any user in this service");


        Thread.sleep(5000);


    }








    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("asdas");

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys("qwerty123");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();


        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);

    }
}
