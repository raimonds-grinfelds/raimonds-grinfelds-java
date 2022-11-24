package lecijaDevini;

import lekcijaDevini.MainPage;
import lekcijaDevini.SearchResultsPage;
import lekcijaDevini.SignInModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class TestSearch extends BaseTest{
    @Test
    public void testSearchFunctionality() throws  InterruptedException{

        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("apelsini");
        Thread.sleep(5000);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        List<WebElement> searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(), 6);

        for (WebElement webElement : searchResultList){
            System.out.println(webElement.getText());
        }

        mainPage.searchProduct("burkani");
        searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(), 23);

    }

    @Test
    public void testRegistrationWindowClosesCorretly(){
        MainPage mainPage = new MainPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
        mainPage.clickSignInButton();

        SignInModal signInModal = new SignInModal(driver);
        signInModal.waitForSignInModalToAppear();
        signInModal.CloseButtonClick();


        Assert.assertEquals(signInModal.getModalWindow().size(), 0);




    }


}
