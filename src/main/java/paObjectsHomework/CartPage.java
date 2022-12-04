package paObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {


    private By buttonCheckout = By.id("checkout");
    private By productName = By.id("");
    private By productName1 = By.id("");
    private By productCount = By.className("");


    public CartPage(WebDriver driver) {
        super(driver);
    }
}
