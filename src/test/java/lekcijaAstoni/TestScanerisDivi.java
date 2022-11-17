package lekcijaAstoni;

public class TestScanerisDivi {




    System.out.println("3. Doties uz grozu");
    CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(),"YOUR CART");
        System.out.println("4. Doties uz Checkout");
        grozaLapa.getCheckoutButton().click();


}
