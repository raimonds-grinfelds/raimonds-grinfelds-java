package paObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {


    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorTextField = By.cssSelector("div.error-message-container h3");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getUsernameField() {
        return driver.findElement(usernameInputField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordInputField);
    }

    public String getErrorText() {
        return driver.findElement(errorTextField).getText();
    }

}
