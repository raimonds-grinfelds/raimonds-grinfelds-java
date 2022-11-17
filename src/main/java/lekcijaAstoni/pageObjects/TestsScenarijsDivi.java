package lekcijaAstoni.pageObjects;

import lekcijaAstoni.pageObjects.LoginPage
import lekcijaAstoni.pageObjects.
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestsScenarijsDivi extends BaseTest {

    @Test
    public void testCheckoutPageMandatoryFields(){
        System.out.println("1.Naviget uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu Lietotaja vardu/paroli");
        LoginPage loginPage = new LoginPage(parluks);
        ProductsPage produktuLapa = new ProductsPage(parluks);
        LoginPage.login("standart_user", "secret_sauce");
        Assert.assert


    }




}
