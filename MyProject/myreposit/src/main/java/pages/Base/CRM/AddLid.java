package pages.Base.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.Base.Base.BasePage;

public class AddLid extends BasePage{
    public AddLid(WebDriver driver) {
        super(driver);
    }
    private final By Lid = By.xpath("//*[@id=\"toolbar_lead_list_button_0_anchor\"]/a");



    public AddLid addLid(){
        driver.findElement(Lid).click();
        return this;
    }

}
