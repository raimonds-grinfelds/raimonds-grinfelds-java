package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class grozinsPage {

    WebDriver driver;

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.className("title");

    public grozinsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButton);
    }
}
