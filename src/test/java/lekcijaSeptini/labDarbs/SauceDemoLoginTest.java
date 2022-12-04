package lekcijaSeptini.labDarbs;


import lekcijaAstoni.pageObjects.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import paObjectsHomework.InventoryPage;

public class SauceDemoLoginTest extends BaseTest {


    @Test
    public void testLoginPageObjectExample() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdasd", "asdasdasda");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any " +
                "user in this service");
    }

    @Test
    public void testLoginWrongUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdasd", "asdasdasda");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any " +
                "user in this service");
    }

    @Test
    public void testLoginEmptyUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void testLoginEmptyUsernameAndFilledPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("", "asdasdasdas");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameAndEmptyPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("asdas", "");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
    }

    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        InventoryPage produktuLapa = new InventoryPage(parluks);

        wait.until(ExpectedConditions.visibilityOf(produktuLapa.getPageTitle()));
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

    }

}