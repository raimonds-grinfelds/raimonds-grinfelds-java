package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

    WebDriver parluks;

    @BeforeMethod
    public void setupBrowser(){
        WebDriver parluks = new ChromeDriver();
        parluks.navigate().to("https://www.nba.com/");
    }

    @AfterMethod
    public void tearDownBrowser(){
        parluks.quit();
    }

    @Test
    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium Tests");
        WebDriver parluks = new ChromeDriver();
        parluks.navigate().to("https://www.nba.com/");
        parluks.manage().window().maximize();
        parluks.quit();

    }

    @Test
    public void testPageTitle(){
        WebDriver parluks = new ChromeDriver();
        parluks.get("https://www.nba.com/");
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums,"National Basketball Association");
        parluks.quit();

    }

    @Test
    public void testRandom(){

    }
}
