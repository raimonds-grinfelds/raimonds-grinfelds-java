package lekcijaAstoni;

import lekcijaAstoni.pageObjects.CheckoutPage;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProduktuPage;
import lekcijaAstoni.pageObjects.grozinsPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScanerisDivi {

    @Test
    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        WebDriver parluks;
        LoginPage loginPage = new LoginPage(parluks);
        ProduktuPage produktuLapa = new ProduktuPage(parluks);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        System.out.println("3. Doties uz grozu");
        grozinsPage grozaLapa = new grozinsPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(),"YOUR CART");

        System.out.println("4. Doties uz Checkout");
        grozaLapa.getCheckoutButton().click();

        System.out.println("5. Pārbaudīt, ka FirstName/LastName/Zip code ir obligāts");
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();

        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: First Name is required");

        checkoutLapa.inputFirstName("Juris");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: Last Name is required");

    }






}
