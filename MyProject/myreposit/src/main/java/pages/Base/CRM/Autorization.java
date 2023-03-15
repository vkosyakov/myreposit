package pages.Base.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.Base.BasePage;

import static constants.Constant.Date.LOGIN;
import static constants.Constant.Date.PASSWORD;

public class Autorization extends BasePage {
    public Autorization(WebDriver driver) {
        super(driver);
    }

    private final By login = By.xpath("//*[@id=\"login-popup\"]/div/form/div[1]/div[1]/div/div[1]/input");
    private final By password = By.xpath("//*[@id=\"login-popup\"]/div/form/div[1]/div[1]/div/div[2]/input");
    private final By Voyti = By.xpath("//*[@id=\"login-popup\"]/div/form/div[2]/input");

    public Autorization autorizationbtr(){

        driver.findElement(login).sendKeys(LOGIN);
        driver.findElement(password).sendKeys(PASSWORD);
        driver.findElement(Voyti).click();
        return this;
    }
}

