package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

        public WebDriver parluks;
        WebDriverWait wait;

        @BeforeMethod
        public void setupBrowser() {
            parluks = new ChromeDriver();

            parluks.manage().window().maximize();
            wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
            parluks.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            parluks.navigate().to("https://www.saucedemo.com/");
        }

        @AfterMethod
        public void tearDownBrowser() {
            parluks.quit();

        }
    }
