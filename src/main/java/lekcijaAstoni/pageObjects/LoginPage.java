package lekcijaAstoni.pageObjects;



public class LoginPage {

    private By loginButton = By.id("login-button");

    public WebElement getLoginButton() {
        return parluks.findElement(loginButton);
        loginPage.getLoginButton().click();
        private By errorTextField = By.cssSelector("div.error-message-container h3");
        private By errorTextField = By.cssSelector("div.error-message-container h3");

        public String getErrorText () {
            return parluks.findElement(errorTextField).getText();
        }
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.getPasswordField().sendKeys("secret_sauce");
        loginPage.getUsernameField().sendKeys("asdasdasdas");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any " +
                "user in this service");

    }


}
