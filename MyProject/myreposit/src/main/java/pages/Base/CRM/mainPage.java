package pages.Base.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.Base.BasePage;

public class mainPage extends BasePage {

    public mainPage(WebDriver driver) {
        super(driver);
    }

    private final By CRM = By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/div[1]/div[2]/ul/li[3]/a");

    public mainPage inputcrm(){
        driver.findElement(CRM).click();
        return this;
    }
}


