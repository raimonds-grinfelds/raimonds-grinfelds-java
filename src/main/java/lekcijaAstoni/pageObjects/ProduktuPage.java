package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProduktuPage {

    WebDriver parluks;
    WebDriverWait wait;

    private By pageTitle = By.cssSelector("span.title");
    private By cartButton = By.id("shopping_cart_container");

    public ProduktuPage(WebDriver parluks) {
        this.parluks = parluks;
        wait = new WebDriverWait(parluks, Duration.ofSeconds(10));
    }

    public WebElement getCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        return parluks.findElement(cartButton);
    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }

}
