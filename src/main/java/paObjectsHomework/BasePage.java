package paObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

        WebDriver driver;
        WebDriverWait wait;
        public BasePage(WebDriver driver) {
            this.driver = driver;
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        private By pageTitle = By.cssSelector("span.title");

        public WebElement getPageTitle(){
            return driver.findElement(pageTitle);
        }
    }

