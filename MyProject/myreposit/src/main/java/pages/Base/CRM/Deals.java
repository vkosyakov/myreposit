package pages.Base.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.Base.Base.BasePage;

public class Deals extends BasePage {
    public Deals(WebDriver driver) {
        super(driver);
    }

    private final By deals = By.xpath("//span[@class='main-buttons-item-text-box'][text()='Сделки']");
    private final By adddeals = By.xpath("//a[@class='ui-btn-main'][1]");
    private final By iFrame = By.xpath("//iframe[@src=\"/crm/deal/details/0/?category_id=4&IFRAME=Y&IFRAME_TYPE=SIDE_SLIDER\"]");

    private final By comment = By.xpath("//body[@contenteditable=\"true\"]");
    private final By namedeal = By.xpath("//input[@class=\"ui-ctl-element\"][@placeholder=\"Сделка #\"]");
    private final By numberproject= By.xpath("//input[@name=\"UF_CRM_1641832697\"]");
    private final By BtnSave = By.xpath("//button[@class='ui-btn ui-btn-success']");
    public Deals opendeals(){
        driver.findElement(deals).click();
        return this;
    }

    public Deals adddeals()
    {
        driver.findElement(adddeals).click();
        return this;
    }

    public Deals createdeals() {
        WebElement iframe = driver.findElement(iFrame);
        driver.switchTo().frame(iframe);
        driver.findElement(comment).sendKeys("Comment Test");
        driver.findElement(namedeal).sendKeys("123");
        driver.findElement(numberproject).sendKeys("1");
        driver.findElement(BtnSave).click();
        return this;
    }
    }








