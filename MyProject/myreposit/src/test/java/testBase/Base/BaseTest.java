package testBase.Base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.Base.Base.BasePage;
import pages.Base.CRM.*;

import static common.Config.CLEAR_COOKIES_AND_STORIGE;
import static common.Config.HOLD_BROUSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.creatDriver();
    protected BasePage basePage = new BasePage(driver);
    protected Autorization autorization = new Autorization(driver);
    protected mainPage mainpage = new mainPage(driver);
    protected AddLid addLid = new AddLid(driver);

    protected CreateLid createLid = new CreateLid(driver);

    protected Deals deals = new Deals(driver);

@AfterTest
    public void clearCookiesandLocalStorges()
    {
        if(CLEAR_COOKIES_AND_STORIGE)
        {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    // Метод для закрытия браузера
    @AfterSuite(alwaysRun = true)
    public void close()
    {
        if(HOLD_BROUSER_OPEN)
        {
            driver.quit();
        }
    }






}
