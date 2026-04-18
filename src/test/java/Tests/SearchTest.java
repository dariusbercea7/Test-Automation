package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPage;


public class SearchTest extends BaseTest {
    @Test(groups = {"smoke", "search"})
    public void TestDeCautare() {
        driver.get("https://apps.qualiadept.eu/hapiflix/login.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin("dariusbercea7@gmail.com", "test1234");
        HomePage homePage = new HomePage(driver);
        homePage.goToSearch();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.searchFor("Friends");
        Assert.assertTrue(searchPage.isResultDisplayed("Friends"));
    }

    @Test(groups = {"regression", "navigation"})
    public void TestDeNavigare(){
        driver.get("https://apps.qualiadept.eu/hapiflix/login.php");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.performLogin("dariusbercea7@gmail.com", "test1234");
        HomePage homePage = new HomePage(driver);
        homePage.goToShows();
        Assert.assertTrue(driver.getCurrentUrl().contains("shows"));

    }
}